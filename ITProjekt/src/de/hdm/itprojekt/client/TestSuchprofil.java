package de.hdm.itprojekt.client;

import java.util.Vector;

public class TestSuchprofil {
	private int alterMin;
	private int alterMax;
	private String[] haarfarbe = new String[] {"egal", "blond", "rot", "braun", "schwarz"};
	private String[] geschlecht = new String[] {"egal", "maennlich", "weiblich"};
	private String[] raucher = new String[] {"egal", "ja", "nein"};
	private String haarfarbeAuswahl;
	private String geschlechtAuswahl;
	private boolean raucherAuswahl;
	private String raucherEgal;
	private Vector<TestSuchprofil> suchprofile= new Vector<TestSuchprofil>();

	public String getRaucherEgal() {
		return raucherEgal;
	}

	public void setRaucherEgal(String raucherEgal) {
		this.raucherEgal = raucherEgal;
	}

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

	public String getHaarfarbeAuswahl() {
		return haarfarbeAuswahl;
	}

	public void setHaarfarbeAuswahl(String haarfarbeAuswahl) {
		this.haarfarbeAuswahl = haarfarbeAuswahl;
	}

	public String getGeschlechtAuswahl() {
		return geschlechtAuswahl;
	}

	public void setGeschlechtAuswahl(String geschlechtAuswahl) {
		this.geschlechtAuswahl = geschlechtAuswahl;
	}

	public boolean isRaucherAuswahl() {
		return raucherAuswahl;
	}

	public void setRaucherAuswahl(boolean raucherAuswahl) {
		this.raucherAuswahl = raucherAuswahl;
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
			
			
			//-------------------------------------
			//Prüfung ob das Alter innerhalb von alterMin und alterMax liegt.
			//-------------------------------------
			if (profile.elementAt(i).getAlter()>= suchprofil.getAlterMin() && profile.elementAt(i).getAlter() <= suchprofil.getAlterMax()){
				
				//-------------------------------------
				//Prüfung ob die Haarfarbe dem ausgewählten Suchprofil-String oder "egal" entspricht.
				//-------------------------------------
				if(profile.elementAt(i).getHaarfarbe().equals(suchprofil.getHaarfarbeAuswahl())|| suchprofil.getHaarfarbeAuswahl().equals("egal")){
					
					//-------------------------------------
					//Prüfung ob das Geschlecht dem ausgewählten Suchprofil-String oder "egal" entspricht.
					//-------------------------------------
					if(profile.elementAt(i).getGeschlecht().equals(suchprofil.getGeschlechtAuswahl())|| suchprofil.getGeschlechtAuswahl().equals("egal")){
						
						//-------------------------------------
						//Prüfung ob die Info Raucher mit dem Profil übereinstimmt, oder dem String "egal" entspricht.
						//-------------------------------------
						if((profile.elementAt(i).isRaucher()&&suchprofil.raucherAuswahl)|| suchprofil.getRaucherEgal().equals("egal")){
							
							ergebnis.add(profile.elementAt(i));	
						}
					}
				}
			}		
		}
		return ergebnis;
	}
	public TestSuchprofil(){
		 
	 }
}
	

