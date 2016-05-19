package de.hdm.itprojekt.client;

import org.eclipse.jetty.security.LoginService;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.hdm.itprojekt.shared.Administration;
import de.hdm.itprojekt.shared.AdministrationAsync;
import de.hdm.itprojekt.shared.bo.Profil;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ITProjekt implements EntryPoint {

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	/**
	 * Menüleiste wird als Widget erstellt.
	 */

	VerticalPanel menuPanel = new VerticalPanel();

	Button profilButton = new Button("Profil");
	Button sprofilButton = new Button("Suchprofil");
	Button homeButton = new Button("Startseite");
	Button merkButton = new Button("Merkliste");
	Button sperrButton = new Button("Sperrliste");

	public Widget menuWidget() {

		menuPanel.add(homeButton);
		menuPanel.add(profilButton);
		menuPanel.add(sprofilButton);
		menuPanel.add(merkButton);
		menuPanel.add(sperrButton);

		// Abstand zwischen den einzelnen Buttons
		menuPanel.setSpacing(20);

		// Layout Button
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
	
	
	  private Profil loginInfo = null;
	  private VerticalPanel loginPanel = new VerticalPanel();
	  private Label loginLabel = new Label(
	      "Please sign in to your Google Account to access the StockWatcher application.");
	  private Anchor signInLink = new Anchor("Sign In");
	
	
	

	public void onModuleLoad() {
		
		
		// Check login status using login service.
	    AdministrationAsync loginService = GWT.create(Administration.class);
	    loginService.login(GWT.getHostPageBaseURL(), new AsyncCallback<LoginInfo>() {
	      public void onFailure(Throwable error) {
	      }

	      public void onSuccess(LoginInfo result) {
	        loginInfo = result;
	        if(loginInfo.isLoggedIn()) {
	          loadStockWatcher();
	        } else {
	          loadLogin();
	        }
	      }
	    });
	  }

	  private void loadLogin() {
	    // Assemble login panel.
	    signInLink.setHref(loginInfo.getLoginUrl());
	    loginPanel.add(loginLabel);
	    loginPanel.add(signInLink);
	    RootPanel.get("stockList").add(loginPanel);
	  }
		

		// Fügt die Menüleiste hinzu
		VerticalPanel hpanel = new VerticalPanel();
		RootPanel.get("nav").add(hpanel);
		hpanel.add(menuWidget());
		
		
		
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
		homeButton.click();
	}
	
}
