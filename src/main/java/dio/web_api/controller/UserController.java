package dio.web_api.controller;

import dio.web_api.model.User;
import dio.web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // centraliza o prefixo /users e evita a repetição dele em cada @Get... abaixo
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public User getOneUser(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        repository.save(user);
    }

    @PutMapping()
    public void putUser(@RequestBody User user){
        repository.save(user);
    }
}
