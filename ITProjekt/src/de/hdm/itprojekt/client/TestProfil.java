package de.hdm.itprojekt.client;

import java.util.Vector;

/**
 * 
 * @TR Testweise erstellte Klasse zum Test des PartnervorschlagWidget
 */

public class TestProfil {
	private String name, geschlecht;
	
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

	private int alter;
	private int aehnlichkeitswert;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestProfil(String name, String geschlecht, int alter, int aehnlichkeitswert) {
		this.setName(name);
		this.geschlecht = geschlecht;
		this.alter = alter;
		this.aehnlichkeitswert = aehnlichkeitswert;
	}

	public static Vector<TestProfil> getProfile() {
		Vector<TestProfil> profile = new Vector<TestProfil>();
		profile.add(new TestProfil("karl", "maennlich", 20, 14));
		profile.add(new TestProfil("tom", "maennlich", 24, 50));
		profile.add(new TestProfil("tim", "maennlich", 21, 43));
		profile.add(new TestProfil("kaaaarl", "maennlich", 50, 77));
		profile.add(new TestProfil("joel", "maennlich", 97, 100));
		profile.add(new TestProfil("max", "maennlich", 15, 10));
		profile.add(new TestProfil("goerg", "maennlich", 55, 57));
		return profile;
	}
}