package io.aiven.spring.mysql.springbootcrud;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController

@RequestMapping(path="/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;
    
    @PostMapping(path = "/add")
    public @ResponseBody User addNewUser(@RequestBody User user) {
    	userRepository.save(user);
        return user;
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers(){
    	return userRepository.findAll();
    }
}
