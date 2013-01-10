package com.ebeer.shopgraph;



import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ebeer.shopgraph.service.ListingResponse;
import com.ebeer.shopgraph.service.RetreiveHomePageListings;


/**
 * Handles requests for the application home page.
 */
@Controller
public class SearchFormController {
	private static String page = "home";
	private static final Logger logger = LoggerFactory.getLogger(SearchFormController.class);
	
	
	@Resource(name = "RetreiveHomePageListings")
    private RetreiveHomePageListings retreiveHomePageListings;
	
	//this really should be getting read from an external source
	@ModelAttribute("regionList")
	public LinkedHashMap<String,String> getRegionList(){
		LinkedHashMap<String,String> list = new LinkedHashMap<String, String>();
		list.put("US", "United States");
		list.put("CA", "Canada");
		list.put("AU", "Australia");
		list.put("GB", "United Kingdom");
		list.put("DE", "Germany");
		list.put("FR", "France");
		list.put("NL", "Netherlands");
		list.put("IT", "Italy");
		list.put("ES", "Spain");
		return list;
	}
	
	/**
	 * processes get request - initial form setup
	 * @param model
	 * @return
	 * @throws ServletException
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String setUpForm( Model model) throws ServletException{
		logger.info("entering form setup");
		
		SearchFormModel formModel = new SearchFormModel();
		
		formModel = getDisplayInformation(SearchFormModel.DEFAULT_REGION);
 		
		model.addAttribute("searchRequest", formModel );
		return page;
	}
	
	/**
	 * processes POST request - validates input, makes backend api call and returns data to frontend
	 * 
	 * @param request
	 * @param response
	 * @param formModel
	 * @param model
	 * @return
	 * @throws ServletException
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String processRequest( HttpServletRequest request, HttpServletResponse response, HttpSession session,
			 @ModelAttribute("searchRequest") SearchFormModel formModel, Model model) 
					 throws ServletException, Exception {
		logger.info("entering process request");
		
		String test = formModel.getRegion();
		
		formModel = getDisplayInformation(formModel.getRegion());
	 	
		model.addAttribute("searchRequest", formModel );
		
		logger.info("data being sent back = " + formModel.toString());
		return page;
	}
	
	
	private SearchFormModel getDisplayInformation(String region){
		LinkedHashMap<String,String> regionList = getRegionList();
		SearchFormModel formModel = new SearchFormModel();
		try{
	 		Integer[] test = retreiveHomePageListings.getListingStats(region);
	 		formModel.setNumSelf(test[0]);
	 		formModel.setNumCollective(test[1]);
	 		formModel.setNumOther(test[2]);
	 		formModel.setSelectedRegionLabel(regionList.get(region));
	 	}
	 	catch (Exception e){
	 		logger.error(e.getMessage());
	 		formModel.setError(e.getMessage());
	 	}
		return formModel;
	}
}
