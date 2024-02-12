package com.beebo.beebo_backend.UserServices;

import com.beebo.beebo_backend.JournalServices.Journal;
import com.beebo.beebo_backend.UserServices.User;
import com.beebo.beebo_backend.UserServices.UserService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import static com.beebo.beebo_backend.IDProducer.getID;

import javax.swing.text.html.Option;

@RestController
@RequestMapping("api/vi/users")
public class UserController {

    private final UserService userService;
    @GetMapping("/fetchAll")
    public List<User> fetchAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/fetchByID")
    public Optional<User> fetchUser(@RequestParam String uID) {
        return userService.getUserByID(uID);
    }

    @PostMapping("/addNewUser")
    public User addUser(@RequestBody User user) {
        user.setuID(getID());
        user.setCreatedAt(LocalDateTime.now());
        return userService.addUser(user);
    }

    @GetMapping("/fetchByEmail")
    public Optional<User> checkEmail(@RequestParam String email) {return userService.getUserByEmail(email);}

    @GetMapping("/login")
    public Optional<User> login(@RequestParam String email, String password) {return userService.login(email, password);}
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
