package de.hdm.itprojekt.client;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.cellview.client.*;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

//import javafx.scene.control.SelectionModel;

public class PartnervorschlagWidget extends Composite {
	
 public static final ProvidesKey<TestProfil> KEY_PROVIDER = new ProvidesKey<TestProfil>() {
      
      public Object getKey(TestProfil item) {
        return item == null ? null : item.getId();
	      }
	    };

	public PartnervorschlagWidget(Vector<TestProfil> p) {

		CellTable<TestProfil> partnervorschlag = new CellTable<TestProfil>(KEY_PROVIDER);
		
		final SingleSelectionModel<TestProfil> selectionModel = new SingleSelectionModel<TestProfil>(KEY_PROVIDER);
		
//		selectionModel.addSelectionChangeHandler(new Handler() {
//			
//			public void onSelectionChange(SelectionChangeEvent event) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		/**
		 * Erzeugen der einzelnen Spalten und definieren ihrer Inhalte.
		 */
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

		Column<TestProfil, Number> alterColumn = new Column<TestProfil, Number>(new NumberCell()) {
			public Number getValue(TestProfil object) {

				return object.getAlter();
			}
		};

		Column<TestProfil, Number> aehnlichkeitColumn = new Column<TestProfil, Number>(new NumberCell()) {
			public Number getValue(TestProfil object) {

				return object.getAehnlichkeitswert();
			}
		};
		//TODO: weitere Spalten wie "raucher" oder "haarfarbe" hinzufügen"

		/**
		 * Hinzufügen der Spalten zur Tabelle, in der Reihenfolge von Links nach
		 * Rechts. Definition der Spaltennamen.
		 */
		partnervorschlag.addColumn(nameColumn, "Name");
		partnervorschlag.addColumn(geschlechtColumn, "Geschlecht");
		partnervorschlag.addColumn(alterColumn, "Alter");
		partnervorschlag.addColumn(aehnlichkeitColumn, "Ähnlichkeit");

	
		//Sortieren des Vectors nach dem Ähnlichkeitswert der Profile (TODO: in Applikationslogik verschieben?)
		Collections.sort(p, new Comparator<TestProfil>() {
			public int compare(TestProfil o1, TestProfil o2) {
				return o1.getAehnlichkeitswert()-o2.getAehnlichkeitswert();
			}});
		
		/**
		 * Füllen der Tabellenzeilen mit Werten (TODO)
		 */
		partnervorschlag.setRowData(0, p);

		/**
		 * Die Breite der Tabelle wird an die Breite des div-Elements "content"
		 * angepasst.
		 */
		com.google.gwt.dom.client.Element elt = Document.get().getElementById("content");
		int width = elt.getOffsetWidth();
		String w = width + "px";
		partnervorschlag.setWidth(w);

		initWidget(partnervorschlag);

		
		/**------------------------------------------------------------------
		 * TODO: Clickhandler zu Tabellenzeilen hinzufügen um das jeweilige
		 * Nutzerprofil anzuzeigen.
		 * 
		 * TODO: Tabelle scrollbar machen.
		 */


	}
	

}
