package de.kluk.fimyfi_webservice.controller;

import de.kluk.fimyfi_webservice.exception.UserAlreadyExistsException;
import de.kluk.fimyfi_webservice.exception.UserNotFoundException;
import de.kluk.fimyfi_webservice.model.User;
import de.kluk.fimyfi_webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/adduser")  // http://localhost:8080/user/adduser
    public User addUser(@RequestBody User user) throws UserAlreadyExistsException {
        if (user.getRegisterDate() == null) {
            user.setRegisterDate(LocalDate.now());
        }
        return userService.add(user);
    }

    @GetMapping("/getuser") //http://localhost:8080/user/getuser?id
    public User getUserBy(@RequestParam("id") int id) throws UserNotFoundException {
        return userService.getById(id);
    }

    @DeleteMapping("/deluser") // http://localhost:8080/user/deluser?id
    public User delete(@RequestParam("id") int id) throws UserNotFoundException {
        return userService.remove(id);
    }

    // TODO check if its possible to send just the property i want to update not the whole user
    @PutMapping("/updateuser")  // http://localhost:8080/user/updateuser
    public User update(@RequestBody User user) throws UserNotFoundException {
        return userService.update(user);
    }

}
