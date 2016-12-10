package com.jjcom.subsystem.reportgenerator;

import java.io.File;

import com.jjcom.subsystem.resources.Resource;

public class ReportGenerator {

	/* Summary Report
	 * Title: String
	 * Description: String
	 * Owner: String
	 * Category: String
	 * Creation Date: Date()
	 * */
	
	public static Report reportCreator(Resource resource, String desiredReportType){	
		
		Report report = new Report();
		
		if(desiredReportType == "summary"){
			report.setInfo(resource);
		}
		else if(desiredReportType == "detailed"){
			report.setInfo(resource);
		}
		
		
		return null;
	}
	
	
	
	
}
