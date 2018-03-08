package com.example.pc.prueba10.presentation.Main;

import android.content.Context;

import com.example.pc.prueba10.core.BasePresenter;
import com.example.pc.prueba10.data.entities.Preguntas;
import com.example.pc.prueba10.data.entities.ResponsePreguntas;
import com.example.pc.prueba10.data.remote.ServiceFactory;
import com.example.pc.prueba10.data.remote.request.GetRequest;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pc on 7/03/2018.
 */

public class QuestionPresent  implements  QuestionContract.Presenter{
    QuestionContract.View mView;
    Context context;

    public QuestionPresent(QuestionContract.View mView, Context context) {
        this.mView = mView;
        this.context = context;
    }

    @Override
    public void getPreguntas() {
        GetRequest interfaz = ServiceFactory.createService(GetRequest.class);
        Call<ResponsePreguntas<Preguntas>> call = interfaz.getQuestions();
        call.enqueue(new Callback<ResponsePreguntas<Preguntas>>() {
            @Override
            public void onResponse(Call<ResponsePreguntas<Preguntas>> call, Response<ResponsePreguntas<Preguntas>> response) {
                if (!mView.isActive()) {
                    return;
                }
                if (response.isSuccessful()) {
                    mView.getListPreguntas(response.body().getResults());

                }
            }

            @Override
            public void onFailure(Call<ResponsePreguntas<Preguntas>> call, Throwable t) {
                if (!mView.isActive()) {
                    return;
                }
            }
        });
    }

}
