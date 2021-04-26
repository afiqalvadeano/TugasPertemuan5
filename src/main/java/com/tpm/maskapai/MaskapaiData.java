package com.tpm.maskapai;

import java.util.ArrayList;

public class MaskapaiData {
    private static String[] title = new String[]{"Garuda Indonesia", "Citilink","Sriwijaya Air", "NAM Air","Lion Air","Batik Air","Wings Air ","Air Asia", "Kalstar Aviation", "Xpress Air"};
    private static int[] thumbnail = new int[]{R.drawable.garuda,R.drawable.citilink,R.drawable.sriwijaya,R.drawable.nam,R.drawable.lion,R.drawable.batik,R.drawable.wings,R.drawable.airasia,R.drawable.kalstar,R.drawable.xpress};


    private static String[] desc = new String[]{
            "Garuda Indonesia merupakan salah satu maskapai terbaik dengan pelayanan penuh atau full service milik Indonesia. Garuda indonesia juga merupakan maskapai plat merah yang masuk kedalam jajaran maskapai terbaik dunia",
            "Citilink merupakan salah satu anak perusahaan dari Garuda Indonesia grup yang melayani penerbangan berbiaya murah atau LCC. Namun meskipun berbiaya rendah tapi pelayanan maskapai ini juga sangan memuaskan",
            "Sriwijaya air menjadi maskapai penerbangan terbesar ketiga yang ada di Indonesia. Maskapai Sriwijaya pernah resmi bergabung dengan Garuda Indonesia bersama anak perusahaannya yaitu NAM air. Namun sekarang sudah kembali memisahkan diri",
            "NAM Air merupakan anak perusahaan dari Sriwijaya Air Maskapai ini didirikan pada tahun 2013 yang mengoperasikan pesawat Boeing 737-500 Winglet dengan konfigurasi 120 kursi dan pesawat ATR 72-600 dengan 72 kursi kelas ekonomi",
            "Lion Air merupakan maskapai yang memiliki paling banyak pesawat termasuk dengan anak perusahaanya yang juga ada di luar negri. Selain itu maskapai ini menawarkan harga yang paling terjangkau di banding maskapai lainya.",
            "Maskapai ini merupakan anak perusahaan dari lion air yang melayani penerbangan full service. Untuk pelayanan maskapai ini cukup memuaskan sesuai dengan standart maskapai full service",
            "Wings Air juga merupakan anak perusahaan dari lion air yang mengoperasikan pesawat kecil berjenis ATR untuk menjangkau daerah-daerah yang tidak bisa di darati oleh pesawat jet",
            "Sebenernya maskapai ini bukan berpusat di Indonesia, melainkan di Kuala Lumpur Malaysia. Namun maskapai Air Asia melayani penerbangan dari luar negeri ke dalam negeri dan sebaliknya.",
            "Kalstar Aviation memfokuskan pada rute menuju bandara di daerah Kalimantan dan beberapa daerah di Sumatera. Namun sayangnya, maskapai ini masih belum membuka rute penerbangan menuju luar negeri..",
            "Maskapai penerbangan yang satu ini berpusat di Makassar, Sulawesi Selatan dengan fokus penerbangan menuju wilayah timur di Indonesia. Namun sayang beberapa bulan yang lalu maskapai ini dinyatakan bangkrut dan sudah tidak aktif lagi"
    };

    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for(int i = 0; i < title.length; i++){
            model = new Model();
            model.setImgname(thumbnail[i]);
            model.setHeader(title[i]);
            model.setDesc(desc[i]);
            list.add(model);
        }
        return list;
    }
}

