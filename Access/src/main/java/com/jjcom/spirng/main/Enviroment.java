package com.jjcom.spirng.main;
import java.util.ArrayList;

import com.jjcom.subsystem.resources.*;;


public class Enviroment {

	public static void main(String [] args){
		
		ArrayList<Resource> resourceDB = new ArrayList<Resource>();
		
		
		Resource r1 = new Project("www.flp.gov",
				"Investiagation about the reproduction and relation of fungus in desertic locations",
				"Find Research about fungal symbiotic relations", false);
			
		r1.setTitle("Fungal Loop Investigation Research");
		r1.setOwnerId("8800001");
		r1.setDescription("Investigation of fungal life in desertic conditions");
		r1.setStartdate("2015-02-05");
		r1.setEnddate("2015-05-05");
		r1.setResourceID(1);
		r1.setType("Project");
		r1.setDepartment("Biology");
		r1.setCollege("Sciences");
		r1.addKeyword("fungus");
		r1.addKeyword("desert");
		r1.addKeyword("biology");
		r1.addKeyword("research");
		

		Resource r2	 = new Project("www.flp.gov",
				"Investiagation about the reproduction and relation of fungus in desertic locations",
				"Find Research about fungal symbiotic relations", false);
			
		r2.setTitle("Rotifier Biology Project");
		r2.setOwnerId("8800002");
		r2.setDescription("Rotifers play a major role in freshwater ecosystems, their abundance and ubiquitous occurrence");
		r2.setStartdate("2013-02-05");
		r2.setResourceID(1);
		r2.setType("Project");
		r2.setDepartment("Biology");
		r2.setCollege("Sciences");
		r2.addKeyword("Marine life");
		r2.addKeyword("ecosystem");
		r2.addKeyword("diversity");
		r2.addKeyword("ecology");
		
		
		
		
		
		
		
	}
	
	
}
