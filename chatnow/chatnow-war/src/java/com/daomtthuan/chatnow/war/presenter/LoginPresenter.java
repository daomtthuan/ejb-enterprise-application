package com.daomtthuan.chatnow.war.presenter;

import com.daomtthuan.chatnow.war.session.AuthSession;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "loginPresenter")
@ViewScoped
public class LoginPresenter implements Serializable {

  @Inject
  private AuthSession authSession;

  private String username;
  private String password;
  private boolean error;
  private String message;

  @PostConstruct
  public void initialize() {
    this.username = null;
    this.password = null;
    this.error = false;
    this.message = null;
  }

  public String login() {
    if (this.username == null || this.username.isEmpty()) {
      this.message = "Username is empty";
    } else if (this.password == null || this.password.isEmpty()) {
      this.message = "Password is empty";
    } else {
      this.message = authSession.login(this.username, this.password);
    }
    this.error = this.message != null;

    if (this.error) {
      return null;
    }
    return "/index?faces-redirect=true";
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMessage() {
    return this.message;
  }

  public boolean isError() {
    return this.error;
  }

}

