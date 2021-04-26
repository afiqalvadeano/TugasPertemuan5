package com.tpm.maskapai;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Model> models;

    public myAdapter(ArrayList<Model> listData, Context context) {
        this.models = listData;
        this.context = context;
    }

    public ArrayList<Model> getModels() {
        return models;
    }

    public void setModels(ArrayList<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public myAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_maskapai,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.ViewHolder viewHolder, int i){
        Glide.with(context).load(getModels().get(i).getImgname()).into(viewHolder.ivImage);
        viewHolder.tvHeader.setText(getModels().get(i).getHeader());

        viewHolder.btnDetail.setOnClickListener(v -> {
            Intent moveIntent = new Intent(context, DetailActivity.class);
            moveIntent.putExtra("nameMaskapai", getModels().get(i).getHeader());
            moveIntent.putExtra("imageMaskapai", getModels().get(i).getImgname());
            moveIntent.putExtra("descMaskapai", getModels().get(i).getDesc());
            context.startActivity(moveIntent);
        });

        viewHolder.btnShare.setOnClickListener(v -> {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            String shareSubject = getModels().get(i).getHeader();
            String shareBody = getModels().get(i).getHeader()+"\n" + getModels().get(i).getDesc();
            share.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
            share.putExtra(Intent.EXTRA_TEXT, shareBody);
            context.startActivity(Intent.createChooser(share, "Share Using"));
        });
    }

    @Override
    public int getItemCount() {
        return getModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivImage;
        private TextView tvHeader;
        private Button btnDetail, btnShare;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivImage = itemView.findViewById(R.id.img1);
            tvHeader = itemView.findViewById(R.id.t1);
            btnDetail = itemView.findViewById(R.id.btn);
            btnShare = itemView.findViewById(R.id.btn_share);
        }

    }
}
