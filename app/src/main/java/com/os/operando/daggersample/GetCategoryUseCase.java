package com.os.operando.daggersample;

import com.os.operando.daggersample.model.Category;
import com.os.operando.daggersample.repository.CategoryRepository;

import java.util.List;

import javax.inject.Inject;

public class GetCategoryUseCase {

    private final CategoryRepository repository;

    @Inject
    public GetCategoryUseCase(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> get() {
        return repository.list();
    }
}