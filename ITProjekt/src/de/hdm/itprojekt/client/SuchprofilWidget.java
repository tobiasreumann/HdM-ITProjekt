package de.hdm.itprojekt.client;

import java.util.Vector;

import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.*;

public class SuchprofilWidget extends Composite {

	VerticalPanel vPanel = new VerticalPanel();
	HorizontalPanel buttons = new HorizontalPanel();

	FlexTable bezTable = new FlexTable();
	FlexTable ftable = new FlexTable();

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

		haarfarbe.setWidth("50%");
		geschlecht.setWidth("50%");
		raucher.setWidth("50%");
		bezeichnung.setWidth("100%");
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

		initWidget(vPanel);

	}

	/*
	 * @TR Die Methode soll das SuchprofilWidget f�r die Eingabe eines neuen
	 * Suchprofils vorbereiten. Sie soll durch den Klickhandler des Buttons
	 * "neu" aufgerufen werden.
	 */
	public void neuesSuchprofil() {

		bezeichnung.setEnabled(false);
		bezTable.setHTML(1, 0, "<div><b>neues Profil:</b></div>");
		bezTable.setWidget(1, 2, neuBezeichnung);
		neuBezeichnung.setWidth("100%");
		alterMin.setValue(null);
		alterMax.setValue(null);

		// Die Auswahloptionen werden den jeweiligen Dropdown-Felder
		// hinzugef�gt.
		TestSuchprofil temp = new TestSuchprofil();
		String[] tempGeschlecht = temp.getGeschlecht();
		String[] tempHaarfarbe = temp.getHaarfarbe();
		String[] tempRaucher = temp.getRaucher();

		for (int i = 0; i < tempGeschlecht.length; i++) {
			geschlecht.setValue(i, tempGeschlecht[i]);
		}
		for (int i = 0; i < tempHaarfarbe.length; i++) {
			haarfarbe.setValue(i, tempHaarfarbe[i]);
		}
		for (int i = 0; i < tempRaucher.length; i++) {
			raucher.setValue(i, tempRaucher[i]);
		}

		haarfarbe.setSelectedIndex(0);
		haarfarbe.setEnabled(true);
		geschlecht.setSelectedIndex(0);
		geschlecht.setEnabled(true);
		raucher.setSelectedIndex(0);
		raucher.setEnabled(true);

	}

	public void werteEinfuegen(Vector<TestSuchprofil> v) {

		// Die Namen der Suchprofile werden in die Dropdownbox "bezeichnnung"
		// eingef�gt.
		for (int i = 0; i < v.size(); i++) {
			bezeichnung.addItem(v.get(i).getName());
		}
		
		//Die Auswahlfelder sollen die gespeicherten Werte des Suchprofils unver�nderbar anzeigen.
		haarfarbe.setEnabled(false);
		geschlecht.setEnabled(false);
		raucher.setEnabled(false);
		
		//In den Dropdown-Feldern soll der jeweils gespeicherte Suchwert des gew�hlten Suchprofils angezeigt werden.
		final Vector<TestSuchprofil> temp = v;
		
		bezeichnung.addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
				
				alterMin.setValue(temp.get(bezeichnung.getSelectedIndex()).getAlterMin());
				alterMax.setValue(temp.get(bezeichnung.getSelectedIndex()).getAlterMin());
				haarfarbe.setValue(0, temp.get(bezeichnung.getSelectedIndex()).getHaarfarbeAuswahl());
				geschlecht.setValue(0, temp.get(bezeichnung.getSelectedIndex()).getGeschlechtAuswahl());
				//raucher.setValue(0, temp.get(bezeichnung.getSelectedIndex()));
				
			}
		});
	}

}
