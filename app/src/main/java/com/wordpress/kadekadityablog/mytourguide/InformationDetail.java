package com.wordpress.kadekadityablog.mytourguide;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

/**
 * class yang menampilkan detail informasi mengenai kategori informasi yang di klik
 */
public class InformationDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set dulu view nya
        setContentView(R.layout.activity_information_detail);

        //dapatkan data dari class sebelumnya
        Intent intent = getIntent();
        Information information = (Information) intent.getSerializableExtra(String.valueOf(R.string.pass_information));

        //set semua kebutuhan informasi yang perlu di tampilkan
        TextView textViewJudul = (TextView)findViewById(R.id.tv_judul);
        textViewJudul.setText(information.getNamaTempat());

        ImageView imageViewTempat = (ImageView)findViewById(R.id.tv_imageInformasi);
        imageViewTempat.setImageResource(information.getGambarTempat());

        TextView textViewInfo = (TextView)findViewById(R.id.tv_informasi);
        textViewInfo.setText(information.getDeskripsiTempat());

        setTitle(textViewJudul.getText());

        // tambah up button biar makin keren !
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }
}
