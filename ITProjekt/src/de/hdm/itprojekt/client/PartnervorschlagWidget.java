package de.hdm.itprojekt.client;

import java.util.List;
import java.util.Vector;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.cellview.client.*;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.*;

public class PartnervorschlagWidget extends Composite {

	public PartnervorschlagWidget() {

		CellTable<TestProfil> partnervorschlag = new CellTable<TestProfil>();

		TextColumn<TestProfil> nameColumn = new TextColumn<TestProfil>() {
			public String getValue(TestProfil object) {
				return object.getName();
		}};

		TextColumn<TestProfil> geschlechtColumn = new TextColumn<TestProfil>() {
			public String getValue(TestProfil object) {
				return object.getGeschlecht();
		}};

		Column<TestProfil, Number> alterColumn = new Column<TestProfil, Number>(new NumberCell()) {
			public Number getValue(TestProfil object) {

				return object.getAlter();
		}};
		
		Column<TestProfil, Number> aehnlichkeitColumn = new Column<TestProfil, Number>(new NumberCell()) {
			public Number getValue(TestProfil object) {

				return object.getAehnlichkeitswert();
		}};
		
		partnervorschlag.addColumn(nameColumn, "Name");
		partnervorschlag.addColumn(geschlechtColumn, "Geschlecht");
		partnervorschlag.addColumn(alterColumn, "Alter");
		partnervorschlag.addColumn(aehnlichkeitColumn, "�hnlichkeit");
		
		partnervorschlag.setRowData(0, TestProfil.getProfile());
		com.google.gwt.dom.client.Element elt = Document.get().getElementById("content");
		int width = elt.getOffsetWidth();
		String w = width+"px";
		partnervorschlag.setWidth(w);
		
		initWidget(partnervorschlag);
	}

	
}
