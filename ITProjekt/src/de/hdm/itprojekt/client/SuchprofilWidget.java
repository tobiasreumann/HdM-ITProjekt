package de.hdm.itprojekt.client;

import java.util.Vector;

import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.*;

public class SuchprofilWidget extends Composite {

	VerticalPanel vPanel = new VerticalPanel();
	HorizontalPanel buttons = new HorizontalPanel();
	FlexTable bezTable = new FlexTable();
	FlexTable ftable = new FlexTable();
	ScrollPanel scrollpanel = new ScrollPanel();

	ListBox bezeichnung = new ListBox();
	TextBox neuBezeichnung = new TextBox();

	IntegerBox alterMin = new IntegerBox();
	IntegerBox alterMax = new IntegerBox();

	ListBox haarfarbe = new ListBox();
	ListBox geschlecht = new ListBox();
	ListBox raucher = new ListBox();

	Button neu = new Button("neu");
	Button loeschen = new Button("loeschen");
	Button speichern = new Button("speichern");
	Button partnervorschlaege = new Button("Partnervorschlaege anzeigen");

	// Testweise erstelltes Objekt, wird durch Nutzerprofil ersetzt (TODO)
	TestProfil urprofil = new TestProfil();

	public SuchprofilWidget() {
		neu.setWidth("45px");
		alterMin.setWidth("50px");
		alterMin.setMaxLength(2);
		alterMax.setWidth("50px");
		alterMax.setMaxLength(2);

		/**
		 * Die KeyPressHandler sollen die Eingabe von Werten ausserhalb des
		 * Wertebereichs [0-9]* verhindern.
		 */
		alterMin.addKeyPressHandler(new KeyPressHandler() {
			public void onKeyPress(KeyPressEvent event) {
				String input = alterMin.getText();
				if (!input.matches("[0-9]*")) {
					DialogBox error = new DialogBox();
					Label label = new Label("Nur Zahlenwerte erlaubt");
					error.add(label);
					error.setText("Error");
					error.center();
					error.show();
					error.setAutoHideEnabled(true);
					return;
				}
			}
		});
		alterMax.addKeyPressHandler(new KeyPressHandler() {
			public void onKeyPress(KeyPressEvent event) {
				String input = alterMax.getText();
				if (!input.matches("[0-9]*")) {
					DialogBox error = new DialogBox();
					Label label = new Label("Nur Zahlenwerte erlaubt");
					error.add(label);
					error.setText("Error");
					error.center();
					error.show();
					error.setAutoHideEnabled(true);
					return;
				}
			}
		});

		// Clickhandler werden zu den Buttons hinzugefügt.
		neu.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				neueSuchwertEingabe();
			}
		});
		loeschen.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				suchprofilLoeschen(urprofil.getSuchprofile());
			}
		});
		speichern.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				suchprofilSpeichern(urprofil.getSuchprofile());
			}
		});
		partnervorschlaege.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				PartnervorschlagWidget vorschlag = new PartnervorschlagWidget(TestSuchprofil.suchergebnis(
						TestProfil.getProfile(), urprofil.getSuchprofile().get(bezeichnung.getSelectedIndex())));
				
				scrollpanel.clear();
				scrollpanel.add(vorschlag);
				vPanel.add(scrollpanel);
				;
			}
		});

		haarfarbe.setWidth("50%");
		geschlecht.setWidth("50%");
		raucher.setWidth("50%");
		bezeichnung.setWidth("50%");
		bezTable.setHTML(0, 0, "<b>Suchprofil:</b>");
		bezTable.setWidget(0, 1, bezeichnung);
		bezTable.getColumnFormatter().setWidth(0, "12%");
		ftable.getColumnFormatter().setWidth(0, "12%");
		ftable.getColumnFormatter().setWidth(1, "350px");

		vPanel.add(bezTable);
		buttons.add(neu);
		buttons.add(loeschen);
		buttons.add(speichern);

		ftable.setHTML(0, 0, "<b>Alter:</b>");
		ftable.setHTML(1, 0, "<div align='right'>von</div>");
		ftable.setWidget(1, 1, alterMin);
		ftable.setHTML(2, 0, "<div align='right'>bis</div>");
		ftable.setWidget(2, 1, alterMax);
		ftable.setHTML(3, 0, "<b>Haarfarbe:</b>");
		ftable.setWidget(3, 1, haarfarbe);
		ftable.setHTML(0, 2, "<b>Geschlecht:</b>");
		ftable.setWidget(1, 2, geschlecht);
		ftable.setHTML(2, 2, "<b>Raucher:</b>");
		ftable.setWidget(3, 2, raucher);
		ftable.setWidget(4, 2, buttons);
		ftable.getCellFormatter().setHorizontalAlignment(4, 2, HasHorizontalAlignment.ALIGN_RIGHT);
		ftable.getCellFormatter().setHorizontalAlignment(5, 2, HasHorizontalAlignment.ALIGN_RIGHT);
		ftable.setWidget(5, 2, partnervorschlaege);
		// ftable.setBorderWidth(1);
		// bezTable.setBorderWidth(1);
		vPanel.setBorderWidth(1);

		/**
		 * Die Breite der Tabellen wird an die Breite des div-Elements "content"
		 * angepasst.
		 */
		com.google.gwt.dom.client.Element elt = Document.get().getElementById("content");
		int width = elt.getOffsetWidth();
		String w = width + "px";
		ftable.setWidth(w);
		bezTable.setWidth(w);

		vPanel.add(ftable);

		// TODO. löschen bzw. in profil des Nutzers abändern.
		werteEinfuegen(urprofil.getSuchprofile());

		initWidget(vPanel);

	}

	/*
	 * Die Methode soll das SuchprofilWidget für die Eingabe eines neuen
	 * Suchprofils vorbereiten und befüllt die ListBoxen mit den möglichen
	 * Auswahlwerten. Sie wird durch den Klickhandler des Buttons "neu"
	 * aufgerufen werden.
	 */
	public void neueSuchwertEingabe() {

		bezeichnung.setEnabled(false);
		bezTable.setHTML(1, 0, "<div><b>neues Profil:</b></div>");
		bezTable.setWidget(1, 1, neuBezeichnung);
		//neuBezeichnung.setWidth("50%");
		neuBezeichnung.setValue(null);
		alterMin.setValue(0);
		alterMax.setValue(99);

		// Die Auswahloptionen werden den jeweiligen Dropdown-Felder
		// hinzugefügt.
		alterMin.setEnabled(true);
		alterMax.setEnabled(true);
		haarfarbe.setEnabled(true);
		haarfarbe.clear();
		geschlecht.setEnabled(true);
		geschlecht.clear();
		raucher.setEnabled(true);
		raucher.clear();

		TestSuchprofil temp = new TestSuchprofil();

		for (int i = 0; i < temp.getGeschlecht().length; i++) {
			geschlecht.addItem(temp.getGeschlecht()[i]);
		}
		for (int i = 0; i < temp.getHaarfarbe().length; i++) {
			haarfarbe.addItem(temp.getHaarfarbe()[i]);
		}
		for (int i = 0; i < temp.getRaucher().length; i++) {
			raucher.addItem(temp.getRaucher()[i]);
		}

		haarfarbe.setSelectedIndex(0);
		geschlecht.setSelectedIndex(0);
		raucher.setSelectedIndex(0);

	}

	/*
	 * @TR Die Methode fügt dem Widget die gespeicherten Suchprofile hinzu und
	 * zeigt die jeweils gespeicherten Suchwerte bei Auswahl eines Suchprofils
	 * im jeweiligen Feld an.
	 */
	public void werteEinfuegen(Vector<TestSuchprofil> v) {

		// Die Namen der Suchprofile werden in die Dropdownbox "bezeichnnung"
		// eingefügt.
		bezeichnung.clear();
		for (int i = 0; i < v.size(); i++) {
			bezeichnung.addItem(v.get(i).getName());
		}

		// Die Auswahlfelder sollen die gespeicherten Werte des Suchprofils
		// unveränderbar anzeigen.
		haarfarbe.clear();
		geschlecht.clear();
		raucher.clear();

		if (!v.isEmpty()) {
			alterMin.setValue(v.firstElement().getAlterMin());
			alterMax.setValue(v.firstElement().getAlterMax());
			haarfarbe.addItem(v.firstElement().getHaarfarbeAuswahl());
			geschlecht.addItem(v.firstElement().getGeschlechtAuswahl());
			raucher.addItem(v.firstElement().getRaucherAuswahl());
			
		}
		alterMin.setEnabled(false);
		alterMax.setEnabled(false);
		haarfarbe.setEnabled(false);
		geschlecht.setEnabled(false);
		raucher.setEnabled(false);

		// In den Dropdown-Feldern soll der jeweils gespeicherte Suchwert des
		// gewählten Suchprofils angezeigt werden.
		final Vector<TestSuchprofil> temp = v;
		bezeichnung.addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
				haarfarbe.clear();
				geschlecht.clear();
				raucher.clear();
				alterMin.setValue(temp.get(bezeichnung.getSelectedIndex()).getAlterMin());
				alterMax.setValue(temp.get(bezeichnung.getSelectedIndex()).getAlterMax());
				haarfarbe.addItem(temp.get(bezeichnung.getSelectedIndex()).getHaarfarbeAuswahl());
				geschlecht.addItem(temp.get(bezeichnung.getSelectedIndex()).getGeschlechtAuswahl());
				raucher.addItem(temp.get(bezeichnung.getSelectedIndex()).getRaucherAuswahl());
			}
		});
	}

	/*
	 * Die Methode speichert die eingegebenen Suchwerte in einem neu
	 * instanziierten Suchprofil und fügt dieses Suchprofil dem Vector der
	 * Suchprofile hinzu. Anschließen speichert sie den Vector im Benutzerprofil
	 * des Nutzers. (TODO)
	 */
	public void suchprofilSpeichern(Vector<TestSuchprofil> v) {

		TestSuchprofil neuesProfil = new TestSuchprofil();
		neuesProfil.setHaarfarbeAuswahl(haarfarbe.getValue(haarfarbe.getSelectedIndex()));
		neuesProfil.setGeschlechtAuswahl(geschlecht.getValue(geschlecht.getSelectedIndex()));

		// Prüfung ob das Minimumalter kleiner dem Maximumalter ist, sowie
		// setzen von Werten bei leeren Feldern.

		if (alterMin.getValue() <= alterMax.getValue()) {
			neuesProfil.setAlterMin(alterMin.getValue());
			neuesProfil.setAlterMax(alterMax.getValue());
		} else {
			DialogBox error = new DialogBox();
			Label label = new Label("Das Minimumalter muss kleiner als das Maximumalter sein");
			error.add(label);
			error.setText("Error");
			error.center();
			error.show();
			error.setAutoHideEnabled(true);
			return;
		}

		// Prüfung welchen Wert der Nutzer für den Suchwert Raucher gewählt hat.
		// Bei "ja" oder "nein" wird der entsprechende boolean gesetzt, bei dem
		// neutralen "egal" wird der String RaucherEgal gesetzt.
		if (raucher.getValue(raucher.getSelectedIndex()).equals("egal")) {
			neuesProfil.setRaucherEgal("egal");
		} else if (raucher.getValue(raucher.getSelectedIndex()).equals("ja")) {
			neuesProfil.setRaucherAuswahl(true);
		} else if (raucher.getValue(raucher.getSelectedIndex()).equals("nein")) {
			neuesProfil.setRaucherAuswahl(false);
		}

		// Prüfung ob der eingegebene Profilname mind. 3 Zeichen enthält.
		if (neuBezeichnung.getValue().length() > 2) {
			neuesProfil.setName(neuBezeichnung.getValue());
			bezTable.clearCell(1, 1);
			bezTable.clearCell(1, 0);
			bezeichnung.setEnabled(true);
		} else {
			DialogBox error = new DialogBox();
			Label label = new Label("Bitte Suchprofilname mit mind. 3 Zeichen eingeben");
			error.add(label);
			error.setText("Error");
			error.center();
			error.show();
			error.setAutoHideEnabled(true);
			return;
		}
		v.addElement(neuesProfil);
		
		urprofil.setSuchprofile(v);
		werteEinfuegen(v);
		// TODO: An dieser Stelle muss der Suchprofil-Vector an das Profil des
		// Benutzers übergeben werden.

	}

	/*
	 * Die Methode löscht das in der Suchprofil-Auswahl ausgewählte Suchprofil.
	 */
	public void suchprofilLoeschen(Vector<TestSuchprofil> v) {
		v.remove(bezeichnung.getSelectedIndex());
		werteEinfuegen(v);
	}
}
