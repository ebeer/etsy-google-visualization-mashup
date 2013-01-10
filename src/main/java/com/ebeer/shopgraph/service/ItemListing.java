package com.ebeer.shopgraph.service;

import org.codehaus.jackson.annotate.*;


public class ItemListing {

	private Long listingId;
	private String state;
	private Long userId;
	private Long categoryId;
	private String title;
	private String description;
	private float creationTsz;
	private float endingTsz;
	private float originalCreationTsz;
	private float lastModifiedTsz;
	private String price;
	private String currencyCode;
	private int	quantity;
	private String[] tags;
	private String[] categoryPath;
	private Long[] categoryPathIds;
	private String[] materials;
	private Long shopSectionId;
	private int	featuredRank;
	private float stateTsz;
	private String	url;
	private int	views;
	private int	numFavorers;
	private Long shippingTemplateId;
	private Long shippingProfileId;
	private int	processingMin;
	private int	processingMax;
	private String whoMade;
	private boolean	isSupply;
	private String whenMade; 
	private String recipient; 
	private String occasion; 	
	private String[] style;
	private boolean	nonTaxable;
	
	
	 @JsonProperty("listing_id")
	public Long getListingId() {
		return listingId;
	}

	 @JsonProperty("listing_id")
	public void setListingId(Long listingId) {
		this.listingId = listingId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("user_id")
	public Long getUserId() {
		return userId;
	}

	@JsonProperty("user_id")
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@JsonProperty("category_id")
	public Long getCategoryId() {
		return categoryId;
	}

	@JsonProperty("category_id")
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("creation_tsz")
	public float getCreationTsz() {
		return creationTsz;
	}
	@JsonProperty("creation_tsz")
	public void setCreationTsz(float creationTsz) {
		this.creationTsz = creationTsz;
	}

	@JsonProperty("ending_tsz")
	public float getEndingTsz() {
		return endingTsz;
	}
	@JsonProperty("ending_tsz")
	public void setEndingTsz(float endingTsz) {
		this.endingTsz = endingTsz;
	}

	@JsonProperty("original_creation_tsz")
	public float getOriginalCreationTsz() {
		return originalCreationTsz;
	}
	@JsonProperty("original_creation_tsz")
	public void setOriginalCreationTsz(float originalCreationTsz) {
		this.originalCreationTsz = originalCreationTsz;
	}

	@JsonProperty("last_modified_tsz")
	public float getLastModifiedTsz() {
		return lastModifiedTsz;
	}
	@JsonProperty("last_modified_tsz")
	public void setLastModifiedTsz(float lastModifiedTsz) {
		this.lastModifiedTsz = lastModifiedTsz;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@JsonProperty("currency_code")
	public String getCurrencyCcode() {
		return currencyCode;
	}
	@JsonProperty("currency_code")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	@JsonProperty("category_path")
	public String[] getCategoryPath() {
		return categoryPath;
	}
	@JsonProperty("category_path")
	public void setCategoryPath(String[] categoryPath) {
		this.categoryPath = categoryPath;
	}

	@JsonProperty("category_path_ids")
	public Long[] getCategoryPathIds() {
		return categoryPathIds;
	}
	@JsonProperty("category_path_ids")
	public void setCategoryPathIds(Long[] categoryPathIds) {
		this.categoryPathIds = categoryPathIds;
	}

	public String[] getMaterials() {
		return materials;
	}

	public void setMaterials(String[] materials) {
		this.materials = materials;
	}

	@JsonProperty("shop_section_id")
	public Long getShopSectionId() {
		return shopSectionId;
	}
	@JsonProperty("shop_section_id")
	public void setShopSectionId(Long shopSectionId) {
		this.shopSectionId = shopSectionId;
	}

	@JsonProperty("featured_rank")
	public int getFeaturedRank() {
		return featuredRank;
	}
	@JsonProperty("featured_rank")
	public void setFeaturedRank(int featuredRank) {
		this.featuredRank = featuredRank;
	}

	@JsonProperty("state_tsz")
	public float getStateTsz() {
		return stateTsz;
	}
	@JsonProperty("state_tsz")
	public void setStateTsz(float stateTsz) {
		this.stateTsz = stateTsz;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@JsonProperty("num_favorers")
	public int getNumFavorers() {
		return numFavorers;
	}
	@JsonProperty("num_favorers")
	public void setNumFavorers(int numFavorers) {
		this.numFavorers = numFavorers;
	}

	@JsonProperty("shipping_template_id")
	public Long getShippingTemplateId() {
		return shippingTemplateId;
	}
	@JsonProperty("shipping_template_id")
	public void setShippingTemplateId(Long shippingTemplateId) {
		this.shippingTemplateId = shippingTemplateId;
	}

	@JsonProperty("shipping_profile_id")
	public Long getShippingProfileId() {
		return shippingProfileId;
	}
	@JsonProperty("shipping_profile_id")
	public void setShippingProfileOd(Long shippingProfileId) {
		this.shippingProfileId = shippingProfileId;
	}

	@JsonProperty("processing_min")
	public int getProcessingMin() {
		return processingMin;
	}
	@JsonProperty("processing_min")
	public void setProcessingMin(int processingMin) {
		this.processingMin = processingMin;
	}

	@JsonProperty("processing_max")
	public int getProcessingMax() {
		return processingMax;
	}
	@JsonProperty("processing_max")
	public void setProcessingMax(int processingMax) {
		this.processingMax = processingMax;
	}

	/*
	 * enum values: i_did, collective, someone_else
	 */
	@JsonProperty("who_made")
	public String getWhoMade() {
		return whoMade;
	}
	@JsonProperty("who_made")
	public void setWhoMade(String whoMade) {
		this.whoMade = whoMade;
	}

	@JsonProperty("is_supply")
	public boolean isIsSupply() {
		return isSupply;
	}
	@JsonProperty("is_supply")
	public void setIsSupply(boolean isSupply) {
		this.isSupply = isSupply;
	}

	/*
	 * enum values: 
	 * 		made_to_order, 2010_2012, 2000_2009, 1993_1999, 
	 * 		before_1993, 1990_1992, 1980s, 1970s, 1960s, 1950s, 
	 * 		1940s, 1930s, 1920s, 1910s, 1900s, 1800s, 1700s, before_1700
	 */
	@JsonProperty("when_made")
	public String getWhenMade() {
		return whenMade;
	}
	@JsonProperty("when_made")
	public void setWhenMade(String whenMade) {
		this.whenMade = whenMade;
	}

	/*
	 * enum values: 
	 * 		men, women, unisex_adults, teen_boys, 
	 * 		teen_girls, teens, boys, girls, children, 
	 * 		baby_boys, baby_girls, babies, birds, cats, dogs, pets
	 * 
	 */
	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	/*
	 * enum values: 
	 * 		anniversary, baptism, bar_or_bat_mitzvah, 
	 * 		birthday, canada_day, chinese_new_year, 
	 * 		cinco_de_mayo, confirmation, christmas, 
	 * 		day_of_the_dead, easter, eid, engagement, fathers_day, 
	 * 		get_well, graduation, halloween, hanukkah, housewarming, 
	 * 		kwanza, prom, july_4th, mothers_day, new_baby, new_years, 
	 * 		quinceanera, retirement, st_patricks_day, sweet_16, sympathy, 
	 * 		thanksgiving, valentines, wedding
	 */
	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public String[] getStyle() {
		return style;
	}

	public void setStyle(String[] style) {
		this.style = style;
	}

	@JsonProperty("non_taxable")
	public boolean isNonTaxable() {
		return nonTaxable;
	}
	@JsonProperty("non_taxable")
	public void setNonTaxable(boolean nonTaxable) {
		this.nonTaxable = nonTaxable;
	}
	
	
   
}