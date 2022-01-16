package com.pizza.mypizzaproject.service;

import com.pizza.mypizzaproject.model.Ingredient;


import java.util.List;

public interface IngredientService {
    Ingredient read(int id);
    List<Ingredient> readAll();

    void create (Ingredient ingredient);
    Ingredient update(int id, Ingredient ingredient);
    void delete (int id);
}
