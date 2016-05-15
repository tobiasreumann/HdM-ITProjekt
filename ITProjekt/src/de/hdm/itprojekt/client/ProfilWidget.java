package de.hdm.itprojekt.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;

public class ProfilWidget extends Composite {

	VerticalPanel profilWidgetPanel = new VerticalPanel();

	TextBox vNameBeschreibung = new TextBox();
	TextBox nNameBeschreibung = new TextBox();
	TextBox gebBeschreibung = new TextBox();
	TextBox religionBeschreibung = new TextBox();

	IntegerBox groesseBeschreibung = new IntegerBox();

	ListBox geschlechtAuswahl = new ListBox();
	ListBox haarAuswahl = new ListBox();
	ListBox raucherAuswahl = new ListBox();

	Button speicherButton = new Button("Profil Speichern");
	Button profilBearbeiten = new Button("Profil bearbeiten");

	Grid profilGrid = new Grid(8, 2);

	public ProfilWidget(final TestProfil p) {

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
		profilBearbeiten.setPixelSize(270, 30);
		haarAuswahl.setPixelSize(150, 30);
		geschlechtAuswahl.setPixelSize(150, 30);
		raucherAuswahl.setPixelSize(150, 30);

		profilWidgetPanel.add(profilGrid);
		profilWidgetPanel.add(profilBearbeiten);
		profilWidgetPanel.add(speicherButton);

		profilBearbeiten.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				auswahlwerteEinfuegen(p);
			}
		});
		speicherButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				profilSpeichern(p);
			}
		});

		profilwerteAnzeigen(p);

		initWidget(profilWidgetPanel);
	}

	public void profilwerteAnzeigen(TestProfil t) {

		/**
		 * Einf�gen der gesetzten Eigenschaften des jeweiligen Nutzerprofils
		 */

		geschlechtAuswahl.addItem(t.getGeschlecht());
		haarAuswahl.addItem(t.getHaarfarbe());

		if (t.isRaucher()) {
			raucherAuswahl.addItem("ja");
		} else {
			raucherAuswahl.addItem("nein");
		}
		;
		vNameBeschreibung.setValue(t.getVorname());
		nNameBeschreibung.setValue(t.getName());
		// gebBeschreibung.setValue(t.getGeburtsdatum());
		groesseBeschreibung.setValue(t.getGroesse());
		religionBeschreibung.setValue(t.getReligion());

		// Felder ausgrauen
		geschlechtAuswahl.setEnabled(false);
		haarAuswahl.setEnabled(false);
		raucherAuswahl.setEnabled(false);
		vNameBeschreibung.setEnabled(false);
		nNameBeschreibung.setEnabled(false);
		gebBeschreibung.setEnabled(false);
		groesseBeschreibung.setEnabled(false);
		religionBeschreibung.setEnabled(false);
	}

	public void auswahlwerteEinfuegen(TestProfil t) {
		// Setzen der �nderbarkeit der Eingabefelder
		geschlechtAuswahl.setEnabled(true);
		haarAuswahl.setEnabled(true);
		raucherAuswahl.setEnabled(true);
		vNameBeschreibung.setEnabled(true);
		nNameBeschreibung.setEnabled(true);
		gebBeschreibung.setEnabled(true);
		groesseBeschreibung.setEnabled(true);
		religionBeschreibung.setEnabled(true);
		geschlechtAuswahl.clear();
		haarAuswahl.clear();
		raucherAuswahl.clear();

		// Optionen für die Auswahl Geschlecht
	
		TestProfil temp = new TestProfil();
		for (int i = 0; i < temp.getGeschlechtArray().length; i++) {
			geschlechtAuswahl.addItem(temp.getGeschlechtArray()[i]);
		}

		// Optionen für die Auswahl Haarfarbe
		for (int i = 0; i < temp.getHaarfarbeArray().length; i++) {
			haarAuswahl.addItem(temp.getHaarfarbeArray()[i]);
		}

		// Optionen für die Auswahl Raucher
		for (int i = 0; i < temp.getRaucherArray().length; i++) {
			raucherAuswahl.addItem(temp.getRaucherArray()[i]);
		}

	}

	public void profilSpeichern(TestProfil t) {

		// Ausgrauen der Eingabefelder
		geschlechtAuswahl.setEnabled(false);
		haarAuswahl.setEnabled(false);
		raucherAuswahl.setEnabled(false);
		vNameBeschreibung.setEnabled(false);
		nNameBeschreibung.setEnabled(false);
		gebBeschreibung.setEnabled(false);
		groesseBeschreibung.setEnabled(false);
		religionBeschreibung.setEnabled(false);
	}

}
