package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class FundedProject extends Project {
	
	protected String piname;
	protected String co_piname;
	
	public FundedProject(){
	}

	
	public FundedProject(String piname, String co_piname) {
		super();
		this.piname = piname;
		this.co_piname = co_piname;
	}


	public String getPiname() {
		return piname;
	}

	public void setPiname(String piname) {
		this.piname = piname;
	}

	public String getCo_piname() {
		return co_piname;
	}

	public void setCo_piname(String co_piname) {
		this.co_piname = co_piname;
	}
		
}
