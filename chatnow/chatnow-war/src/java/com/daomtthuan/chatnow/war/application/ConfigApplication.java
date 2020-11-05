package com.daomtthuan.chatnow.war.application;

import com.daomtthuan.chatnow.war.application.config.DirectoryConfig;
import com.daomtthuan.chatnow.war.application.config.HeadConfig;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "configApplication")
@ApplicationScoped
public class ConfigApplication implements Serializable {

  private final HeadConfig headConfig;
  private final DirectoryConfig directoryConfig;

  public ConfigApplication() {
    this.headConfig = new HeadConfig("Chatnow", "Chat enterprise web-application", "Daomtthuan", "daomtthuan, chat, ejb, java, jsf");
    this.directoryConfig = new DirectoryConfig("/WEB-INF/layout", "/WEB-INF/component");
  }

  public HeadConfig getHeadConfig() {
    return this.headConfig;
  }

  public DirectoryConfig getDirectoryConfig() {
    return this.directoryConfig;
  }

}

