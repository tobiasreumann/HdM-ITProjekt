package de.hdm.itprojekt.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.Administration;
import de.hdm.itprojekt.shared.AdministrationAsync;
import de.hdm.itprojekt.shared.CommonSettings;
import de.hdm.itprojekt.shared.ReportGenerator;
import de.hdm.itprojekt.shared.ReportGeneratorAsync;


public class ClientsideSettings extends CommonSettings{

	
/**
 * Remote Service Proxy zur Verbindungsaufnahme mit den Serverseitgen Diensten
 */	
	
private static AdministrationAsync administration = null;

private static ReportGeneratorAsync reportGenerator = null;


// Name für den Clientseitigen Logger
private static final String LOGGER_NAME  = "IT Projekt";

// Instanz für den Clientseitigen Logger
private static final Logger logger = Logger.getLogger(LOGGER_NAME);



// Methoden:
public static Logger getLogger(){
	return logger;
}

public static AdministrationAsync getAdministration(){
	
	 // Gab es bislang noch keine Administration-Instanz, dann...
    if (administration == null) {
      // Zunächst instantiieren wir Administration
      administration = GWT.create(Administration.class);
    }
	return administration;
	
}

public static ReportGeneratorAsync getReportGenerator() {
    // Gab es bislang noch keine ReportGenerator-Instanz, dann...
    if (reportGenerator == null) {
      // Zunächst instantiieren wir ReportGenerator
      reportGenerator = GWT.create(ReportGenerator.class);

      final AsyncCallback<Void> initReportGeneratorCallback = new AsyncCallback<Void>() {
        @Override
		public void onFailure(Throwable caught) {
          ClientsideSettings.getLogger().severe(
              "Der ReportGenerator konnte nicht initialisiert werden!");
        }

        @Override
		public void onSuccess(Void result) {
          ClientsideSettings.getLogger().info(
              "Der ReportGenerator wurde initialisiert.");
        }
      };

      reportGenerator.init(initReportGeneratorCallback);
    }

    return reportGenerator;
  }

}
