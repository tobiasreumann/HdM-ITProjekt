package de.hdm.itprojekt.client;

import java.util.Vector;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.user.cellview.client.*;
import com.google.gwt.user.cellview.client.TextColumn;
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
		partnervorschlag.addColumn(aehnlichkeitColumn, "Ähnlichkeit");
		
		partnervorschlag.setRowData(0, TestProfil.getProfile());
		initWidget(partnervorschlag);
	}
}
