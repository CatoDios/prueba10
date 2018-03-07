package com.example.pc.prueba10.presentation.Main;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pc.prueba10.R;

import butterknife.BindView;

/**
 * Created by pc on 7/03/2018.
 */

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>{
    Context context;

    public QuestionAdapter(Context context) {
        this.context = context;
    }

    public QuestionAdapter() {
    }

    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class QuestionViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView nombre;
        public TextView num_likes;

        public QuestionViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.cardview_image);
            nombre=itemView.findViewById(R.id.cardview_nombre);
            num_likes=itemView.findViewById(R.id.cardview_num_likes);
        }
    }
}
