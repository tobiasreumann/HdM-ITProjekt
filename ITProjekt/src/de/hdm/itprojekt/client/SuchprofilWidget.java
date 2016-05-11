package de.hdm.itprojekt.client;

import com.google.gwt.dom.client.Document;
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
	TextBox alterMin = new TextBox();
	TextBox alterMax = new TextBox();
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
		}}});
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
		}}});
		
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
//		ftable.setBorderWidth(1);
//		bezTable.setBorderWidth(1);
		vPanel.setBorderWidth(1);

		
		com.google.gwt.dom.client.Element elt = Document.get().getElementById("content");
		int width = elt.getOffsetWidth();
		String w = width + "px";
		ftable.setWidth(w);
		bezTable.setWidth(w);
		
		vPanel.add(ftable);
		
		initWidget(vPanel);

	}
	
	public void neuesSuchprofil(){
	
		bezeichnung.setEnabled(false);
		bezTable.setHTML(1, 0, "<div><b>neues Profil:</b></div>");
		bezTable.setWidget(1, 2, neuBezeichnung);
		neuBezeichnung.setWidth("100%");
		alterMin.setValue(null);
		alterMax.setValue(null);
		haarfarbe.setSelectedIndex(0);
		geschlecht.setSelectedIndex(0);
		raucher.setSelectedIndex(0);
		
	}
	
	
}
