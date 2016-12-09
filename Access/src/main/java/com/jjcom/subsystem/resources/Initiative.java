package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Initiative extends Resource {
	private String category;
	private String website;
	private String puropse;
	private String creationDate;
	private ArrayList<Integer> activityList = new ArrayList<Integer>(); //contains a list with id of related initiatives
	private ArrayList<Integer> documentList = new ArrayList<Integer>(); //contains a list with id of documents related to this project
	
	
	public Initiative() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*Generates Initiative with both superclass constructor and setting this.fields*/
	public Initiative(String title, String description, String startdate, String enddate, String lastmodifyday,
		int resourceID, String type, String department, String college) {
		super(title, description, startdate, enddate, lastmodifyday, resourceID, type, department, college);
		this.category = category;
		this.website = website;
		this.puropse = puropse;
		this.creationDate = creationDate;	
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPuropse() {
		return puropse;
	}

	public void setPuropse(String puropse) {
		this.puropse = puropse;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Initiative [category=" + category + ", website=" + website + ", puropse=" + puropse + ", creationDate="
				+ creationDate + "]";
	}
	
		
	
}
