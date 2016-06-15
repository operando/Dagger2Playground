package com.os.operando.daggersample.di;


import com.os.operando.daggersample.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RepositoryModule.class)
public interface RepositoryComponent {

    void inject(MainActivity activity);
}
