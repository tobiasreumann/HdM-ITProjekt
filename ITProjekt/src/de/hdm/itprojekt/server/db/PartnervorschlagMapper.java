package de.hdm.itprojekt.server.db;

import de.hdm.itprojekt.shared.bo.Partnervorschlag;

public class PartnervorschlagMapper {

private static PartnervorschlagMapper partnervorschlagMapper = null;
	
	protected PartnervorschlagMapper(){
	}
	
	public static PartnervorschlagMapper partnervorschlagMapper() {
		if(partnervorschlagMapper == null){
			partnervorschlagMapper = new PartnervorschlagMapper();
		}
		return partnervorschlagMapper;
	}

	public Partnervorschlag getPartnervorschlaege() {
		// TODO Auto-generated method stub
		return null;
	}

}
