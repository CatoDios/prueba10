package com.example.pc.prueba10.presentation.Main;

import com.example.pc.prueba10.core.BasePresenter;
import com.example.pc.prueba10.core.BaseView;
import com.example.pc.prueba10.data.entities.Preguntas;

import java.util.ArrayList;

/**
 * Created by pc on 7/03/2018.
 */

public interface QuestionContract  {
    /*interface View extends BaseView<Presenter>{
        @Override
        void showMessage(String message);

    }
    interface Presenter extends BasePresenter{

        ArrayList<Preguntas> obtenerPreguntas();

    }*/

    interface View{
        void getListPreguntas(ArrayList<Preguntas> list);
        boolean isActive();
    }

    interface Presenter{
       void getPreguntas();
    }
}
