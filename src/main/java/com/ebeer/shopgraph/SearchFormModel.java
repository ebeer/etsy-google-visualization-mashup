package com.ebeer.shopgraph;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


/*
 * model for all data sent to/from the search form
 */
public class SearchFormModel {
	
	public static String DEFAULT_REGION = "US";
	private static String LABEL_SELF ="Seller Made the Item";
	private static String LABEL_COLLECTIVE ="Seller's Collective or Group";
	private static String LABEL_OTHER="Item Made by Someone Other Than Seller";
	private String region;
	private int numSelf;
	private int numCollective;
	private int numOther;
	private String error;
	private String selectedRegionLabel;
	private String chartTitle = "Home Page Item Sources for ";
	
	public String getChartTitle (){
		return chartTitle + selectedRegionLabel;
		
	}
	
	public String getSelfLabel(){
		return LABEL_SELF;
	}
	
	public String getCollectiveLabel(){
		return LABEL_COLLECTIVE;
	}
	public String getOtherLabel(){
		return LABEL_OTHER;
	}
	
	public String getSelectedRegionLabel() {
		return selectedRegionLabel;
	}


	public void setSelectedRegionLabel(String selectedRegionLabel) {
		this.selectedRegionLabel = selectedRegionLabel;
	}


	public String getRegion() {
		return this.region;
	}
	
	
    public void setRegion(String region) {
		this.region = region;
	}

    public int getNumSelf() {
		return numSelf;
	}


	public void setNumSelf(int numSelf) {
		this.numSelf = numSelf;
	}
	
	public int getNumCollective() {
		return numCollective;
	}


	public void setNumCollective(int numCollective) {
		this.numCollective = numCollective;
	}

	public int getNumOther() {
		return numOther;
	}


	public void setNumOther(int numOther) {
		this.numOther = numOther;
	}

	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}

}
