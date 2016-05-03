package de.hdm.itprojekt.client;

import de.hdm.itprojekt.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ITProjekt implements EntryPoint {

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	
	/**
	 * Menüleiste wird als Widget erstellt.
	 */
	
	VerticalPanel menuPanel = new VerticalPanel();

	Button profilButton = new Button("Profil");
	Button sprofilButton = new Button("Suchprofil");
	Button homeButton = new Button("Startseite");
	Button merkButton = new Button("Merkliste");
	Button sperrButton = new Button("Sperrliste");
	
	
		public Widget menuWidget(){
							
			menuPanel.add(homeButton);
			menuPanel.add(profilButton);
			menuPanel.add(sprofilButton);
			menuPanel.add(merkButton);
			menuPanel.add(sperrButton);
				
				
			// Abstand zwischen den einzelnen Buttons
			menuPanel.setSpacing(20);
				
			//Layout Button
			profilButton.setPixelSize(200, 40);
			sprofilButton.setPixelSize(200, 40);
			homeButton.setPixelSize(200, 40);
			merkButton.setPixelSize(200, 40);
			sperrButton.setPixelSize(200, 40);
		
			
			return menuPanel;
			}
	
	
	
	/**
	 * This is the entry point method.
	 */

	public void onModuleLoad() {
		
		//Fügt die Menüleiste hinzu
		VerticalPanel hpanel = new VerticalPanel();
		RootPanel.get("nav").add(hpanel);
		hpanel.add(menuWidget());
		
	
		
	/**
	 * ClickHandler für den Profil-Button!	
	 */
		profilButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {

				//Reinigt den Bereich Content und fügt das Profil hinzu
				Label profilLabel = new Label("Dein Profil:");
				HorizontalPanel hpPanel = new HorizontalPanel();
				hpPanel.setSpacing(30);
				
				RootPanel.get("contentHeader").clear();
				RootPanel.get("contentHeader").add(profilLabel);
				
				RootPanel.get("content").clear();
				hpPanel.add(new ProfilWidget());
				hpPanel.add(new InfoWidget());
				RootPanel.get("content").add(hpPanel);
				


			}
		});
		
	/**
	* ClickHandler für den Startseite-Button!	
	*/
		homeButton.addClickHandler(new ClickHandler(){
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
