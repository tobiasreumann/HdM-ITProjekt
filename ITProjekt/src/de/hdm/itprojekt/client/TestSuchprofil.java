package de.hdm.itprojekt.client;

import java.util.Vector;

public class TestSuchprofil {
	private int alterMin;
	private int alterMax;
	private int groeﬂe;
	private String haarfarbe;
	private boolean raucher;
	private String geschlecht;
	
	
	private Vector<TestSuchprofil> suchprofile;

	public Vector<TestSuchprofil> getSuchprofile() {
		return suchprofile;
	}

	public void setSuchprofile(Vector<TestSuchprofil> suchprofile) {
		this.suchprofile = suchprofile;
	}
	
}
