package com.afif.pbo.modul5.percobaan.sekolah;
import com.afif.pbo.modul5.percobaan.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakeas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama){
        this.kodekelas = kode;
        this.namakeas = nama;
    }

    public void setMhs(Mahasiswa mhs){
        this.mahasiswa = mhs;

    }
}
