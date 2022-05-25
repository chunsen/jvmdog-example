package jvmdog.example.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import jvmdog.example.springboot.model.User;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    
    private User user;

    public User get(String name) {
        logger.info("get user: {}", name);
        
        User user = new User();
        user.setName("test");
        
        user = new User();
        user.setName(name);
        user.setAge(30);
        
        this.user = user;
        
        return user;
    }
    
    public List<User> getList(){
        User test = new User();
        test.setName("test");
        
        List<User> result = new ArrayList<>();
        User user = new User();
        user.setName("anna");
        result.add(user);
        
        user = new User();
        user.setName("peter");
        user.setAge(30);
        result.add(user);
        
        return result;
    }
    
}
