package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class NonFundedProject extends Project {

	protected ArrayList<String> memberlist = new ArrayList<String>();

	public NonFundedProject(){
		
	}
	
	public NonFundedProject(ArrayList<String> memberlist) {
		super();
		this.memberlist = memberlist;
	}

	public ArrayList<String> getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(ArrayList<String> memberlist) {
		this.memberlist = memberlist;
	}
	
	public void addMember(String member){
		this.memberlist.add(member);
	}
	
}
