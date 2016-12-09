package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Project extends Resource{

	private int resourceID;
	private String website;
	private String objective;
	private String goal;
	private boolean funded;
	private ArrayList<Integer> initiativeList = new ArrayList<Integer>(); //contains a list with id of related initiatives
	private ArrayList<Integer> documentList = new ArrayList<Integer>(); //contains a list with id of documents related to this project
	
	/*Default constructor*/
	public Project(){
		
	}

	public Project(String title, String description, String startdate, String enddate, String lastmodifyday,
			int resourceID, String type, String department, String college) {
		
		super(title, description, startdate, enddate, lastmodifyday, resourceID, type, department, college);
		this.resourceID = resourceID;
		this.website = website;
		this.objective = objective;
		this.goal = goal;
		this.funded = funded;
		this.initiativeList = initiativeList;
		
	}

	public int getResourceID() {
		return resourceID;
	}

	public void setResourceID(int resourceID) {
		this.resourceID = resourceID;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public boolean isFunded() {
		return funded;
	}

	public void setFunded(boolean funded) {
		this.funded = funded;
	}

	public ArrayList<Integer> getInitiativeList() {
		return initiativeList;
	}

	public void setInitiativeList(ArrayList<Integer> initiativeList) {
		this.initiativeList = initiativeList;
	}
	
	/*adds initiative id to the initiative list of this project*/
	public void addInitiativeToProject(Initiative initiative){
		this.initiativeList.add(initiative.getResourceID());
	}
	
	public void addDocumentToProject(Document document){
		this.initiativeList.add(document.getDocumentId());
	}
		
}
