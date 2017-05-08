package com.os.operando.daggersample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.os.operando.daggersample.GetCategoryUseCase;
import com.os.operando.daggersample.R;
import com.os.operando.daggersample.databinding.ActivityMainBinding;
import com.os.operando.daggersample.di.DaggerRepositoryComponent;
import com.os.operando.daggersample.repository.CategoryRepository;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    CategoryRepository categoryRepository;

    @Inject
    GetCategoryUseCase useCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DaggerRepositoryComponent.create().inject(this);
        binding.name.setText(categoryRepository.findById(1).name);
    }
}