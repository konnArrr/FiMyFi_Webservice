package de.kluk.fimyfi_webservice.service;

import de.kluk.fimyfi_webservice.exception.FixtureNotFoundException;
import de.kluk.fimyfi_webservice.exception.UserAlreadyExistsException;
import de.kluk.fimyfi_webservice.exception.UserNotFoundException;
import de.kluk.fimyfi_webservice.model.Fixture;
import de.kluk.fimyfi_webservice.model.User;
import de.kluk.fimyfi_webservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceDB implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceDB(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User add(User user) throws UserAlreadyExistsException {
        if (userRepository.existsById(user.getId()) || userRepository.existsByUsername(user.getUsername())) {
            throw new UserAlreadyExistsException();
        }
        return userRepository.save(user);
    }

    @Override
    public User remove(int id) throws UserNotFoundException {
        User user;
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException();
        } else {
            user = userRepository.findById(id).get();
            userRepository.deleteById(id);
        }
        return user;
    }

    @Override
    public User update(User user) throws UserNotFoundException {
        User userUpdate;
        if (!userRepository.existsById(user.getId())) {
            throw new UserNotFoundException();
        } else {
            userUpdate = userRepository.save(user);
        }
        return userUpdate;
    }

    @Override
    public User getById(int id) throws UserNotFoundException {
        User user;
        if (userRepository.findById(id).isEmpty()) {
            throw new UserNotFoundException();
        } else {
            user = userRepository.findById(id).get();
        }
        return user;
    }
}
