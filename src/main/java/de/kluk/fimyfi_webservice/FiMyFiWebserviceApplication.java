package de.kluk.fimyfi_webservice;

import de.kluk.fimyfi_webservice.model.ColorSystem;
import de.kluk.fimyfi_webservice.model.Fixture;
import de.kluk.fimyfi_webservice.repository.UserRepository;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FiMyFiWebserviceApplication {

    static final String GET_PATH = "http://localhost:8080/fixtures";
    static final String POST_PATH = "http://localhost:8080/fixtures/addfix";
    static final String DEL_PATH = "http://localhost:8080/fixtures/delfix?id=85";
    static final String UP_PATH = "http://localhost:8080/fixtures/updatefix";


    static Logger log = LogManager.getLogger();

    @Autowired
    static UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(FiMyFiWebserviceApplication.class, args);

        RestTemplate template = new RestTemplate();



        // GET ALL
        // TODO import table to db
//        ResponseEntity<Fixture[]> resultAll = template.getForEntity(GET_PATH, Fixture[].class);
//        List<Fixture> fixtureList = Arrays.asList(resultAll.getBody());
//        log.info(fixtureList);


//        Fixture fixture = new Fixture(84,"webtest", "webtest", 1, 2, false, 3, 4, 5, 6, ColorSystem.RGBAW, 7, 8, 9, 10, "WEB TESTUNG", "wird schon");
//        ResponseEntity<String> result = template.postForEntity(POST_PATH, fixture, String.class);
//        System.out.println(result.getBody());
//        System.out.println(result.getStatusCode());

//        fixture.setId(82);
//        fixture.setComment("update");
//
//        template.put(UP_PATH, fixture);

        // TODO testing if post or get request and check result
//         template.delete(DEL_PATH);

//        log.info("test");



    }

}
