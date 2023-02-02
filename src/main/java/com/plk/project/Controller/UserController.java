package com.plk.project.Controller;

import com.plk.project.Model.User;
import com.plk.project.Repo.UserRepo;
import com.plk.project.Service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;


    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        userService.save(user);
        return ResponseEntity.ok(user);
    }



    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user){
        userService.save(user);
        return ResponseEntity.ok(user);
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable String id){
        return ResponseEntity.ok(userService.getById(id));
    }


    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable String id){
        userService.deleteById(id);
        return ResponseEntity.ok(id+" User deleted successfully!");
    }


}
