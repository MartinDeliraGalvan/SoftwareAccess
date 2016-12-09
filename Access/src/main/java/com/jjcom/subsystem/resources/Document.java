package com.jjcom.subsystem.resources;

public class Document {

	private int documentId;
	private String documentName;
	private String format;
	private String dateCreated;
	
	public Document(){
		
	}

	public Document(int documentId, String format, String dateCreated) {
		super();
		this.documentId = documentId;
		this.format = format;
		this.dateCreated = dateCreated;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	
	
}
