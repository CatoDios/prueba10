package com.example.pc.prueba10.presentation.Main;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pc.prueba10.R;
import com.example.pc.prueba10.data.entities.Preguntas;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by pc on 7/03/2018.
 */

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>{
    Context context;
    ArrayList<Preguntas> preguntas=new ArrayList<>();

    public QuestionAdapter(Context context,ArrayList<Preguntas> preguntas) {
        this.preguntas=preguntas;


        setItems(preguntas);
        this.context = context;
    }

    public QuestionAdapter() {
    }

    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_question, parent, false);

        QuestionViewHolder vh = new QuestionViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position) {
        Preguntas pregunta=preguntas.get(position);

        holder.nombre.setText(pregunta.getImage());
        holder.num_likes.setText(pregunta.getCourse());


    }


    @Override
    public int getItemCount() {
        return preguntas.size();

    }


    public void setItems(ArrayList<Preguntas> items){
        preguntas=items;

    }

    static class QuestionViewHolder extends RecyclerView.ViewHolder{
        //public ImageView imageView;
        public TextView nombre;
        public TextView num_likes;

        public QuestionViewHolder(View itemView) {
            super(itemView);
            //imageView=itemView.findViewById(R.id.cardview_image);
            nombre=itemView.findViewById(R.id.cardview_nombre);
            num_likes=itemView.findViewById(R.id.cardview_num_likes);
        }
    }


}
