package de.hdm.itprojekt.client;

import com.google.gwt.user.client.ui.*;


public class InfoWidget extends Composite{

VerticalPanel infoWidgetPanel = new VerticalPanel();
	
TextBox hobbyBox = new TextBox();
TextBox wohnortBox = new TextBox();
TextBox buchBox = new TextBox();
TextBox filmBox = new TextBox();
TextBox jobBox = new TextBox();
TextBox gehaltBox = new TextBox();

Label infoLabel = new Label("Gib weitere Informatione zu dir an: ");

ListBox bstatusBox = new ListBox();

Button speicherButton = new Button("Speichern");
	
	public InfoWidget(){


		Grid infoGrid = new Grid(7,2);
		infoGrid.setCellSpacing(10);
		infoGrid.setHTML(0, 0, "Beziehungsstatus: ");
		infoGrid.setWidget(0, 1, bstatusBox);
		infoGrid.setHTML(1, 0, "Wohnort: ");
		infoGrid.setWidget(1, 1, wohnortBox);
		infoGrid.setHTML(2, 0, "Arbeitsverhältniss: ");
		infoGrid.setWidget(2, 1, jobBox);
		infoGrid.setHTML(3, 0, "Gehalt: ");
		infoGrid.setWidget(3, 1, gehaltBox);
		infoGrid.setHTML(4, 0, "Lieblingsfilm: ");
		infoGrid.setWidget(4, 1, filmBox);
		infoGrid.setHTML(5, 0, "Lieblingsbuch: ");
		infoGrid.setWidget(5, 1, buchBox);
		infoGrid.setHTML(6, 0, "Interessen: ");
		infoGrid.setWidget(6, 1, hobbyBox);

		
	//Größe von Button/Auswahl festlegen	
		speicherButton.setPixelSize(270, 30);
		bstatusBox.setPixelSize(150, 30);
		
	//Optionen für die Auswahl Beziehungsstatus
		String[] bstatusArray = {"in einer Beziehung", "verheiratet", "single"};
		for (int i = 0; i<bstatusArray.length; i++) {
			bstatusBox.addItem(bstatusArray[i]);
		}
		
		infoWidgetPanel.add(infoLabel);
		infoWidgetPanel.add(infoGrid);
		infoWidgetPanel.add(speicherButton);
		
		initWidget(infoWidgetPanel);
		
	}
	
}

