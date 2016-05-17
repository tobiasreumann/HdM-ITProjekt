package de.hdm.itprojekt.client;

import java.util.Vector;

public class TestInfo {

	private String beschreibungsInfo;
	private String auswahlInfo;
	private Vector<TestEigenschaft> eigenschaften = new Vector<TestEigenschaft>();

	
	public String getBeschreibungsInfo(){
		return beschreibungsInfo;	
	}
	
	public void setBeschreibungInfo(String bi){
		this.beschreibungsInfo = bi;	
	}
	
	public String getAuswahlInfo(){
		return auswahlInfo;	
	}
	
	public void setAuswahlInfo(String ai){
		this.auswahlInfo = ai;
	}
	
	public Vector<TestEigenschaft> getEigenschaften(){
		return eigenschaften;		
	}
	
	public void setEigenschaften(Vector<TestEigenschaft> e){
		this.eigenschaften = e;
	}
	
	
}
