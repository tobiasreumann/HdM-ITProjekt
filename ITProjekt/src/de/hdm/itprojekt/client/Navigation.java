package de.hdm.itprojekt.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Navigation extends VerticalPanel{

	Button profilButton = new Button("Profil");
	Button sprofilButton = new Button("Suchprofil");
	Button homeButton = new Button("Startseite");
	Button merkButton = new Button("Merkliste");
	Button sperrButton = new Button("Sperrliste");

	
	public Navigation(){
		this.add(homeButton);
		this.add(profilButton);
		this.add(sprofilButton);
		this.add(merkButton);
		this.add(sperrButton);

		
		
		this.setSpacing(20);
		
		profilButton.setPixelSize(200, 40);
		sprofilButton.setPixelSize(200, 40);
		homeButton.setPixelSize(200, 40);
		merkButton.setPixelSize(200, 40);
		sperrButton.setPixelSize(200, 40);
	
	
	/**
	 * ClickHandler für den Profil-Button!
	 */
	profilButton.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
			
			//Testweise erstelltes Profil TODO: l�schen.
			final TestProfil testProfil= new TestProfil("king", "fa", "maennlich", 35, 14, false, 175, "rastafari");
			
			// Reinigt den Bereich Content und fügt das Profil hinzu
			Label profilLabel = new Label("Dein Profil:");
			HorizontalPanel hpPanel = new HorizontalPanel();
			hpPanel.setSpacing(30);

			RootPanel.get("contentHeader").clear();
			RootPanel.get("contentHeader").add(profilLabel);

			RootPanel.get("content").clear();
			hpPanel.add(new ProfilWidget(testProfil));
			hpPanel.add(new InfoWidget());
			RootPanel.get("content").add(hpPanel);
		}
	});
	/**
	 * ClickHandler für den Suchprofil-Button!
	 */
	sprofilButton.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {

			// Reinigt den Bereich Content und fügt das Profil hinzu
			Label profilLabel = new Label("Die Partnervorschl�ge:");

			RootPanel.get("contentHeader").clear();
			RootPanel.get("contentHeader").add(profilLabel);
			RootPanel.get("content").clear();
			RootPanel.get("content").add(new SuchprofilWidget());

		}
	});

	/**
	 * ClickHandler für den Startseite-Button!
	 */
	homeButton.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {

			Label startseiteLabel = new Label("Willkommen auf HoesForBros, dein Partner für die Partnersuche.");

			RootPanel.get("contentHeader").clear();
			RootPanel.get("contentHeader").add(startseiteLabel);

			RootPanel.get("content").clear();
			RootPanel.get("content").add(new StartseiteWidget());
			

		}
		
	});
	
	
	
 }
}

