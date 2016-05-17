package de.hdm.itprojekt.server.report;

import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hdm.itprojekt.server.db.AehnlichkeitsmassMapper;
import de.hdm.itprojekt.server.db.PartnervorschlagMapper;
import de.hdm.itprojekt.server.db.ProfilMapper;
import de.hdm.itprojekt.server.db.SuchprofilMapper;
import de.hdm.itprojekt.shared.ReportGenerator;
import de.hdm.itprojekt.shared.bo.Profil;

@SuppressWarnings("serial")
public class ReportGeneratorImpl extends RemoteServiceServlet implements ReportGenerator{
	
	private ProfilMapper pMapper;
	private AehnlichkeitsmassMapper aMapper;
	private PartnervorschlagMapper pvMapper;
	private SuchprofilMapper sMapper;
	
	public ReportGeneratorImpl() throws IllegalArgumentException{
		
	}
	
	@Override
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
