package br.com.migueljava.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.var;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired//injeção de dependência
    private IUserRepository userRepository;
    
    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel){
       var userCreated = this.userRepository.save(userModel);
       return userCreated;
    }
}
