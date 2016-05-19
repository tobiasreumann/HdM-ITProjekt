package de.hdm.itprojekt.shared.report;

import java.io.Serializable;

public class Report implements Serializable{
	
	  private static final long serialVersionUID = 1L;
	  
	  private String titel = "Report";
	  
	  public String getTitel(){
		  return this.titel;
	  }

	  public void setTitel(String titel){
		  this.titel = titel;
	  }
	  
	  
}

