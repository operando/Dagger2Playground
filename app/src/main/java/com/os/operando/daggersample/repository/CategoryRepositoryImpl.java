package com.os.operando.daggersample.repository;

import com.os.operando.daggersample.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    private List<Category> categories = new ArrayList<>();

    public CategoryRepositoryImpl() {
        Category category = new Category();
        category.id = 1;
        category.name = "test";
        categories.add(category);
    }

    @Override
    public List<Category> list() {
        return categories;
    }

    @Override
    public Category findById(int id) {
        for (Category category : categories) {
            if (id == category.id) {
                return category;
            }
        }
        return null;
    }
}
