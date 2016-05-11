package de.hdm.itprojekt.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.AdministrationAsync;
import de.hdm.itprojekt.shared.bo.Profil;

public class ProfilWidget extends Composite{
	
	
	AdministrationAsync administration = ClientsideSettings.getAdministration();
	


	VerticalPanel profilWidgetPanel = new VerticalPanel();
	
	TextBox vNameBeschreibung = new TextBox();
	TextBox nNameBeschreibung = new TextBox();
	TextBox gebBeschreibung = new TextBox();
	TextBox groesseBeschreibung = new TextBox();
	TextBox religionBeschreibung = new TextBox();
	
	ListBox geschlechtAuswahl = new ListBox();
	ListBox haarAuswahl = new ListBox();
	ListBox raucherAuswahl = new ListBox();
	
	Button speicherButton = new Button("Speichern");

	
	
public ProfilWidget(){
	
	Grid profilGrid = new Grid(8,2);
	profilGrid.setCellSpacing(10);
	profilGrid.setHTML(0, 0, "Vorname: ");
	profilGrid.setWidget(0, 1, vNameBeschreibung);
	profilGrid.setHTML(1, 0, "Nachname: ");
	profilGrid.setWidget(1, 1, nNameBeschreibung);
	profilGrid.setHTML(2, 0, "Geschlecht: ");
	profilGrid.setWidget(2, 1, geschlechtAuswahl);
	profilGrid.setHTML(3, 0, "Geburtsdatum: ");
	profilGrid.setWidget(3, 1, gebBeschreibung);
	profilGrid.setHTML(4, 0, "Haarfarbe: ");
	profilGrid.setWidget(4, 1, haarAuswahl);
	profilGrid.setHTML(5, 0, "Körpergröße: ");
	profilGrid.setWidget(5, 1, groesseBeschreibung);
	profilGrid.setHTML(6, 0, "Raucher: ");
	profilGrid.setWidget(6, 1, raucherAuswahl);
	profilGrid.setHTML(7, 0, "Religion: ");
	profilGrid.setWidget(7, 1, religionBeschreibung);
	
	speicherButton.setPixelSize(270, 30);
	haarAuswahl.setPixelSize(150, 30);
	geschlechtAuswahl.setPixelSize(150, 30);

	
	//Optionen für die Auswahl Geschlecht
	String[] geschlechtArray = {"Männlich", "Weiblich"};
	for (int i = 0; i<geschlechtArray.length; i++) {
		geschlechtAuswahl.addItem(geschlechtArray[i]);
	}
	
	//Optionen für die Auswahl Haarfarbe
	String[] haarfarbeArray = {"braun", "blond", "schwarz", "rot", "lila", "grün", "blau"};
	for (int i = 0; i<haarfarbeArray.length; i++) {
		haarAuswahl.addItem(haarfarbeArray[i]);
	}
	
	//Optionen für die Auswahl Raucher
	String[] raucherArray = {"Nichtraucher", "Raucher", "Gelegenheitsraucher"};
	for (int i = 0; i<raucherArray.length; i++) {
		raucherAuswahl.addItem(raucherArray[i]);
	}
	
	
	
	speicherButton.addClickHandler(new ClickHandler(){
		public void onClick(ClickEvent event) {
			ProfilBearbeitenCallback aendernProfil = new ProfilBearbeitenCallback();
			
		}
		
	});
	
	
	
/**
 * setzen der in der Datenbank enthaltenen Werte in die Felder (Momentan Beispielwerte)
 * 
 */
	

	vNameBeschreibung.setValue("Fabian");
	nNameBeschreibung.setValue("König");
	gebBeschreibung.setValue("27.05.1993");
	groesseBeschreibung.setValue("180cm");
	religionBeschreibung.setValue("-");
	

	profilWidgetPanel.add(profilGrid);
	profilWidgetPanel.add(speicherButton);
	
	initWidget(profilWidgetPanel);
	}
}


class ProfilBearbeitenCallback implements AsyncCallback<Profil>{

	@Override
	public void onFailure(Throwable caught) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onSuccess(Profil result) {
		// TODO Auto-generated method stub
		Profil profil = null;
		

		}
	}
	

