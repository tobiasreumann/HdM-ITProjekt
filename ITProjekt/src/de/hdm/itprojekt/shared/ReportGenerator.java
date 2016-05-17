package de.hdm.itprojekt.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import de.hdm.itprojekt.shared.bo.Profil;

@RemoteServiceRelativePath("ReportGenerator")
public interface ReportGenerator extends RemoteService {
	
	public void init() throws IllegalArgumentException;
	
	public Vector<Profil> erstelleNichtangesehenePartnervorschlaegeReport() throws IllegalArgumentException;
	
	public Vector<Profil> erstellePartnervorschlaegeNachSuchprofilReport() throws IllegalArgumentException;
}
