package de.hdm.itprojekt.client;

import java.util.Vector;

public class Merkliste {
private Vector<TestProfil> merkliste = new Vector<TestProfil>();

public Vector<TestProfil> getMerkliste() {
	return merkliste;
}

public void zuMerklisteHinzufuegen(TestProfil profil) {
	this.merkliste.addElement(profil);
}
}
