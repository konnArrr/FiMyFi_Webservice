package de.kluk.fimyfi_webservice.service;

import de.kluk.fimyfi_webservice.model.LoginData;
import de.kluk.fimyfi_webservice.model.LoginFeedback;

public interface LoginService {

    LoginFeedback login(LoginData loginData);

}
