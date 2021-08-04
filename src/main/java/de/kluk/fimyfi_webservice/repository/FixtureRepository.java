package de.kluk.fimyfi_webservice.repository;

import de.kluk.fimyfi_webservice.model.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixtureRepository extends JpaRepository<Fixture, Integer> {

}
