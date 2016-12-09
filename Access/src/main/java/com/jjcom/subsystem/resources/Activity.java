package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Activity extends Resource{

	private String targetAudienceClassification;
	private String classification;
	private String semester;
	private String targetAudienceDescription;
	private ArrayList<Participant> participantList = new ArrayList<Participant>();/*Filled with participant objects*/
	private ArrayList<String> courseList = new ArrayList<String>();
	
	
	public Activity(String targetAudienceClassification, String classification, String semester, String targetAudienceDescription, ArrayList<Participant> participantList, ArrayList<String> courseList) {
		super();
		this.targetAudienceClassification = targetAudienceClassification;
		this.classification = classification;
		this.semester = semester;
		this.targetAudienceDescription = targetAudienceDescription;
		this.participantList = participantList;
		this.courseList = courseList;
	}


	public String getTargetAudienceClassification() {
		return targetAudienceClassification;
	}


	public void setTargetAudienceClassification(String targetAudienceClassification) {
		this.targetAudienceClassification = targetAudienceClassification;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}


	public String getTargetAudienceDescription() {
		return targetAudienceDescription;
	}


	public void setTargetAudienceDescription(String targetAudienceDescription) {
		this.targetAudienceDescription = targetAudienceDescription;
	}


	public ArrayList<Participant> getParticipantList() {
		return participantList;
	}


	public void setParticipantList(ArrayList<Participant> participantList) {
		this.participantList = participantList;
	}


	public ArrayList<String> getCourseList() {
		return courseList;
	}


	public void setCourseList(ArrayList<String> courseList) {
		this.courseList = courseList;
	}
	
	
	
	
}
