package de.kluk.fimyfi_webservice.service;


import de.kluk.fimyfi_webservice.repository.FixtureRepository;
import de.kluk.fimyfi_webservice.exception.FixtureAlreadyExistsException;
import de.kluk.fimyfi_webservice.exception.FixtureNotFoundException;
import de.kluk.fimyfi_webservice.model.Fixture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FixtureServiceDB implements FixtureService{

    private FixtureRepository fixtureRepository;

    @Autowired
    public FixtureServiceDB(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    @Override
    public List<Fixture> findAll() throws FixtureNotFoundException {
        return fixtureRepository.findAll();
    }

    @Override
    public Fixture add(Fixture fixture) throws FixtureAlreadyExistsException {
        if (fixtureRepository.existsById(fixture.getId())) {
            throw new FixtureAlreadyExistsException();
        }
        return fixtureRepository.save(fixture);
    }

    @Override
    public Fixture remove(int id) throws FixtureNotFoundException {
        Fixture fixture;
        if (!fixtureRepository.existsById(id)) {
            throw new FixtureNotFoundException();
        } else {
            fixture = fixtureRepository.findById(id).get();
            fixtureRepository.deleteById(id);
        }
        return fixture;
    }

    @Override
    public Fixture update(Fixture fixture) throws FixtureNotFoundException {
        Fixture fixtureUpdate;
        if (!fixtureRepository.existsById(fixture.getId())) {
            throw new FixtureNotFoundException();
        } else {
            fixtureUpdate = fixtureRepository.save(fixture);
        }
        return fixtureUpdate;
    }

    @Override
    public Fixture getById(int id) throws FixtureNotFoundException {
        Fixture fixture;
        if (fixtureRepository.findById(id).isEmpty()) {
            throw new FixtureNotFoundException();
        } else {
            fixture = fixtureRepository.findById(id).get();
        }
        return fixture;
    }


}



