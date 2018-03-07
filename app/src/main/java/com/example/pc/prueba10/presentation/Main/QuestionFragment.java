package com.example.pc.prueba10.presentation.Main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pc.prueba10.R;
import com.example.pc.prueba10.core.BaseFragment;

/**
 * Created by pc on 7/03/2018.
 */

public class QuestionFragment extends BaseFragment {
    public QuestionFragment() {
    }

    public static QuestionFragment newInstance() {

        return new QuestionFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_question,container,false);
        return root;
    }
}
