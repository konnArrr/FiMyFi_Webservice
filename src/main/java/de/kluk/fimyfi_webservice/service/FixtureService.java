package de.kluk.fimyfi_webservice.service;

import de.kluk.fimyfi_webservice.exception.FixtureAlreadyExistsException;
import de.kluk.fimyfi_webservice.exception.FixtureNotFoundException;
import de.kluk.fimyfi_webservice.model.Fixture;

import java.util.List;

public interface FixtureService {

    List<Fixture> findAll() throws FixtureNotFoundException;

    Fixture add(Fixture fixture) throws FixtureAlreadyExistsException;

    Fixture remove(int id) throws FixtureNotFoundException;

    Fixture update(Fixture fixture) throws FixtureNotFoundException;

    Fixture getById(int id) throws FixtureNotFoundException;

}
