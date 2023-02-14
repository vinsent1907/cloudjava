package ru.javaops.cloudjava.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javaops.cloudjava.model.User;
import ru.javaops.cloudjava.web.user.ProfileController;

@RestController
@RequestMapping(value ="/api/eat", produces = MediaType.APPLICATION_JSON_VALUE)
public class EatController {
    @GetMapping
    public String get() {
        return "Привет медвед";
//        return findByJwtUser(jwtUser);
    }
}
