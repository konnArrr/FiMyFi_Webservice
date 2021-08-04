package de.kluk.fimyfi_webservice.repository;


import de.kluk.fimyfi_webservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // TODO: find out the differnce
    boolean existsUserByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByUsernameAndPassword(String username, String password);
    User getUserByUsernameAndPassword(String username, String password);
}
