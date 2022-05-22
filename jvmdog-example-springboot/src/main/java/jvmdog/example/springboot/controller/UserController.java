package jvmdog.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jvmdog.example.springboot.model.User;
import jvmdog.example.springboot.service.UserService;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping(value="{name}")
    public RestResult<User> get(@PathVariable("name") String name) {
        User user = userService.get(name);
        return new RestResult<User>(user);
    }
    
    @GetMapping
    public RestResult<List<User>> getList() {
        List<User> users = userService.getList();
        return new RestResult<List<User>>(users);
    }
}
