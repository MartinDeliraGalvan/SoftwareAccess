package com.jjcom.subsystem.database;
import java.awt.List;
import java.sql.*;
import com.jjcom.subsystem.database.*;


public class DatabaseConnectionManager {

	//JDBC Driver
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String ACCESS_URL = "jdbc:mysql://localhost/accessDB";
	static final String BANNER_URL = "jdbc:mysql://localhost/bannerDB";
	static final String DM_URL = "jdbc:mysql://localhost/dmDB";
	
	static final String access_user = "root";
	static final String access_pass = "";
	
	static final String banner_user = "root";
	static final String banner_pass = "";
	
	static final String dm_user = "root";
	static final String dm_pass = "";
	
	
	Connection con = null;
	Statement stmt = null;
	
	

	
	
	
	
	
	
	
}