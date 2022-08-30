package it.grumo.portal.web;


import it.grumo.portal.grumoportal.api.UserApi;
import it.grumo.portal.grumoportal.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        User user = new User();
        user.setUsername("Paolo");
        user.setEmail("paolo@fox.it");
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<User> createUser(User user) {

        return ResponseEntity.ok(user);
    }

}
