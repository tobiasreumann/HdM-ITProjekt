package de.hdm.itprojekt.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.bo.Profil;

public interface ReportGeneratorAsync{

	void init(AsyncCallback<Void> callback);

	void erstelleNichtangesehenePartnervorschlaegeReport(
			AsyncCallback<Vector<Profil>> callback);

	void erstellePartnervorschlaegeNachSuchprofilReport(
			AsyncCallback<Vector<Profil>> callback);
}
