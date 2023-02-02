package com.plk.project.Service;

import com.plk.project.Model.User;
import com.plk.project.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public void save(User user){
        userRepo.save(user);
    }


    public User getById(String id){
        return userRepo.findById(id).get();
    }


    public List<User> getAll(){
        return userRepo.findAll();
    }


    public void deleteById(String id){
        userRepo.deleteById(id);
    }
}
