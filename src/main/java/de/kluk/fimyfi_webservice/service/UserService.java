package de.kluk.fimyfi_webservice.service;


import de.kluk.fimyfi_webservice.exception.UserAlreadyExistsException;
import de.kluk.fimyfi_webservice.exception.UserNotFoundException;
import de.kluk.fimyfi_webservice.model.User;

public interface UserService {
    User add(User user) throws UserAlreadyExistsException;
    User remove(int id) throws UserNotFoundException;
    User update(User user) throws UserNotFoundException;
    User getById(int id) throws UserNotFoundException;
}
