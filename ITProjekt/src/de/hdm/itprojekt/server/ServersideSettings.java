package de.hdm.itprojekt.server;

import java.util.logging.Logger;

import de.hdm.itprojekt.shared.CommonSettings;

public class ServersideSettings extends CommonSettings {
  private static final String LOGGER_NAME = "BankProjekt Server";
  private static final Logger log = Logger.getLogger(LOGGER_NAME);
  //TODO
  private static final String PAGE_URL_EDITOR = "";
  //TODO
  private static final String PAGE_URL_VIEWER = "";
  
  public static Logger getLogger() {
    return log;
  }

}
