package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Merkzettel;
import de.hdm.itprojekt.shared.bo.Profil;

public class MerkzettelMapper {
	private static MerkzettelMapper merkzettelMapper = null;
	
	protected MerkzettelMapper(){
	}
	
	public static MerkzettelMapper merkzettelMapper() {
		if(merkzettelMapper == null){
			merkzettelMapper = new MerkzettelMapper();
		}
		return merkzettelMapper;
	}




	public Merkzettel anlegen(Profil p) {
		// TODO Auto-generated method stub
		// TODO SQL Stmt um Merkzettel in die DB zu speichern
		return null;
	}

	public void loeschen(Merkzettel m) {
		// TODO Auto-generated method stub
		
	}

	public Merkzettel hinzufuegen(Profil rp) {
		// TODO Auto-generated method stub
		return null;
	}

	public void entfernen(Profil p) {
		// TODO Auto-generated method stub
		
	}

	public Merkzettel getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	//TODO Methode hinzufuegen(Profil p) um ein Profil einem Merkzettel hinzuzufuegen
	
	//TODO Methode loeschen(Merkzettel m)
	
	//TODO getByID(id)

}
