package de.hdm.itprojekt.shared.bo;

import java.util.Date;

public class Profil extends BusinessObject{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String vorname;
	
	private Date geburtsdatum;
	
	private String haarfarbe;
	
	private String Religion;
	
	private boolean Raucher;
	
	private int Koerpergroesse;
	
	private String Geschlecht;
	
	
	private boolean loggedIn = false;
	  
	private String loginUrl;
	  
	private String logoutUrl;
	  
	private String emailAddress;
	
	
	public Profil(){
		
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	public String getReligion() {
		return Religion;
	}

	public void setReligion(String religion) {
		Religion = religion;
	}

	public boolean isRaucher() {
		return Raucher;
	}

	public void setRaucher(boolean raucher) {
		Raucher = raucher;
	}

	public int getKoerpergroesse() {
		return Koerpergroesse;
	}

	public void setKoerpergroesse(int koerpergroesse) {
		Koerpergroesse = koerpergroesse;
	}

	public String getGeschlecht() {
		return Geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		Geschlecht = geschlecht;
	}



	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getLogoutUrl() {
		return logoutUrl;
	}

	public void setLogoutUrl(String logoutUrl) {
		this.logoutUrl = logoutUrl;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}



	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
