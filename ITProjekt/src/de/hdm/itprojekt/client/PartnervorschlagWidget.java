package de.hdm.itprojekt.client;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;
import com.google.gwt.view.client.SingleSelectionModel;


public class PartnervorschlagWidget extends Composite {

	public static final ProvidesKey<TestProfil> KEY_PROVIDER = new ProvidesKey<TestProfil>() {

		public Object getKey(TestProfil item) {
			return item == null ? null : item.getId();
		}
	};

	public PartnervorschlagWidget(Vector<TestProfil> p) {

		CellTable<TestProfil> partnervorschlag = new CellTable<TestProfil>(KEY_PROVIDER);

		/*
		 * Das SelectionModel wird zur Tabelle der Partnervorschl�ge hinzugef�gt
		 * und gew�hrleistet, �hnlich einem ClickHandler, dass beim Klicken auf
		 * eine Tabellenzeile das jeweilige Objekt zur�ckgegeben wird.
		 */
		final SingleSelectionModel<TestProfil> selectionModel = new SingleSelectionModel<TestProfil>(KEY_PROVIDER);


		partnervorschlag.setSelectionModel(selectionModel);

		/*
		 * Das durch den SelectionHandler zur�ckgegebene Profil wird an eine
		 * Instanz des ProfilWidgets �bergeben. Das ProfilWidget wird einer
		 * Diaglogbox hinzugef�gt, die das Profil f�r den Nutzer anzeigt.
		 */
		selectionModel.addSelectionChangeHandler(new Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				Vector<TestProfil> ausgewaehltesProfil = new Vector<TestProfil>();
				ausgewaehltesProfil.addElement(selectionModel.getSelectedObject());
				DialogBox profilAnzeige = new DialogBox();
				ProfilWidget profilWidget = new ProfilWidget(ausgewaehltesProfil);
				profilAnzeige.add(profilWidget);
				profilAnzeige.setAutoHideEnabled(true);
				profilAnzeige.center();
				profilAnzeige.show();
				//TODO: Profil als angesehen vermerken.
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

		// TODO: weitere Spalten wie "raucher" oder "haarfarbe" hinzuf�gen"


		/**
		 * Hinzuf�gen der Spalten zur Tabelle, in der Reihenfolge von Links nach
		 * Rechts. Definition der Spaltennamen.
		 */
		partnervorschlag.addColumn(vnameColumn, "Vorname");
		partnervorschlag.addColumn(nameColumn, "Name");
		partnervorschlag.addColumn(geschlechtColumn, "Geschlecht");
		partnervorschlag.addColumn(raucherColumn, "Raucher");
		partnervorschlag.addColumn(haarfarbeColumn, "Haarfarbe");
		partnervorschlag.addColumn(alterColumn, "Alter");
		partnervorschlag.addColumn(aehnlichkeitColumn, "�hnlichkeit");


	
		//Sortieren des Vectors nach dem �hnlichkeitswert der Profile (TODO: in Applikationslogik verschieben?)

		Collections.sort(p, new Comparator<TestProfil>() {
			public int compare(TestProfil o1, TestProfil o2) {
				return o1.getAehnlichkeitswert() - o2.getAehnlichkeitswert();
			}
		});

		/**
		 * F�llen der Tabellenzeilen mit Werten (TODO)
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
		 * TODO: Clickhandler zu Tabellenzeilen hinzuf�gen um das jeweilige

		 * Nutzerprofil anzuzeigen.
		 * 
		 * TODO: Tabelle scrollbar machen.
		 */

	}

}
