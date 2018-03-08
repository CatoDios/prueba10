package com.example.pc.prueba10.presentation.Main;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.pc.prueba10.R;
import com.example.pc.prueba10.core.BaseFragment;
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

public class QuestionFragment extends BaseFragment implements QuestionContract.View {
    QuestionContract.Presenter mPresenter;
    RecyclerView recyclerViewQuestion;
    QuestionAdapter questionAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList<Preguntas> preguntas_total;
    LinearLayout linearLayout;

    public QuestionFragment() {
    }

    public static QuestionFragment newInstance() {

        return new QuestionFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mPresenter = new QuestionPresent(this, getContext());
        mPresenter.getPreguntas();




    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_question, container, false);
        recyclerViewQuestion=(RecyclerView)root.findViewById(R.id.recycler_view_question);
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


       /* ArrayList<Preguntas> preguntas1=new ArrayList<>();
        GetRequest interfaz= ServiceFactory.createService(GetRequest.class);
        Call<ResponsePreguntas<Preguntas>> response=interfaz.getQuestions();


        try {
            preguntas1=response.execute().body().getResults();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //buscar el recyclerView

        //preguntas_total=preguntas1;


        //colocar el layoutManager
        linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewQuestion.setLayoutManager(linearLayoutManager);
        //colocar el Adapter

        questionAdapter=new QuestionAdapter(getContext(),new ArrayList<Preguntas>());
        recyclerViewQuestion.setAdapter(questionAdapter);





    }

    @Override
    public void getListPreguntas(ArrayList<Preguntas> list) {
            questionAdapter.setItems(list);
            if(list!=null){
                linearLayout.setVisibility(list.size()>0? View.GONE:View.VISIBLE);
            }
            preguntas_total=list;

    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

   /* private ArrayList<Preguntas> obtenerPreguntas() {
        ResponsePreguntas<Preguntas> preguntas1;
        GetRequest interfaz= ServiceFactory.createService(GetRequest.class);
        Call<ResponsePreguntas<Preguntas>> response=interfaz.getQuestions();
        preguntas1=null;
        try {
             preguntas1=response.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //intento

        response.enqueue(new Callback<ResponsePreguntas<Preguntas>>() {
            @Override
            public void onResponse(Call<ResponsePreguntas<Preguntas>> call, Response<ResponsePreguntas<Preguntas>> response) {

            }

            @Override
            public void onFailure(Call<ResponsePreguntas<Preguntas>> call, Throwable t) {

            }
        });
        return preguntas1.getResults();
    }*/


    public void setPresenter(QuestionContract.Presenter presenter) {
        this.mPresenter = presenter;



   /* public static class Peticion extends AsyncTask<Void,Void,Void>{
        ArrayList<Preguntas> preguntas1;
        GetRequest interfaz= ServiceFactory.createService(GetRequest.class);
        Call<ResponsePreguntas<Preguntas>> response=interfaz.getQuestions();
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                preguntas1=response.execute().body().getResults();
                Log.e("Trajo","bien");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }*/
    }
}
