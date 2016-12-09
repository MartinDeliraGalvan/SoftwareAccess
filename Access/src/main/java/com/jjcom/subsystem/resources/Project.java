package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Project extends Resource{

	protected String website;
	protected String objective;
	protected String goal;
	protected boolean funded;
	protected ArrayList<Integer> initiativeList = new ArrayList<Integer>(); //contains a list with id of related initiatives
	
	
	/*Default constructor*/
	public Project(){
		
	}	

	public Project(String website, String objective, String goal, boolean funded, ArrayList<Integer> initiativeList,	ArrayList<Integer> documentList) {
		super();
		this.website = website;
		this.objective = objective;
		this.goal = goal;
		this.funded = funded;
		this.initiativeList = initiativeList;
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

	public ArrayList<Integer> getDocumentList() {
		return documentList;
	}

	
	}
