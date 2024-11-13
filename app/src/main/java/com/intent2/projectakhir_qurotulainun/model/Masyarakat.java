package com.intent2.projectakhir_qurotulainun.model;

import java.io.Serializable;

public class Masyarakat implements Serializable {
    private int id;
    private String nik, nama;

    public int getId() { // untuk mendapatkan id
        return id;
    }

    public void  setId(int id) {//untuk membuat id
        this.id = id;
    }

    public String  getNIK() {//untuk mendapatkan NIK
        return nik;
    }

    public void  setNik(String nik) {//untuk membuat NIK
        this.nik = nik;
    }

    public String  getNama() {//untuk mendapatkan NAMA
        return nama;
    }

    public void  setNama(String nama) {//untuk membuat NAMA
        this.nama = nama;
    }


}

