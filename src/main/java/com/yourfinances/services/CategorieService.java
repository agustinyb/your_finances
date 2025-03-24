package com.yourfinances.services;

import com.yourfinances.entities.Categories;

import java.util.List;
import java.util.Optional;

public interface CategorieService {

    Categories addCategorie(Categories categorie);
    Categories updateCategorie(Categories categorie, Integer id);
    List<Categories> getAll();
    Categories findbyId(Integer id);
    void removeCategorie(Integer id);
}
