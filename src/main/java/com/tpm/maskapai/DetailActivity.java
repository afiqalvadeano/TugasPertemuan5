package com.tpm.maskapai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private TextView tvName,tvDesc;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.desc_header);
        tvDesc = findViewById(R.id.desc_desc);
        ivImage = findViewById(R.id.desc_img);

        String sName = getIntent().getStringExtra("nameMaskapai");
        String sDesc = getIntent().getStringExtra("descMaskapai");

        int iCover = getIntent().getIntExtra("imageMaskapai",0);

        Glide.with(this).load(iCover).into(ivImage);
        tvName.setText(sName);
        tvDesc.setText(sDesc);


    }
}