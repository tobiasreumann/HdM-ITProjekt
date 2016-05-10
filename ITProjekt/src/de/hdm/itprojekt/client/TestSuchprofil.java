package de.hdm.itprojekt.client;

import java.util.Vector;

public class TestSuchprofil {
	private int alterMin;
	private int alterMax;
	private String[] haarfarbe = new String[] {"egal", "blond", "rot", "braun", "schwarz"};
	private String[] geschlecht = new String[] {"egal", "maenlich", "weiblich"};
	private String[] raucher = new String[] {"egal", "ja", "nein"};

	
	private Vector<TestSuchprofil> suchprofile;

	public int getAlterMin() {
		return alterMin;
	}

	public void setAlterMin(int alterMin) {
		this.alterMin = alterMin;
	}

	public int getAlterMax() {
		return alterMax;
	}

	public void setAlterMax(int alterMax) {
		this.alterMax = alterMax;
	}

	public Vector<TestSuchprofil> getSuchprofile() {
		return suchprofile;
	}

	public void setSuchprofile(Vector<TestSuchprofil> suchprofile) {
		this.suchprofile = suchprofile;
	}
	
	public Vector<TestProfil> suchergebnis(Vector<TestProfil> profile, TestSuchprofil suchprofil){
		Vector<TestProfil> ergebnis = new Vector<TestProfil>();
		
		for (int i=0; i<= profile.capacity(); i++ ){
			
		}
		
		
		return ergebnis;
	}
	public TestSuchprofil(){
		 
	 }
}
	

