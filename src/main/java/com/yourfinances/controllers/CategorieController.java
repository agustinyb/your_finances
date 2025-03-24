package com.yourfinances.controllers;

import com.yourfinances.entities.Categories;
import com.yourfinances.services.CategorieServiceImp;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@Data
public class CategorieController {

    @Autowired
    CategorieServiceImp catController;

    @PostMapping("categorie")
    public ResponseEntity<Categories> addCategorie(@RequestBody Categories categorie) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catController.addCategorie(categorie));
    }

    @PutMapping("categorie/{id}")
    public ResponseEntity<Categories> uploadCategorie(@RequestBody Categories categorie, @PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(catController.updateCategorie(categorie, id));
    }

    @GetMapping("categorie/all")
    public ResponseEntity<List> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(catController.getAll());
    }

    @GetMapping("categorie/{id}")
    public ResponseEntity<Categories> findById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(catController.findbyId(id));
    }

    @DeleteMapping("categorie/{id}")
    public ResponseEntity removeCategorie(@PathVariable Integer id) {
        catController.removeCategorie(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
