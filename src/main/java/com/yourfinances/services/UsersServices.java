package com.yourfinances.services;

import com.yourfinances.entities.User;

import java.util.List;
import java.util.Optional;

public interface UsersServices {

     User addUser(User user);
     List<User> findall();
     User findById(Integer id);
     void deleteUser(Integer id);
     void updateUser(Integer id,User updateUser);












}
