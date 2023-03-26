package com.demo_by_abhinav.calmsleep.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.demo_by_abhinav.calmsleep.Data.DataModel;
import com.demo_by_abhinav.calmsleep.R;
import java.util.ArrayList;

public class Calm_Adapter extends RecyclerView.Adapter<Calm_Adapter.ViewHolder> {

    Context context;
    ArrayList<DataModel> dataModels;
    private int currentSelectedPosition = RecyclerView.NO_POSITION;
    //    ClickPosition clickPosition;
     Animation slide_down;

    public Calm_Adapter(Context context, ArrayList<DataModel> calm_models) {
        this.context = context;
        this.dataModels = calm_models;
    }


    @NonNull
    @Override
    public Calm_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calm_rv_adapt, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Calm_Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        slide_down = AnimationUtils.loadAnimation(context,
                R.anim.slide_down);
        DataModel data = dataModels.get(position);

        holder.name.setText(data.getName());
        holder.description.setText(data.getDesc());
        holder.benefits.setText(data.getBenefits());
        holder.drawbacks.setText(data.getDrawbacks());
        holder.time.setText(data.getTime());


        holder.arrow_down.setOnClickListener(view -> {
            currentSelectedPosition = position;
            notifyDataSetChanged();
        });
        holder.calm_layout.setOnClickListener(view -> {
            currentSelectedPosition = position;
            notifyDataSetChanged();
        });

        if (currentSelectedPosition == position) {

            holder.calm_cv.setVisibility(View.VISIBLE);
            holder.arrow_down.animate().rotation(90f);
            holder.arrow_down.setOnClickListener(view -> {
                holder.calm_cv.setVisibility(View.GONE);
                holder.arrow_down.animate().rotation(0f);

            });
            holder.calm_layout.setOnClickListener(view -> {
                holder.calm_cv.setVisibility(View.GONE);
                holder.arrow_down.animate().rotation(0f);

            });

        } else {
            holder.calm_cv.setVisibility(View.GONE);
            holder.arrow_down.animate().rotation(0f);

        }
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description, time, name, benefits, drawbacks;
        ImageView arrow_down;
        CardView calm_cv;
        ConstraintLayout calm_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            description = itemView.findViewById(R.id.descption);
            time = itemView.findViewById(R.id.time_1);
            name = itemView.findViewById(R.id.type_name);
            calm_cv = itemView.findViewById(R.id.calm_cv);
            benefits = itemView.findViewById(R.id.benefits);
            drawbacks = itemView.findViewById(R.id.drawbacks);
            arrow_down = itemView.findViewById(R.id.arrow_down);
            calm_layout = itemView.findViewById(R.id.calm_layout);


        }
    }
}
