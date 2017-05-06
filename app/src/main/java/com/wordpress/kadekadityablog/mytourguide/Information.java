package com.wordpress.kadekadityablog.mytourguide;

/**
 * Created by I Kadek Aditya on 5/6/2017.
 */

import java.io.Serializable;

/**
 * membuat class information untuk menampung data tempat wisata
 * Serializable untuk pass data dari fragment ke activity baru
 */

public class Information implements Serializable{

    private String namaTempat;
    private int gambarTempat;
    private String deskripsiTempat;

    public Information(String namaTempat, int gambarTempat, String deskripsiTempat){
        this.namaTempat = namaTempat;
        this.gambarTempat = gambarTempat;
        this.deskripsiTempat = deskripsiTempat;
    }

    public String getNamaTempat(){
        return this.namaTempat;
    }

    public int getGambarTempat(){
        return this.gambarTempat;
    }

    public String getDeskripsiTempat(){
        return this.deskripsiTempat;
    }

}
