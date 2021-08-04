package de.kluk.fimyfi_webservice.service;

import de.kluk.fimyfi_webservice.model.LoginData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoginServiceTest {

    @Autowired
    private LoginServiceImpl service;

    @Test
    void checkExists() {

        assertTrue(service.checkUserAndPasswordExists(new LoginData("admin", "admin")));
        assertFalse(service.checkUserAndPasswordExists(new LoginData("bla", "admin")));
        assertFalse(service.checkUserAndPasswordExists(new LoginData("admin", "bla")));
    }
}