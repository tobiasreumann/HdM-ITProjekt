package de.hdm.itprojekt.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class StartseiteWidget extends Composite{

	VerticalPanel startPanel = new VerticalPanel();
	Label satz1 = new Label("Du suchst eine Hoe oder einen Bro?");
	Label satz2 = new Label("Jede Sekunde verliebt sich eine Hoe in einen Bro!");
	Label satz3 = new Label("Lege jetzt los!");
	
	
	
	public StartseiteWidget(){
	
		startPanel.setSpacing(20);
		startPanel.add(satz1);
		startPanel.add(satz2);
		startPanel.add(satz3);
		
		initWidget(startPanel);
	}
	
}
