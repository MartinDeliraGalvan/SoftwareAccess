package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Resource {

	public String title;
	public String ownerID;
	public String description;
	public String startdate;
	public String enddate;
	public String lastmodifyday;
	public int resourceID;
	public String type;
	public String department;
	public String college;
	public ArrayList<String> keywordsList = new ArrayList<String>();
	public ArrayList<Integer> documentList = new ArrayList<Integer>(); //contains a list with id of documents related to this project
	
	/**
	 * default constructor
	 */
	public Resource(){
		
	}	

	
	public Resource(String title, String description, String startdate, String enddate, String lastmodifyday,
			int resourceID, String type, String department, String college, ArrayList<String> keywordsList,
			ArrayList<Integer> documentList) {
		super();
		this.title = title;
		this.description = description;
		this.startdate = startdate;
		this.enddate = enddate;
		this.lastmodifyday = lastmodifyday;
		this.resourceID = resourceID;
		this.type = type;
		this.department = department;
		this.college = college;
		this.keywordsList = keywordsList;
		this.documentList = documentList;
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

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getLastmodifyday() {
		return lastmodifyday;
	}

	public void setLastmodifyday(String lastmodifyday) {
		this.lastmodifyday = lastmodifyday;
	}

	public int getResourceID() {
		return resourceID;
	}

	public void setResourceID(int resourceID) {
		this.resourceID = resourceID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Resource [title=" + title + ", description=" + description + ", startdate=" + startdate + ", enddate="
				+ enddate + ", lastmodifyday=" + lastmodifyday + ", resourceID=" + resourceID + ", type=" + type
				+ ", department=" + department + ", college=" + college + "]";
	}
	
	public void setDocumentList(ArrayList<Integer> documentList) {
		this.documentList = documentList;
	}
	
	
	
	
}
