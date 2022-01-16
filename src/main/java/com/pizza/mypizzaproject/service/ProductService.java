package com.pizza.mypizzaproject.service;

import com.pizza.mypizzaproject.model.Product;


import java.util.List;

public interface ProductService {
    Product read(int id);
    List<Product> readAll();

    void create (Product product);
    Product update(int id, Product product);
    void delete (int id);
}
