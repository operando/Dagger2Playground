package com.os.operando.daggersample.repository;

import com.os.operando.daggersample.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> list();

    Category findById(int id);
}
