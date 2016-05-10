package de.hdm.itprojekt.client;

import java.util.Vector;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;


public class InfoWidget extends Composite{	
	
//-----------------------------------------------------------------------	
//Sonstige	
//-----------------------------------------------------------------------	
	
	private VerticalPanel infoWidgetPanel = new VerticalPanel();	
	private ListBox auswahlBox = new ListBox();

//-----------------------------------------------------------------------
//FlexTable erstellen
//-----------------------------------------------------------------------
	
	private FlexTable infoTable = new FlexTable();



//-----------------------------------------------------------------------
// Methode die eine Reihe hinzufügt
//-----------------------------------------------------------------------

	private void addRow (FlexTable flexTable, Widget widget, String string) {
		int numRows = flexTable.getRowCount();
		flexTable.setHTML(numRows, 0, string+": ");
		flexTable.setWidget(numRows, 1, widget);
		flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows + 1);
	}


//-----------------------------------------------------------------------
// Methode die eine Reihe löscht
//-----------------------------------------------------------------------

	private void removeRow(FlexTable flexTable) {
		int numRows = flexTable.getRowCount();
		if (numRows > 1) {
			flexTable.removeRow(numRows - 1);
			flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows - 1);
		}
	}



//-------------------------------------------------------------------------
// Methode die eine DialogBox zum erzeugen einer neuen Eigenschaft erstellt	
//-------------------------------------------------------------------------



private Label header = new Label("Füge eine neue Eigenschaft hinzu: ");	
private TextBox newEigenschaftBox = new TextBox();
private Button esButton = new Button("Eigenschaft speichern");
private Button closeButton = new Button("Schließen");


private DialogBox createDiBox(){
	
	final DialogBox dialogBox = new DialogBox();
	
	dialogBox.setText("Eigenschaft hinuzfügen");
	
	// DropDown-Feld zur Auswahl von Auswahl-Feld oder Beschreibungsfeld
		String[] auswahlArray = {"Eingabefeld", "Dropdown-Liste"};
		for (int i = 0; i< auswahlArray.length; i++) {
			auswahlBox.addItem(auswahlArray[i]);
		}
		
	VerticalPanel hizuPanel = new VerticalPanel();
	hizuPanel.setSpacing(5);
	hizuPanel.add(header);
	
	Grid hizuGrid = new Grid(2,2);
	hizuGrid.setCellSpacing(5);
	hizuGrid.setHTML(0, 0, "Eigenschaft: ");
	hizuGrid.setWidget(0, 1, newEigenschaftBox);
	hizuGrid.setHTML(1, 0, "Eingabeart: ");
	hizuGrid.setWidget(1, 1, auswahlBox);
	hizuPanel.add(hizuGrid);
	
	HorizontalPanel buttonPanel = new HorizontalPanel();
	buttonPanel.setSpacing(5);
	buttonPanel.add(esButton);
	buttonPanel.add(closeButton);
	hizuPanel.add(buttonPanel);	

	dialogBox.add(hizuPanel);	
		
	return dialogBox;
}




//-----------------------------------------------------------------
// Methode um die DropDown-Box (dpBox) zu erstellen
//-----------------------------------------------------------------

//Für DropDown-Feld
	private Label dpLabel = new Label("Bitte geben Sie die Auswahloptionen an: ");
	private TextBox dp1Box = new TextBox();
	private TextBox dp2Box = new TextBox();
	private TextBox dp3Box = new TextBox();
	private TextBox dp4Box = new TextBox();
	private TextBox dp5Box = new TextBox();
	private TextBox dp6Box = new TextBox();
	private TextBox dp7Box = new TextBox();
	private TextBox dp8Box = new TextBox();
	private VerticalPanel dpPanel = new VerticalPanel();
	private HorizontalPanel dpButtonPanel = new HorizontalPanel();
	private Button dpCloseButton = new Button("Schließen");
	private Button dpSaveButton = new Button("Speichern");	



private DialogBox createDpBox(){
	DialogBox dpBox = new DialogBox();
	
	dpPanel.setSpacing(5);
	dpButtonPanel.setSpacing(5);
	dpPanel.add(dpLabel);
	dpPanel.add(dp1Box);
	dpPanel.add(dp2Box);
	dpPanel.add(dp3Box);
	dpPanel.add(dp4Box);
	dpPanel.add(dp5Box);
	dpPanel.add(dp6Box);
	dpPanel.add(dp7Box);
	dpPanel.add(dp8Box);
	dpButtonPanel.add(dpSaveButton);
	dpButtonPanel.add(dpCloseButton);
	dpPanel.add(dpButtonPanel);
	dpBox.add(dpPanel);
	
	return dpBox;
}



//Erstellen der DialogBoxen

	
	
	
	
	
//	public void reloadDialogBoxen(){
//		
//		DialogBox newDpBox = new DialogBox();
//		DialogBox newDiBox = new DialogBox();
//		
//		newDpBox = createDpBox();
//		newDiBox = createDiBox();
//
//		this.dialogBox = newDiBox;
//		this.dpBox = newDpBox;
//	}		



//Neue Instanz einer Info erstellen		
		private TestInfo neueInfo = new TestInfo();

	
		
//-----------------------------------------------------------------
//Konstruktor zum erzeugen des Info- Widget!
//-----------------------------------------------------------------
	
	public InfoWidget(){
	
// erstellen der DialogBoxen
		final DialogBox dpBox = createDpBox();
		final DialogBox dialogBox = createDiBox();
		
		


		
/**
* CLICK_HANDLER: Button der die DialogBox zum erstellen einer neuen Eigenschaft aufruft
*/
			        			        
		Button addRowButton = new Button("Eigenschaft hinzufügen");
		addRowButton.addClickHandler(new ClickHandler(){
		public void onClick(ClickEvent event) {						
			
		dialogBox.setGlassEnabled(true);
		dialogBox.setAnimationEnabled(true);	
		dialogBox.center();
		dialogBox.show();
		}
	});
		

/**
* CLICK-HANDLER: Button zum schließen der DialogBox	
*/		
									
		closeButton.addClickHandler(new ClickHandler(){
		public void onClick(ClickEvent event) {	
	
		dialogBox.hide();
		
		} 							
	}); 		
		   	
		
/**
* CLICK-HANDLER: Button um ein neues Beschreibungs-Feld zu erzeugen oder um die DropDown-DialogBox anzuzeigen
*/	
		    
		esButton.addClickHandler(new ClickHandler(){
		public void onClick(ClickEvent event) {								
						
		//	Wenn "Beschreibungs-Feld" angegeben ist wird ein neues BeschreibungsFeld hinzugefügt
						
		if(auswahlBox.getValue(auswahlBox.getSelectedIndex()).equals("Eingabefeld") ){
		
			TextBox uebergabeBox = new TextBox();
			// Erzeugt eine neue Eigenschaft und setzt deren Bezeichnung
			TestBeschreibungseigenschaft neueEigenschaft = new TestBeschreibungseigenschaft(newEigenschaftBox.getValue());
			uebergabeBox.setTitle(neueEigenschaft.getBezeichnung());
			
			//Die Übergebene Eigenschaft wird in einem Vector gespeichert
			Vector<TestEigenschaft> eig = neueInfo.getEigenschaften();
			eig.add(neueEigenschaft);
			neueInfo.setEigenschaften(eig);	
			
		addRow(infoTable, uebergabeBox , newEigenschaftBox.getValue());
		

		
		dialogBox.hide();
						
		// Wenn "DropDown-Feld" angegeben ist wird eine neue DialogBox angezeigt. 
		//	In dieser Box können die Auswahloptionen eingetragen werden.	
						
		} else if(auswahlBox.getValue(auswahlBox.getSelectedIndex()).equals("Dropdown-Liste")){

		dpBox.setGlassEnabled(true);
		dpBox.setAnimationEnabled(true);
		dpBox.center();
		dpBox.show();
			}
		}		
	});
		

/**
* CLICK-HANDLER: Button um die DropDown DialogBox zu schließen 	
*/
		dpCloseButton.addClickHandler(new ClickHandler(){
		public void onClick(ClickEvent event) {
		dpBox.hide();
		dialogBox.hide();
		}	
	});
								
/**
* CLICK-HANDLER: Button um die eingegebenen Auswahloptionen zu übernehmen
*/
								
		dpSaveButton.addClickHandler(new ClickHandler(){
		public void onClick(ClickEvent event) {
																				
		String[] auswahlOptionen = {dp1Box.getValue(), dp2Box.getValue(), dp3Box.getValue(), dp4Box.getValue(), dp5Box.getValue(), 
											dp6Box.getValue(), dp7Box.getValue(),dp8Box.getValue()};
									
		ListBox uebergabeBox = new ListBox();
		
		//Erzeugen einer neuen Auswahleigenschaft
		TestAuswahleigenschaft neueAuswahleigenschaft = new TestAuswahleigenschaft(auswahlOptionen, newEigenschaftBox.getValue());
		uebergabeBox.setTitle(neueAuswahleigenschaft.getBezeichnung());
		
									
		// Schleife die die übergebenen Auswahloptionen in eine ListBox schreibt und übergibt.
									
		for(int i=0; i< neueAuswahleigenschaft.getAuswahl().length; i++){
			if(!neueAuswahleigenschaft.getAuswahl()[i].equals("")){
				uebergabeBox.addItem(neueAuswahleigenschaft.getAuswahl()[i]);
				} 									
			}
									
									
		addRow(infoTable, uebergabeBox, newEigenschaftBox.getValue());
		dpBox.hide();	
		dialogBox.hide();
		}		
	});		
				

	
		
		
//_____________________________________________________________________________________________________________
		
/**
* CLICK-HANDLER: Button der die letzte Eigenschaft löscht
*/		
			        
		Button removeRowButton = new Button("Eigenschaft löschen");
		removeRowButton.addClickHandler(new ClickHandler(){
		public void onClick(ClickEvent event) {
		removeRow(infoTable);							
		}
	});	
		
		// Button zum speichern der Infos von Beschreibungs- oder Auswahlfeldern 
		Button speichernButton = new Button("Speichern");
		speichernButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
				// TODO: INFOS ERZEUGEN UND ABSPEICHERN
			
				for(int i=0; i< neueInfo.getEigenschaften().capacity(); i++){
					System.out.println(neueInfo.getEigenschaften().elementAt(i).getBezeichnung());
				}
		}
	});
			  
			       		   
			        
		// Neues Panel erstellen in dem die Buttons zum erstellen und löschen einer neuen Reihe eingefügt werden	        
		VerticalPanel buttonPanel = new VerticalPanel();
		buttonPanel.setSpacing(5);
		buttonPanel.add(addRowButton);
		buttonPanel.add(removeRowButton);
		buttonPanel.add(speichernButton);
		
		// Die FlexTable "infoTabel" wird hier formatiert
		FlexCellFormatter cellFormatter = infoTable.getFlexCellFormatter();
		infoTable.setWidth("40em");
		infoTable.setCellSpacing(5);
		infoTable.setCellPadding(3);					
				    
		//Überschrift einfügen
		cellFormatter.setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_LEFT);
		infoTable.setHTML(0, 0, "Gib noch weitere Informationen über dich an:");
		cellFormatter.setColSpan(0, 0, 2);
				  			        
		// Einfügen der Button in die InfoTable		        
		infoTable.setWidget(0, 1, buttonPanel);
		cellFormatter.setVerticalAlignment(0, 1, HasVerticalAlignment.ALIGN_TOP);	        
		
		//Einfügen der infoTable in ein neues Panel, das letztendlich als Widget initialisiert wird
		infoWidgetPanel.add(infoTable);
		
		// Alle einzelnen Widgets im Panel "infoWidgetPanel" werden nun als ein Widget initialisiert
	    initWidget(infoWidgetPanel);	      				
	}
	
}

