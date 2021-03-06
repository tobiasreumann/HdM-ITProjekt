package de.hdm.itprojekt.shared.bo;

import java.util.Date;
import java.util.Vector;

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
	
	private Boolean isCreated = false;
	
	
	public Profil(){
	}

//
//
//		private final int id;
//
//		public int getId() {
//			return id;
//		}
//
//		public  String[] getHaarfarbeArray() {
//			return haarfarbeArray;
//		}
//
//		public String[] getGeschlechtArray() {
//			return geschlechtArray;
//		}
//
//		public  String[] getRaucherArray() {
//			return raucherArray;
//		}
//
//		public String getVorname() {
//			return vorname;
//		}
//
//		public void setVorname(String vorname) {
//			this.vorname = vorname;
//		}
//
//		public String getReligion() {
//			return religion;
//		}
//
//		public void setReligion(String religion) {
//			this.religion = religion;
//		}
//
//		public Date getGeburtsdatum() {
//			return geburtsdatum;
//		}
//
//		public void setGeburtsdatum(Date geburtsdatum) {
//			this.geburtsdatum = geburtsdatum;
//		}
//
//		public boolean isRaucher() {
//			return raucher;
//		}
//
//		public void setRaucher(boolean raucher) {
//			this.raucher = raucher;
//		}
//
//		public int getGroesse() {
//			return groesse;
//		}
//
//		public void setGroesse(int groesse) {
//			this.groesse = groesse;
//		}
//
//		public String getHaarfarbe() {
//			return haarfarbe;
//		}
//
//		public void setHaarfarbe(String haarfarbe) {
//			this.haarfarbe = haarfarbe;
//		}
//
//		public String getGeschlecht() {
//			return geschlecht;
//		}
//
//		public void setGeschlecht(String geschlecht) {
//			this.geschlecht = geschlecht;
//		}
//
//		public int getAlter() {
//			return alter;
//		}
//
//		public void setAlter(int alter) {
//			this.alter = alter;
//		}
//
//		public int getAehnlichkeitswert() {
//			return aehnlichkeitswert;
//		}
//
//		public void setAehnlichkeitswert(int aehnlichkeitswert) {
//			this.aehnlichkeitswert = aehnlichkeitswert;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//		public Vector<Suchprofil> getSuchprofile() {
//			return suchprofile;
//		}
//
//		public void setSuchprofile(Vector<Suchprofil> suchprofile) {
//			this.suchprofile = suchprofile;
//		}
//
//		public Profil(String name, String vorname, String geschlecht, int alter, int aehnlichkeitswert, boolean raucher, int groesse, String religion) {
//			this.name =name;
//			this.vorname = vorname;
//			this.geschlecht = geschlecht;
//			this.alter = alter;
//			this.aehnlichkeitswert = aehnlichkeitswert;
//			this.raucher = raucher;
//			this.groesse = groesse;
//			this.religion=religion;
//			this.id=nextId;
//			nextId++;
//		}
//
//		public Profil() {
//			// TODO Auto-generated constructor stub
//			this.id=nextId;
//			nextId++;
//		}
//
//		public static Vector<Profil> getProfile() {
//			Vector<Profil> profile = new Vector<Profil>();
//			profile.add(new Profil("gries","karl", "maennlich", 20, 14, false, 175, "schamanismus"));
//			profile.add(new Profil("tomsen","tom", "maennlich", 24, 50, true, 182, "buddismus"));
//			profile.add(new Profil("timber","tim", "maennlich", 21, 43, true, 152, "hinduismus"));
//			profile.add(new Profil("karlson","kaaaarl", "maennlich", 50, 77, false, 191, "griechisch-orthodox"));
//			profile.add(new Profil("siffi","joel", "maennlich", 97, 100, true, 210, "pastafari"));
//			profile.add(new Profil("spax","max", "weiblich", 15, 10, false, 162, "atheist"));
//			profile.add(new Profil("lauch","goerg", "maennlich", 55, 57, true, 176, "j�disch"));
//			return profile;
//		}
//
//	}
	


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

	public Boolean getIsCreated() {
		return isCreated;
	}

	public void setIsCreated(Boolean isCreated) {
		this.isCreated = isCreated;
	}
	
	

//
//		public Vector<Info> getInfos(){
//			return infos;
//			
//		}
//		
//		public void setInfos(Vector<Info> i){
//			this.infos = i;
//		}

			
	}

