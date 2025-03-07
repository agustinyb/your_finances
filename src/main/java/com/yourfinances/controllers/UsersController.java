package com.yourfinances.controllers;

import com.yourfinances.entities.Users;
import com.yourfinances.services.UsersServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@NoArgsConstructor
@AllArgsConstructor
public class UsersController {

    @Autowired
    private UsersServices services;

    @PostMapping("/adduser")
    public ResponseEntity<Users> addUser(@RequestBody Users user) {
        services.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping("/updateuser/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable Integer id, @RequestBody Users user) {
        services.updateUser(id, user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/removeuser/{id}")
    public ResponseEntity deleteuser(@PathVariable Integer id) {
        services.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/allusers")
    public ResponseEntity<List<Users>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(services.findall());
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Users> findById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(services.findById(id));
    }

}
