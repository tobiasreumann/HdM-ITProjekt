package de.hdm.itprojekt.server.db;

public class AehnlichkeitsmassMapper {
	
private static AehnlichkeitsmassMapper aehnlichkeitsmassMapper = null;
	
	protected AehnlichkeitsmassMapper(){
	}
	
	public static AehnlichkeitsmassMapper aehnlichkeitsmassMapper() {
		if(aehnlichkeitsmassMapper == null){
			aehnlichkeitsmassMapper = new AehnlichkeitsmassMapper();
		}
		return aehnlichkeitsmassMapper;
	}

}
