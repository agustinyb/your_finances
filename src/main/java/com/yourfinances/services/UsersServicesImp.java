package com.yourfinances.services;

import com.yourfinances.entities.User;
import com.yourfinances.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class UsersServicesImp implements UsersServices {

    @Autowired
    private UserRepository userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> findall() {
        return userRepo.findAll();
    }

    public User findById(Integer id) {
        Optional<User> userId = userRepo.findById(id);
        if (userId.isPresent()) {
            return userId.get();
        }
        return null;
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    public void updateUser(Integer id, User updateUser) {
        updateUser.setId(id);
        userRepo.save(updateUser);
    }


}
