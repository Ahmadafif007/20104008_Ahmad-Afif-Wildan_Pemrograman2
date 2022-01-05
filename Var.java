package com.afif.pbo.TugasAkhir;

public class Var extends Kalimat {
    String nama;
    String alamat;
    String asalsekolah;
    int tahunlulus;
    String jurusan;

    public String setNama (String nama){
        return this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public String setAlamat (String alamat)
    {
        return this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public String setAsalSekolah (String asalsekolah){
        return this.asalsekolah = asalsekolah;
    }
    public String getAsalsekolah(){
        return asalsekolah;
    }
    public int setTahunLulus (int tahunlulus){
        return this.tahunlulus = tahunlulus;
    }

    public int getTahunlulus() {
        return tahunlulus;
    }
    public String setJurusan (String jurusan){
        return this.jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }
}
