package de.hdm.itprojekt.client;

import java.util.Vector;
import java.util.Date;


/**
 * 
 * @TR Testweise erstellte Klasse zum Test des PartnervorschlagWidget
 */

public class TestProfil {
	private static String[] haarfarbeArray = new String[] {"blond", "rot", "braun", "schwarz"};
	private static String[] geschlechtArray = new String[] {"maennlich", "weiblich"};
	private static String[] raucherArray = new String[] {"ja", "nein"};
	private String name, vorname, geschlecht, religion;
	//TODO date datentyp erzeugt compilerfehler
	private Date geburtsdatum;
	private int alter;
	private int aehnlichkeitswert;
	private boolean raucher;
	private int groesse;
	private Vector<TestInfo> infos = new Vector<TestInfo>();
	private String haarfarbe;
	private Vector<TestSuchprofil> suchprofile= new Vector<TestSuchprofil>();
	private static int nextId = 0;

	private final int id;

	public int getId() {
		return id;
	}

	public  String[] getHaarfarbeArray() {
		return haarfarbeArray;
	}

	public String[] getGeschlechtArray() {
		return geschlechtArray;
	}

	public  String[] getRaucherArray() {
		return raucherArray;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

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

	public TestProfil(String name, String vorname, String geschlecht, int alter, int aehnlichkeitswert, boolean raucher, int groesse, String religion) {
		this.name =name;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
		this.alter = alter;
		this.aehnlichkeitswert = aehnlichkeitswert;
		this.raucher = raucher;
		this.groesse = groesse;
		this.religion=religion;
		this.id=nextId;
		nextId++;
	}

	public TestProfil() {
		// TODO Auto-generated constructor stub
		this.id=nextId;
		nextId++;
	}

	public static Vector<TestProfil> getProfile() {
		Vector<TestProfil> profile = new Vector<TestProfil>();
		profile.add(new TestProfil("gries","karl", "maennlich", 20, 14, false, 175, "schamanismus"));
		profile.add(new TestProfil("tomsen","tom", "maennlich", 24, 50, true, 182, "buddismus"));
		profile.add(new TestProfil("timber","tim", "maennlich", 21, 43, true, 152, "hinduismus"));
		profile.add(new TestProfil("karlson","kaaaarl", "maennlich", 50, 77, false, 191, "griechisch-orthodox"));
		profile.add(new TestProfil("siffi","joel", "maennlich", 97, 100, true, 210, "pastafari"));
		profile.add(new TestProfil("spax","max", "weiblich", 15, 10, false, 162, "atheist"));
		profile.add(new TestProfil("lauch","goerg", "maennlich", 55, 57, true, 176, "jüdisch"));
		return profile;
	}
	
	public Vector<TestInfo> getInfos(){
		return infos;
		
	}
	
	public void setInfos(Vector<TestInfo> i){
		this.infos = i;
	}

		
}