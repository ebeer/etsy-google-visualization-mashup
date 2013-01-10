package com.ebeer.shopgraph.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import com.ebeer.shopgraph.SearchFormController;

@Service ("RetreiveHomePageListings")
public class RetreiveHomePageListings {
		
	    private static final String ETSY_FEATURED_LISTINGS_URI =
	        "http://openapi.etsy.com/v2/public/featured_treasuries/listings/homepage_current?api_key={key}&region={region}&limit={limit}";
	    private static final int RESULT_LIMIT = 100;
	    private static final String SELF_MADE = "i_did";
	    private static final String COLLECTIVE_MADE = "collective";
	    private static final String OTHER_MADE = "someone_else";
	    
	    @Resource(name="RestTemplate")
	    private RestTemplate restTemplate;
	    private static final Logger logger = LoggerFactory.getLogger(RetreiveHomePageListings.class);
	    private String etsyApiKey;
	    
	    //set thru bean properties
	    public void setEtsyApiKey(String key){
	    	this.etsyApiKey = key;
	    }
	    
	    private ListingResponse getFeaturedListings(String region) throws RestClientException{
	    	return restTemplate.getForObject(ETSY_FEATURED_LISTINGS_URI, ListingResponse.class, etsyApiKey, region, RESULT_LIMIT);
	    }
	    
	    
	    /*
	     * makes api call to retreive etsy homepage for region
	     * returns integer array with the count of items for each source type
	     *  0 = self, 1= collective 2= someone else
	     */
	    public Integer[] getListingStats(String region) throws Exception{
	    	Integer[] listingSources = {0,0,0};
	    	ListingResponse result = getFeaturedListings(region);
	    	
	    	if (result != null){
	    		ArrayList<ItemListing> items = result.getResults();
		    	listingSources[0] = CollectionUtils.countMatches(items, new Predicate(){
		    	    public boolean evaluate(Object l){ return SELF_MADE.equals(((ItemListing) l).getWhoMade());}});
		    	
		    	listingSources[1] = CollectionUtils.countMatches(items, new Predicate(){
		    	    public boolean evaluate(Object l){ return COLLECTIVE_MADE.equals(((ItemListing) l).getWhoMade());}});
	    	
		    	listingSources[2] = CollectionUtils.countMatches(items, new Predicate(){
		    	    public boolean evaluate(Object l){ return OTHER_MADE.equals(((ItemListing) l).getWhoMade());}});
	    	}
	    	else {
	    		logger.error("unknown error - null result from api");
	    		throw new Exception ("oops!  something went wrong");
	    	}
	    	
	    	return listingSources;
	    	
	    }
}

