package com.plk.project.Controller;

import com.plk.project.Model.User;
import com.plk.project.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserRepo userRepo;


    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        userRepo.save(user);
        log.info(user+"");
        return ResponseEntity.ok(user);
    }
}
