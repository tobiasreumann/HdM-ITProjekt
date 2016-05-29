package de.hdm.itprojekt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import de.hdm.itprojekt.shared.AdministrationAsync;
import de.hdm.itprojekt.shared.bo.Profil;

public class LoginWidget extends VerticalPanel{

	AdministrationAsync administration = ClientsideSettings.getAdministration();
	private VerticalPanel loginPanel = new VerticalPanel();
	private Label loginLabel = new Label("Bitte melde dich mit deinem Google Account an.");
	private Anchor signInLink = new Anchor("Einloggen");
	final Anchor logOutLink = new Anchor("Ausloggen");
	
	public LoginWidget(){
		
		administration.login(GWT.getHostPageBaseURL() + "ITProjekt.html", new AsyncCallback<Profil>(){

			@Override
			public void onFailure(Throwable caught) {
				ClientsideSettings.getLogger().severe("Bitte versuchen Sie sich erneut einzuloggen!");
			}

			@Override
			public void onSuccess(Profil result) {
	if (result.isLoggedIn() && !result.getIsCreated()) {
					
				ClientsideSettings.setCurrentUser(result);
//				profilAnlegen(); TODO
				ClientsideSettings.getLogger().info("Profil für " + result.getVorname() + " erstellt!");
				RootPanel.get("nav").add(new Navigation());
				RootPanel.get("content").add(new StartseiteWidget());
				logOutLink.setHref(result.getLogoutUrl());
				RootPanel.get("nav").add(logOutLink);
			} else if(result.isLoggedIn() && result.getIsCreated()){
				ClientsideSettings.setCurrentUser(result);
				RootPanel.get("nav").add(new Navigation());
				RootPanel.get("content").add(new StartseiteWidget());
				logOutLink.setHref(result.getLogoutUrl());
				RootPanel.get("nav").add(logOutLink);
//				loadProfil(); TODO
				ClientsideSettings.getLogger().info("Dein Profil wird geladen!");
			} else {
				signInLink.setHref(result.getLoginUrl());
				loginPanel.add(loginLabel);
				loginPanel.add(signInLink);
//				RootPanel.get("nav").clear();
//				RootPanel.get("content").clear();
				RootPanel.get("content").add(loginPanel);
				}
				
			}
			
		});
	}
	
	
	
}
