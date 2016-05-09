package de.hdm.itprojekt.server.report;

import java.util.Vector;

import de.hdm.itprojekt.server.db.AehnlichkeitsmassMapper;
import de.hdm.itprojekt.server.db.PartnervorschlagMapper;
import de.hdm.itprojekt.server.db.ProfilMapper;
import de.hdm.itprojekt.server.db.SuchprofilMapper;
import de.hdm.itprojekt.shared.ReportGeneratorInterface;
import de.hdm.itprojekt.shared.bo.Profil;

public class ReportGeneratorImpl implements ReportGeneratorInterface{

	private static final long serialVersionUID = 1L;
	
	private ProfilMapper pMapper;
	private AehnlichkeitsmassMapper aMapper;
	private PartnervorschlagMapper pvMapper;
	private SuchprofilMapper sMapper;
	
	public ReportGeneratorImpl() throws IllegalArgumentException{
		
	}
	
	public void init() throws IllegalArgumentException{
		
	}
	
	@Override
	public Vector<Profil> erstelleNichtangesehenePartnervorschlaegeReport() throws IllegalArgumentException{
		return null;
		
	}
	
	@Override
	public Vector<Profil> erstellePartnervorschlaegeNachSuchprofilReport() throws IllegalArgumentException{
		return null;
		
	}
}
