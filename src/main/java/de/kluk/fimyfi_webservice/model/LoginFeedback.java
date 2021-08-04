package de.kluk.fimyfi_webservice.model;



public class LoginFeedback {

    LoginState loginState;
    User user;

    public LoginFeedback() {
    }

    public LoginFeedback(LoginState loginState) {
        this.loginState = loginState;
    }

    public LoginFeedback(LoginState loginState, User user) {
        this.loginState = loginState;
        this.user = user;
    }

    public LoginState getLoginState() {
        return loginState;
    }

    public void setLoginState(LoginState loginState) {
        this.loginState = loginState;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
