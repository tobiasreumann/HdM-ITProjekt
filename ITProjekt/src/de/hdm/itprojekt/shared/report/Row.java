package de.hdm.itprojekt.shared.report;

import java.io.Serializable;
import java.util.Vector;

public class Row implements Serializable{

	  private static final long serialVersionUID = 1L;
	  
	  private Vector<Column> columns = new Vector<Column>();

	  // Hinzufügen einer Spalte
	  public void addColumn(Column c) {
		    this.columns.addElement(c);
		  }
	  // Löschen einer Spalte
	  public void removeColumn(Column c) {
		    this.columns.removeElement(c);
		  }
	  // Methode im die Spalten auszulesen
	  public Vector<Column> getColumns() {
		    return this.columns;
		  }
	  // Methode um die Anzahl der Spalten zu erhalten
	  public int getNumColumns() {
		    return this.columns.size();
		  }
	  // Methode um eine bestimmte Spalte auszulesen
	  public Column getColumnAt(int i) {
		    return this.columns.elementAt(i);
		  }
}
