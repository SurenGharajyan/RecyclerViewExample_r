package com.example.user.recyclerview_patrastum;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 30.04.2017.
 */

public class Adap extends RecyclerView.Adapter<Adap.ViewHolder123> {
    List<String> name;
    List<Float> rate;
    Context context;
    public Adap(List<String> name, List<Float> rate,Context context) {
        this.name = name;
        this.context=context;
        this.rate = rate;
    }

    @Override
    public Adap.ViewHolder123 onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder123(LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_items,parent,false));
    }

    @Override
    public void onBindViewHolder(Adap.ViewHolder123 holder, int position) {
        holder.ratingBar.setRating(rate.get(position));
        holder.textView.setText(name.get(position));
    }

    @Override
    public int getItemCount() {
        return rate.size();
    }

    public class ViewHolder123 extends RecyclerView.ViewHolder {
        TextView textView;
        RatingBar ratingBar;

        public ViewHolder123(View itemView) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.textviewer);
            ratingBar=(RatingBar) itemView.findViewById(R.id.rating);
        }
    }
}
