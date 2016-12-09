package com.jjcom.subsystem.resources;

import java.util.ArrayList;

public class Courses {

	protected ArrayList<String> courselist = new ArrayList<String>();
	
	public Courses(){
		this.courselist.add("CS1310");
		this.courselist.add("CS2210");
		this.courselist.add("CS4310");
		this.courselist.add("CS4320");
		this.courselist.add("HIST1325");
		this.courselist.add("BIO1320");
		this.courselist.add("EE1520");
		this.courselist.add("RWS1301");
		this.courselist.add("COMM1611");
		this.courselist.add("MATH1411");
		this.courselist.add("STAT2480");
		this.courselist.add("ENGL2311");
		this.courselist.add("HIST2301");
		this.courselist.add("PHIL2306");
		this.courselist.add("WS2350");
		this.courselist.add("FREN2322");
		this.courselist.add("MUSL1324");
		this.courselist.add("DANC1304");
		this.courselist.add("FILM1390");
		this.courselist.add("THEA1313");
		this.courselist.add("POLS2310");
		this.courselist.add("ANTH2320");
		this.courselist.add("EDU1314");
		this.courselist.add("PSYC1301");
		this.courselist.add("BUSN1301");
		this.courselist.add("ESCI4301");
		this.courselist.add("ESCI2105");;
		this.courselist.add("BIOL3316");
		this.courselist.add("BIOL4428");
		this.courselist.add("ZOOL2406");
		this.courselist.add("MICR2340");
		this.courselist.add("GEOG1306");
		this.courselist.add("CHEM1305");
		this.courselist.add("BOT3437");
		this.courselist.add("BIOL3326");
		this.courselist.add("HSCI3306");
		this.courselist.add("GEOP4336");
	}
	
	public String getCourseByIndex(int index){
		return this.courselist.get(index);
	}
		
	
}
