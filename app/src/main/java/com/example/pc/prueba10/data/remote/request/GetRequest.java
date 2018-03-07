package com.example.pc.prueba10.data.remote.request;

import com.example.pc.prueba10.data.entities.Preguntas;
import com.example.pc.prueba10.data.entities.ResponsePreguntas;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pc on 7/03/2018.
 */

public interface GetRequest {
    @GET("/api/questions/")
    Call<ResponsePreguntas<Preguntas>> getQuestions();


}
