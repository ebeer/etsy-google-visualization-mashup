package com.ebeer.shopgraph.service;


import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListingResponse {
	private Integer count;
	private ArrayList<ItemListing> results;
	private String type;
	
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	public ArrayList<ItemListing> getResults() {
		return results;
	}
	public void setResults(ArrayList<ItemListing> results) {
		this.results = results;
	}
	
	
		
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
