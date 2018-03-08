package com.example.pc.prueba10.presentation.Main;

import android.os.Bundle;

import com.example.pc.prueba10.R;
import com.example.pc.prueba10.core.BaseActivity;
import com.example.pc.prueba10.utils.ActivityUtils;

public class QuestionActivity extends BaseActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        QuestionFragment fragment = (QuestionFragment) getSupportFragmentManager()
                .findFragmentById(R.id.coordinatorLayout);

        if (fragment == null) {
            fragment = QuestionFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    fragment, R.id.coordinatorLayout);
        }

    }


}
