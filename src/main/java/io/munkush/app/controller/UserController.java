package io.munkush.app.controller;

import io.munkush.app.api.UsersApi;
import io.munkush.app.model.CreateUserRequest;
import io.munkush.app.model.CreateUserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController implements UsersApi {

    @Override
    public ResponseEntity<CreateUserResponse> createUser(CreateUserRequest createUserRequest) {
        return null;
    }
}
