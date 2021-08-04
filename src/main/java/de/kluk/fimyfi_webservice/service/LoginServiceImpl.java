package de.kluk.fimyfi_webservice.service;

import de.kluk.fimyfi_webservice.model.LoginData;
import de.kluk.fimyfi_webservice.model.LoginFeedback;
import de.kluk.fimyfi_webservice.model.LoginState;
import de.kluk.fimyfi_webservice.model.User;
import de.kluk.fimyfi_webservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    private UserRepository userRepository;

    @Autowired
    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    boolean checkUserAndPasswordExists(LoginData loginData) {
        return userRepository.existsByUsernameAndPassword(loginData.getUsername(), loginData.getPassword());
    }

    boolean checkUserExists(LoginData loginData) {
        return userRepository.existsByUsername(loginData.getUsername());
    }

    User getUser(LoginData loginData) {
        return userRepository.getUserByUsernameAndPassword(loginData.getUsername(), loginData.getPassword());
    }

    @Override
    public LoginFeedback login(LoginData loginData) {
        LoginFeedback loginFeedback = new LoginFeedback();
        if (checkUserAndPasswordExists(loginData)) {
            loginFeedback.setLoginState(LoginState.LOGIN_SUCCESS);
            loginFeedback.setUser(getUser(loginData));
        } else if (checkUserExists(loginData)) {
            loginFeedback.setLoginState(LoginState.INVALID_PASSWORD);
        } else {
            loginFeedback.setLoginState(LoginState.INVALID_USER);
        }
        return loginFeedback;
    }
}
