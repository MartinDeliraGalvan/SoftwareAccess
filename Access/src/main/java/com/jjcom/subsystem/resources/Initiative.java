package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Initiative extends Resource {
	protected String category;
	protected String website;
	protected String puropse;
	protected String creationDate;
	protected ArrayList<Integer> activityList = new ArrayList<Integer>(); //contains a list with id of related initiatives
	protected ArrayList<Integer> projectList = new ArrayList<Integer>(); //contains a list with id of related project
	protected ArrayList<String> memberlist = new ArrayList<String>();//Stores member id
	
	public Initiative() {
		super();
	}
	
	/*Generates Initiative with both superclass constructor and setting this.fields*/
	
	public String getCategory() {
		return category;
	}	

	public Initiative(String category, String website, String puropse, String creationDate,
			ArrayList<Integer> activityList, ArrayList<String> memberlist,ArrayList<Integer> projectList ) {
		super();
		this.category = category;
		this.website = website;
		this.puropse = puropse;
		this.creationDate = creationDate;
		this.activityList = activityList;
		this.memberlist = memberlist;
		this.projectList = projectList;
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
