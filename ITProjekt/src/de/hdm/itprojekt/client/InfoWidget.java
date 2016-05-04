package de.hdm.itprojekt.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;


public class InfoWidget extends Composite{

VerticalPanel infoWidgetPanel = new VerticalPanel();	
TextBox hobbyBox = new TextBox();
TextBox wohnortBox = new TextBox();
TextBox buchBox = new TextBox();
TextBox filmBox = new TextBox();
TextBox jobBox = new TextBox();
TextBox gehaltBox = new TextBox();
ListBox bstatusBox = new ListBox();


//FlexTable erstellen

final FlexTable infoTable = new FlexTable();


// Methode die eine Reihe hinzufügt

private void addRow (FlexTable flexTable, Widget widget, String string) {
    int numRows = flexTable.getRowCount();
    flexTable.setHTML(numRows, 0, string+": ");
    flexTable.setWidget(numRows, 1, widget);
    flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows + 1);
  }


// Methode die eine Reihe löscht

private void removeRow(FlexTable flexTable) {
    int numRows = flexTable.getRowCount();
    if (numRows > 1) {
      flexTable.removeRow(numRows - 1);
      flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows - 1);
    }
  }


//Methode die eine DialogBox zum erzeugen einer neuen Eigenschaft erstellt	

Button esButton = new Button("Eigenschaft speichern");
Button closeButton = new Button("Schließen");
Label header = new Label("Füge eine neue Eigenschaft hinzu: ");	
VerticalPanel hizuPanel = new VerticalPanel();
TextBox newEigenschaftBox = new TextBox();
TextBox einzufuegendeBox = new TextBox();


private DialogBox createDiBox(){
	
	final DialogBox dialogBox = new DialogBox();
	dialogBox.setText("Eigenschaft hinuzfügen");
	
	hizuPanel.setSpacing(5);
	hizuPanel.add(header);
	
	Grid hizuGrid = new Grid(2,2);
	hizuGrid.setCellSpacing(5);
	hizuGrid.setHTML(0, 0, "Eigenschaft: ");
	hizuGrid.setWidget(0, 1, newEigenschaftBox);

	hizuPanel.add(hizuGrid);

	String[] auswahl = {"Dropdown-Feld", "Beschreibungs-Feld"};
	for (int i = 0; i < auswahl.length; i++){
		String auswahlInput = auswahl[i];
		RadioButton auswahlButtons = new RadioButton("auswahl", auswahlInput);
		hizuPanel.add(auswahlButtons);

	if (i==2){
		auswahlButtons.setValue(true);
	 	}
	}
	
	HorizontalPanel buttonPanel = new HorizontalPanel();
	buttonPanel.setSpacing(5);
	buttonPanel.add(esButton);
	buttonPanel.add(closeButton);
	
	hizuPanel.add(buttonPanel);	
	
	dialogBox.add(hizuPanel);		

	
/**
* CLICK-HANDLER zum einfügen der übergebenen Werte		
*/	
    
    esButton.addClickHandler(new ClickHandler(){

		@Override
		public void onClick(ClickEvent event) {
		addRow(infoTable, new TextBox() , newEigenschaftBox.getValue());
		dialogBox.hide();
			
		}
    });
    

/**
* CLICK-HANDLER zum einfügen der übergebenen Werte		
*/	
        
     closeButton.addClickHandler(new ClickHandler(){

    	 @Override
    	public void onClick(ClickEvent event) {
    		dialogBox.hide();
    			
    		}
        });
    
	
	
		return dialogBox;
}


//Konstruktor zum erzeugen des Info- Widget

	
	public InfoWidget(){
		
		FlexCellFormatter cellFormatter = infoTable.getFlexCellFormatter();
		infoTable.setWidth("40em");
		infoTable.setCellSpacing(5);
		infoTable.setCellPadding(3);
		
	    
	//Überschrift einfügen
	    cellFormatter.setHorizontalAlignment(
	            0, 1, HasHorizontalAlignment.ALIGN_LEFT);
	        infoTable.setHTML(0, 0, "Gib noch weitere Informationen über dich an:");
	        cellFormatter.setColSpan(0, 0, 2);
	   
	// DialogBox erstellen
	        
	    	final DialogBox dialogBox = createDiBox();
	    	dialogBox.setGlassEnabled(true);
	    	dialogBox.setAnimationEnabled(true);
	  
	    	
	    	
/**
 * CLICK_HANDLER!
 */
	        
	// Button einfügen, der eine DialogBox zum erstellen einer neuen Eigenschaft aufruft 
	        
	        Button addRowButton = new Button("Eigenschaft hinzufügen");
	        addRowButton.addClickHandler(new ClickHandler(){

				@Override
				public void onClick(ClickEvent event) {
				dialogBox.center();
				dialogBox.show();
					
				}
	        });
	        
	        
	 // Button einfügen, der eine Reihe löscht
	        
	        Button removeRowButton = new Button("Eigenschaft löschen");
	        removeRowButton.addClickHandler(new ClickHandler(){

				@Override
				public void onClick(ClickEvent event) {
				removeRow(infoTable);	
					
				}
	        });
	        
	  
	  
	        
	        VerticalPanel buttonPanel = new VerticalPanel();
	        buttonPanel.setSpacing(5);
	        buttonPanel.add(addRowButton);
	        buttonPanel.add(removeRowButton);
	        infoTable.setWidget(0, 1, buttonPanel);
	        cellFormatter.setVerticalAlignment(0, 1, HasVerticalAlignment.ALIGN_TOP);	        
	        
	        
	        infoWidgetPanel.add(infoTable);
	        
	        
	        initWidget(infoWidgetPanel);
	        
	   
/**
 * 
 
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
//		speicherButton.setPixelSize(270, 30);
		bstatusBox.setPixelSize(150, 30);
		
	//Optionen für die Auswahl Beziehungsstatus
		String[] bstatusArray = {"in einer Beziehung", "verheiratet", "single"};
		for (int i = 0; i<bstatusArray.length; i++) {
			bstatusBox.addItem(bstatusArray[i]);
		}
		
		infoWidgetPanel.add(infoLabel);
		infoWidgetPanel.add(infoGrid);
//		infoWidgetPanel.add(speicherButton);
		
		initWidget(infoWidgetPanel);
		
*/
		
		
	}
	
}

