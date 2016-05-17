package de.hdm.itprojekt.shared.report;

public class HTMLReportWriter{

	private String reportText= "";
		
	
	public void resetReportText(){
		this.reportText = "";
	}
	
	public String getReportText(){
		return reportText;
	}
	
	public void ausfuehren(SuchprofilReport r){
	//(TODO)	
	}
	
	public void ausfuehren(NichtangeseheneProfileReport r){
	//(TODO)	
	}
	
}
