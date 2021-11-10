package com.afif.pbo.modul5.latihan.perbankan;
public class Nasabah {
    public String namaAwal;
    public String namaAkhir;
    public Tabungan tabungan;
    public Nasabah (String namaAwal, String namaAkhir){
        this.namaAwal=namaAwal;
        this.namaAkhir=namaAkhir;
    }
    public String getNamaAwal() {
        return namaAwal;
    }
    public String getNamaAkhir() {
        return namaAkhir;
    }
    public void setTabungan(Tabungan tabungan) {
        this.tabungan=tabungan;
    }
    public Tabungan getTabungan() {
        return tabungan;
    }
}
