package de.hdm.itprojekt.shared;

import java.util.Vector;

import de.hdm.itprojekt.shared.bo.Profil;

public interface ReportGeneratorInterface {
	
	public void init();
	
	public Vector<Profil> erstelleNichtangesehenePartnervorschlaegeReport();
	
	public Vector<Profil> erstellePartnervorschlaegeNachSuchprofilReport();
}
