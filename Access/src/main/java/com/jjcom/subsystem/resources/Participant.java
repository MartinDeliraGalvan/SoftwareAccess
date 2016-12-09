package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Participant {

	private int participantID;
	private String name;
	private String email;
	private String role;
	private ArrayList<Integer> memberOfactivity = new ArrayList<Integer>(); //stores activityIds where this user is a member
	public Participant(int participantID, String name, String email, String role, ArrayList<Integer> memberOfactivity) {
		super();
		this.participantID = participantID;
		this.name = name;
		this.email = email;
		this.role = role;
		this.memberOfactivity = memberOfactivity;
	}
	public int getParticipantID() {
		return participantID;
	}
	public void setParticipantID(int participantID) {
		this.participantID = participantID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<Integer> getMemberOfactivity() {
		return memberOfactivity;
	}
	public void setMemberOfactivity(ArrayList<Integer> memberOfactivity) {
		this.memberOfactivity = memberOfactivity;
	}
	
	/*adds activity id to its list of enrolled activities*/
	public void enlistInActivity(int activityID){
		this.memberOfactivity.add(activityID);
	}
	
	
}
