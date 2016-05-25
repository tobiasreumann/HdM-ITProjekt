package de.hdm.itprojekt.shared.bo;

import java.util.Vector;

import de.hdm.itprojekt.client.TestProfil;
import de.hdm.itprojekt.client.TestSuchprofil;

public class Suchprofil extends BusinessObject{

	private static final long serialVersionUID = 1L;
	
//	private String name;
//	private int alterMin;
//	private int alterMax;
//	private static String[] haarfarbe = new String[] {"egal", "blond", "rot", "braun", "schwarz"};
//	private static String[] geschlecht = new String[] {"egal", "maennlich", "weiblich"};
//	private static String[] raucher = new String[] {"egal", "ja", "nein"};
//	private String haarfarbeAuswahl;
//	private String geschlechtAuswahl;
//	private boolean raucherAuswahl;
//	private String raucherEgal=null;
//	
//
//	public String[] getHaarfarbe() {
//		return haarfarbe;
//	}
//
//	public String[] getGeschlecht() {
//		return geschlecht;
//	}
//
//	public String[] getRaucher() {
//		return raucher;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getRaucherEgal() {
//		return raucherEgal;
//	}
//
//	public void setRaucherEgal(String raucherEgal) {
//		this.raucherEgal = raucherEgal;
//	}
//
//	public int getAlterMin() {
//		return alterMin;
//	}
//
//	public void setAlterMin(int alterMin) {
//		this.alterMin = alterMin;
//	}
//
//	public int getAlterMax() {
//		return alterMax;
//	}
//
//	public void setAlterMax(int alterMax) {
//		this.alterMax = alterMax;
//	}
//
//	public String getHaarfarbeAuswahl() {
//		return haarfarbeAuswahl;
//	}
//
//	public void setHaarfarbeAuswahl(String haarfarbeAuswahl) {
//		this.haarfarbeAuswahl = haarfarbeAuswahl;
//	}
//
//	public String getGeschlechtAuswahl() {
//		return geschlechtAuswahl;
//	}
//
//	public void setGeschlechtAuswahl(String geschlechtAuswahl) {
//		this.geschlechtAuswahl = geschlechtAuswahl;
//	}
//
//	public boolean isRaucherAuswahl() {
//		return raucherAuswahl;
//	}
//
//	public void setRaucherAuswahl(boolean raucherAuswahl) {
//		this.raucherAuswahl = raucherAuswahl;
//	}
//	public String getRaucherAuswahl (){
//		String s = null;
//		if (raucherEgal.equals("egal")){
//			s= "egal";
//			return s;
//		}
//		else{
//			if(raucherAuswahl==true){
//				s="ja";
//			}
//			else {
//				s="nein";
//			}
//			return s;
//		}
//	}
//
//
//	
//	public static Vector<Profil> suchergebnis(Vector<Profil> profile, TestSuchprofil suchprofil){
//		Vector<Profil> ergebnis = new Vector<Profil>();
//		
//		for (int i=0; i< profile.size(); i++ ){
//			
//			
//			//-------------------------------------
//			//Prüfung ob das Alter innerhalb von alterMin und alterMax liegt.
//			//-------------------------------------
//			if (profile.elementAt(i).getAlter()>= suchprofil.getAlterMin() && profile.elementAt(i).getAlter() <= suchprofil.getAlterMax()){
//				
//				//-------------------------------------
//				//Prüfung ob die Haarfarbe dem ausgewählten Suchprofil-String oder "egal" entspricht.
//				//-------------------------------------
//				if(profile.elementAt(i).getHaarfarbe().equals(suchprofil.getHaarfarbeAuswahl())|| suchprofil.getHaarfarbeAuswahl().equals("egal")){
//					
//					//-------------------------------------
//					//Prüfung ob das Geschlecht dem ausgewählten Suchprofil-String oder "egal" entspricht.
//					//-------------------------------------
//					if(profile.elementAt(i).getGeschlecht().equals(suchprofil.getGeschlechtAuswahl())|| suchprofil.getGeschlechtAuswahl().equals("egal")){
//						
//						//-------------------------------------
//						//Prüfung ob die Info Raucher mit dem Profil übereinstimmt, oder dem String "egal" entspricht.
//						//-------------------------------------
//						if((profile.elementAt(i).isRaucher()&&suchprofil.isRaucherAuswahl())|| suchprofil.getRaucherEgal().equals("egal")){
//							
//							ergebnis.add(profile.elementAt(i));	
//						}
//					}
//				}
//			}		
//		}
//		return ergebnis;
//	}
}

