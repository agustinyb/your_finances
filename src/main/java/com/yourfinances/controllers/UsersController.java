package com.yourfinances.controllers;

import com.yourfinances.entities.User;
import com.yourfinances.services.UsersServicesImp;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private UsersServicesImp services;

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        services.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping("/updateuser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user) {
        services.updateUser(id, user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/removeuser/{id}")
    public ResponseEntity deleteuser(@PathVariable Integer id) {
        services.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/allusers")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(services.findall());
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(services.findById(id));
    }

}
