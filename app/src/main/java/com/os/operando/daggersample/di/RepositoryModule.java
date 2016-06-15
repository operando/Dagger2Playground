package com.os.operando.daggersample.di;

import com.os.operando.daggersample.repository.CategoryRepository;
import com.os.operando.daggersample.repository.CategoryRepositoryImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Singleton
    @Provides
    public CategoryRepository provideCategoryRepository() {
        return new CategoryRepositoryImpl();
    }
}
