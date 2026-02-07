package dio.web_api.repository;
import dio.web_api.handler.FieldRequiredException;
import dio.web_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
       /*
       if(user.getLogin() == null ){
            throw new BusinessException("The login field is required.\n");
        }
        if(user.getPassword() == null ){
            throw new BusinessException("The password field is required.\n");
        }
        */

        // Substitui a redundância acima, da seguinte forma:
        // - criei a classe FieldRequired.java e ela herdou de BusinessException
        // - no construtor passei a mensagem e aqui apenas indico o parâmetro de field.

        if(user.getLogin() == null ){
            throw new FieldRequiredException("login");
        }
        if(user.getPassword() == null ){
            throw new FieldRequiredException("password");
        }


        if (user.getId() == null){
            System.out.println("SAVE - Receiving the user at the repository layer.\n");
        } else {
            System.out.println("UPDATE - Receiving the user at the repository layer");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Receiving id: %d for a user delete", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("LIST - Listing the system users.");
        List<User> users = new ArrayList<>();
        users.add(new User("tayhahn", "password"));
        users.add(new User("jhurebell", "12345"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND - Receiving id: %d for a user location.", id));
        return new User("tayhahn", "password");
    }

    public User findByUsername(String username){
        System.out.println(String.format("FIND - Receiving username: %s for a user location.", username));
        return new User("tayhahn", "password");
    }
}
