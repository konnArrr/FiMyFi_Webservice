package de.kluk.fimyfi_webservice.controller;


import de.kluk.fimyfi_webservice.exception.FixtureAlreadyExistsException;
import de.kluk.fimyfi_webservice.exception.FixtureNotFoundException;
import de.kluk.fimyfi_webservice.model.Fixture;
import de.kluk.fimyfi_webservice.service.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fixtures")
public class FixtureController {

    private FixtureService fixtureService;

    @Autowired
    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }


    @RequestMapping //http://localhost:8080/fixtures
    public List<Fixture> getAll() throws FixtureNotFoundException {
        return fixtureService.findAll();
    }

    @PostMapping("/addfix") // http://localhost:8080/fixtures/addfix
    public Fixture addFixture(@RequestBody Fixture fixture) throws FixtureAlreadyExistsException {
        return fixtureService.add(fixture);
    }

    @DeleteMapping("/delfix") // http://localhost:8080/fixtures/delfix?id=
    public Fixture delete(@RequestParam("id") int id) throws FixtureNotFoundException  {
        return fixtureService.remove(id);
    }

    @PutMapping("/updatefix") // http://localhost:8080/fixtures/updatefix
    public Fixture update(@RequestBody Fixture fixture) throws FixtureNotFoundException  {
        return fixtureService.update(fixture);
    }

    @GetMapping("/getfix") // http://localhost:8080/fixtures/getfix?id
    public Fixture getBy(@RequestParam("id") int id) throws FixtureNotFoundException {
        return fixtureService.getById(id);
    }
}
