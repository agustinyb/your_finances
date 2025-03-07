package com.yourfinances.services;

import com.yourfinances.entities.Users;
import com.yourfinances.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {

    @Autowired
    private UserRepository userRepo;

    public Users addUser(Users user) {
        return userRepo.save(user);
    }

    public List<Users> findall() {
        return userRepo.findAll();
    }

    public Users findById(Integer id) {
        Optional<Users> userId = userRepo.findById(id);
        if (userId.isPresent()) {
            return userId.get();
        }
        return null;
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    public void updateUser(Integer id,Users updateUser){
        updateUser.setId(id);
        userRepo.save(updateUser);
    }

}
