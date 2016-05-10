package de.hdm.itprojekt.client;

import com.google.gwt.user.client.ui.*;


public class SuchprofilWidget {
	
	VerticalPanel vPanel = new VerticalPanel();
	Grid bezGrid = new Grid(3, 2);
	Grid grid = new Grid(4, 5);
	
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
	
	
	public SuchprofilWidget(){
		
		bezGrid.setHTML(0, 0, "Suchprofil: ");
		bezGrid.setWidget(0, 1, bezeichnung);
		
		vPanel.add(bezGrid);
		
		grid.setHTML(0, 0, "Alter:");
		grid.setHTML(1, 0, "von ");
		grid.setWidget(1, 1, alterMin);
		grid.setHTML(1, 2, "bis");
		grid.setWidget(1, 3, alterMax);
		grid.setHTML(2, 0, "Haarfarbe: ");
		grid.setWidget(3, 0, haarfarbe);
		grid.setHTML(0, 4, "Geschlecht:");
		grid.setWidget(1, 4, geschlecht);
		grid.setHTML(2, 4, "Raucher: ");
		grid.setWidget(3, 4, raucher);
		
		
		
		
		
	}
	
	
	
	

}
