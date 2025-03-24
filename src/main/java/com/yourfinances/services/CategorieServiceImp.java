package com.yourfinances.services;

import com.yourfinances.entities.Categories;
import com.yourfinances.repository.CategoriesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class CategorieServiceImp implements CategorieService {

    @Autowired
    private CategoriesRepository catservice;

    public Categories addCategorie(Categories categorie) {
        return catservice.save(categorie);
    }

    public Categories updateCategorie(Categories categorie, Integer id) {
        Optional<Categories> updateCat = catservice.findById(id);
        if (updateCat.isPresent()) {
            return catservice.save(categorie);
        }
        return null;
    }

    public List<Categories> getAll() {
        return catservice.findAll();
    }

    public Categories findbyId(Integer id) {
        Optional<Categories> findCat = catservice.findById(id);
        if (findCat.isPresent()) {
            return findCat.get();
        }
        return null;
    }

    public void removeCategorie(Integer id) {
        catservice.deleteById(id);
    }

}
