package de.hdm.itprojekt.client;

import java.util.Vector;

/**
 * 
 * @TR Testweise erstellte Klasse zum Test des PartnervorschlagWidget
 */

public class TestProfil {
	private String name, geschlecht;
	private int alter;
	private int aehnlichkeitswert;
	private boolean raucher;
	private int groesse;
	private String haarfarbe;
	private Vector<TestSuchprofil> suchprofile= new Vector<TestSuchprofil>();

	public boolean isRaucher() {
		return raucher;
	}

	public void setRaucher(boolean raucher) {
		this.raucher = raucher;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getAehnlichkeitswert() {
		return aehnlichkeitswert;
	}

	public void setAehnlichkeitswert(int aehnlichkeitswert) {
		this.aehnlichkeitswert = aehnlichkeitswert;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Vector<TestSuchprofil> getSuchprofile() {
		return suchprofile;
	}

	public void setSuchprofile(Vector<TestSuchprofil> suchprofile) {
		this.suchprofile = suchprofile;
	}

	public TestProfil(String name, String geschlecht, int alter, int aehnlichkeitswert, boolean raucher, int groesse) {
		this.setName(name);
		this.geschlecht = geschlecht;
		this.alter = alter;
		this.aehnlichkeitswert = aehnlichkeitswert;
		this.raucher = raucher;
		this.groesse = groesse;
	}

	public TestProfil() {
		// TODO Auto-generated constructor stub
	}

	public static Vector<TestProfil> getProfile() {
		Vector<TestProfil> profile = new Vector<TestProfil>();
		profile.add(new TestProfil("karl", "maennlich", 20, 14, false, 175));
		profile.add(new TestProfil("tom", "maennlich", 24, 50, true, 182));
		profile.add(new TestProfil("tim", "maennlich", 21, 43, true, 152));
		profile.add(new TestProfil("kaaaarl", "maennlich", 50, 77, false, 191));
		profile.add(new TestProfil("joel", "maennlich", 97, 100, true, 210));
		profile.add(new TestProfil("max", "maennlich", 15, 10, false, 162));
		profile.add(new TestProfil("goerg", "maennlich", 55, 57, true, 176));
		return profile;
	}

}