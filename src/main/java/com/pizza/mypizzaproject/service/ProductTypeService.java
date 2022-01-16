package com.pizza.mypizzaproject.service;

import com.pizza.mypizzaproject.model.ProductType;


import java.util.List;

public interface ProductTypeService {
    ProductType read(int id);
    List<ProductType> readAll();

    void create (ProductType productType);
    ProductType update(int id, ProductType productType);
    void delete (int id);
}
