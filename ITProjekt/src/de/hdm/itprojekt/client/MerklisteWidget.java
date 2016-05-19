package de.hdm.itprojekt.client;

import java.util.Vector;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;

public class MerklisteWidget extends Composite {
	public static final ProvidesKey<TestProfil> KEY_PROVIDER = new ProvidesKey<TestProfil>() {

		public Object getKey(TestProfil item) {
			return item == null ? null : item.getId();
		}
	};
	
	Button profilEntfernen = new Button("Profil von Merkliste entfernen");

	public MerklisteWidget( final Vector<TestProfil> merkprofile) {
		
		
		CellTable<TestProfil> merkliste = new CellTable<TestProfil>(KEY_PROVIDER);

		/*
		 * Das SelectionModel wird zur Tabelle der gemerkten Profile hinzugefügt
		 * und gewährleistet, ähnlich einem ClickHandler, dass beim Klicken auf
		 * eine Tabellenzeile das jeweilige Objekt zurückgegeben wird.
		 */
		final SingleSelectionModel<TestProfil> selectionModel = new SingleSelectionModel<TestProfil>(KEY_PROVIDER);

		merkliste.setSelectionModel(selectionModel);

		/*
		 * Das durch den SelectionHandler zurückgegebene Profil wird an eine
		 * Instanz des MerklisteWidgets übergeben. 
		 */
		selectionModel.addSelectionChangeHandler(new Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				Vector<TestProfil> gemerktesProfil = new Vector<TestProfil>();
				gemerktesProfil.addElement(selectionModel.getSelectedObject());
				DialogBox profilAnzeige = new DialogBox();
				ProfilWidget profilWidget = new ProfilWidget(gemerktesProfil);
				profilAnzeige.add(profilWidget);
				profilAnzeige.add(profilEntfernen);
				profilEntfernen.addClickHandler(new ClickHandler() {			
						public void onClick(ClickEvent event) {
						merkprofile.removeElement(selectionModel.getSelectedObject());
						
						RootPanel.get("content").clear();
						RootPanel.get("content").add(new MerklisteWidget(merkprofile));
						return;					
				}});
				profilAnzeige.setAutoHideEnabled(true);
				profilAnzeige.center();
				profilAnzeige.show();
			}
		});
	
	/**
	 * Erzeugen der einzelnen Spalten und definieren ihrer Inhalte.
	 */
	TextColumn<TestProfil> vnameColumn = new TextColumn<TestProfil>() {
		public String getValue(TestProfil object) {
			return object.getVorname();
		}
	};

	TextColumn<TestProfil> nameColumn = new TextColumn<TestProfil>() {
		public String getValue(TestProfil object) {
			return object.getName();
		}
	};

	TextColumn<TestProfil> geschlechtColumn = new TextColumn<TestProfil>() {
		public String getValue(TestProfil object) {
			return object.getGeschlecht();
		}
	};
	TextColumn<TestProfil> haarfarbeColumn = new TextColumn<TestProfil>() {
		public String getValue(TestProfil object) {
			return object.getHaarfarbe();
		}
	};

	Column<TestProfil, Number> alterColumn = new Column<TestProfil, Number>(new NumberCell()) {
		public Number getValue(TestProfil object) {

			return object.getAlter();
		}
	};
	TextColumn<TestProfil> raucherColumn = new TextColumn<TestProfil>() {
		public String getValue(TestProfil object) {
			if (object.isRaucher()) {
				return "ja";
			} else {
				return "nein";
			}
		}
	};

	Column<TestProfil, Number> aehnlichkeitColumn = new Column<TestProfil, Number>(new NumberCell()) {
		public Number getValue(TestProfil object) {

			return object.getAehnlichkeitswert();
		}
	};
	

	/**
	 * Hinzufügen der Spalten zur Tabelle, in der Reihenfolge von Links nach
	 * Rechts. Definition der Spaltennamen.
	 */
	merkliste.addColumn(vnameColumn, "Vorname");
	merkliste.addColumn(nameColumn, "Name");
	merkliste.addColumn(geschlechtColumn, "Geschlecht");
	merkliste.addColumn(raucherColumn, "Raucher");
	merkliste.addColumn(haarfarbeColumn, "Haarfarbe");
	merkliste.addColumn(alterColumn, "Alter");
	merkliste.addColumn(aehnlichkeitColumn, "Ähnlichkeit");
	}
}
