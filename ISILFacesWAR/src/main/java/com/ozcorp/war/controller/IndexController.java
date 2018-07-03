package com.ozcorp.war.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

import com.ozcorp.ejb.facade.local.CompareFacesFacadeLocal;

@Named("index")
@ViewScoped
public class IndexController implements Serializable {
	
	@EJB
	private CompareFacesFacadeLocal compareFacesFacade;
	
	private Part uploadedFile;
	private Float similarityThreshold;
	private String accuracy;
	
	public void compare() {
		accuracy = "22.32%";
	}
	
	public Part getUploadedFile() {
		return uploadedFile;
	}
	
	public void setUploadedFile(Part uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	
	public Float getSimilarityThreshold() {
		return similarityThreshold;
	}
	
	public void setSimilarityThreshold(Float similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}	
}