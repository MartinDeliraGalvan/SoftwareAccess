package com.jjcom.subsystem.reportgenerator;

import java.util.ArrayList;

import com.jjcom.subsystem.resources.Resource;

public class Report {
	
	String reportType; //Sumary or Detailed
	
	/*Sumary Report Contains*/
	String owner;
	
	/*A report is made of the following extra*/	
	String title;
	String description;
	String category;
	String purpose;
	String classification;
	String coursename;
	String startdate;
	String enddate;
	String goal;
	String[] keywords;
	String pi_name;
	String co_pi;
	String documentType;
	String website;
	Boolean funded;
	ArrayList<Integer> membershiplist = new ArrayList<Integer>();
	ArrayList<Integer> associatedProject = new ArrayList<Integer>();
	ArrayList<Integer> associatedInitiative = new ArrayList<Integer>();
	ArrayList<String> participant = new ArrayList<String>();
	
	public Report(){
		
	}
	
	public Report(String reportType, String owner, String title, String description, String category, String purpose,
			String classification, String coursename, String startdate, String enddate, String goal, String[] keywords,
			String pi_name, String co_pi, String documentType, String website, Boolean funded,
			ArrayList<Integer> membershiplist, ArrayList<Integer> associatedProject,
			ArrayList<Integer> associatedInitiative, ArrayList<String> participant) {
		super();
		this.reportType = reportType;
		this.owner = owner;
		this.title = title;
		this.description = description;
		this.category = category;
		this.purpose = purpose;
		this.classification = classification;
		this.coursename = coursename;
		this.startdate = startdate;
		this.enddate = enddate;
		this.goal = goal;
		this.keywords = keywords;
		this.pi_name = pi_name;
		this.co_pi = co_pi;
		this.documentType = documentType;
		this.website = website;
		this.funded = funded;
		this.membershiplist = membershiplist;
		this.associatedProject = associatedProject;
		this.associatedInitiative = associatedInitiative;
		this.participant = participant;
	}


	public String getReportType() {
		return reportType;
	}


	public void setReportType(String reportType) {
		this.reportType = reportType;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
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


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
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


	public String getGoal() {
		return goal;
	}


	public void setGoal(String goal) {
		this.goal = goal;
	}


	public String[] getKeywords() {
		return keywords;
	}


	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}


	public String getPi_name() {
		return pi_name;
	}


	public void setPi_name(String pi_name) {
		this.pi_name = pi_name;
	}


	public String getCo_pi() {
		return co_pi;
	}


	public void setCo_pi(String co_pi) {
		this.co_pi = co_pi;
	}


	public String getDocumentType() {
		return documentType;
	}


	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public Boolean getFunded() {
		return funded;
	}


	public void setFunded(Boolean funded) {
		this.funded = funded;
	}


	public ArrayList<Integer> getMembershiplist() {
		return membershiplist;
	}


	public void setMembershiplist(ArrayList<Integer> membershiplist) {
		this.membershiplist = membershiplist;
	}


	public ArrayList<Integer> getAssociatedProject() {
		return associatedProject;
	}


	public void setAssociatedProject(ArrayList<Integer> associatedProject) {
		this.associatedProject = associatedProject;
	}


	public ArrayList<Integer> getAssociatedInitiative() {
		return associatedInitiative;
	}


	public void setAssociatedInitiative(ArrayList<Integer> associatedInitiative) {
		this.associatedInitiative = associatedInitiative;
	}


	public ArrayList<String> getParticipant() {
		return participant;
	}


	public void setParticipant(ArrayList<String> participant) {
		this.participant = participant;
	}

	public void setInfo(Resource resource) {
		// TODO Auto-generated method stub
		
	}
	
	
}
