package de.hdm.itprojekt.shared.bo;

import java.io.Serializable;

public abstract class BusinessObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id = 0;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	@Override
	public String toString(){
		return getClass().getName() + " #" + this.id;
	}
	
	@Override
	public boolean equals (Object o){
		/**
		 * Abfragen, ob das Objekt gleich ist und ob ein Objekt gecastet werden kann	
		 */
			if (o != null && o instanceof BusinessObject){
				BusinessObject b = (BusinessObject) o;
				try {
					if (b.getId() == this.id) {
						return true;
					}
				}
				catch (IllegalArgumentException e) {
					/**
					 * Bei einem Fehler false zur�ckgeben.
					 */
					System.out.println(e.getMessage());
					return false;
				}
			}
			return false;
		}
}
