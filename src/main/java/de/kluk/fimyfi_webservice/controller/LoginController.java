package de.kluk.fimyfi_webservice.controller;


import de.kluk.fimyfi_webservice.model.LoginData;
import de.kluk.fimyfi_webservice.model.LoginFeedback;
import de.kluk.fimyfi_webservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping // http://localhost:8080/login
    public LoginFeedback login(@RequestBody LoginData loginData) {
        return loginService.login(loginData);
    }



}
