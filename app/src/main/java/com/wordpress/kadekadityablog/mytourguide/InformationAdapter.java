package com.wordpress.kadekadityablog.mytourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by I Kadek Aditya on 5/6/2017.
 */

/**
 * membuat class InformatonAdapter untuk menampung data dari class Information
 * untuk ditampilkan ke dalam bentuk ListView
 */

public class InformationAdapter extends ArrayAdapter<Information> {

    /**
     * tambah variable-variable yang dibutuhkan
     * color untuk merubah warna sesuai dengan kategori informasi yang di tampilkan
     */
    private int color;

    /**
     * membuat konstruktor untuk memanggil class information adapter di masing2
     * class Fragment
     */
    public InformationAdapter(Context context, ArrayList<Information> informations) {
        super(context, 0, informations);
    }

    /**
     * untuk membuat ArrayAdapter mampu mengganti atas dan bawah ketika melakukan
     * scroll pada ListView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /**
         * untuk mendapatkan GUI yang dapat digunakan oleh si ArrayAdapter
         */
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Information information = getItem(position);

        /**
         * kode untuk menset background color pada text list untuk masing2
         * kategori informasi yang di tampilkan
        View view = listItemView.findViewById(R.id.textList);
        int color = ContextCompat.getColor(getContext(),this.color);
        view.setBackgroundColor(color);
         */

        /**
         * kode untuk mengisi textView dengan nama tempat
         */
        TextView tv_namaTempat = (TextView)listItemView.findViewById(R.id.tv_namaTempat);
        tv_namaTempat.setText(information.getNamaTempat());

        /**
         * kode untuk mengisi ImageView dengan gambar tempat
         */
        ImageView img_gambarTempat = (ImageView)listItemView.findViewById(R.id.img_gambarTempat);
        img_gambarTempat.setImageResource(information.getGambarTempat());

        return listItemView;
    }
}
