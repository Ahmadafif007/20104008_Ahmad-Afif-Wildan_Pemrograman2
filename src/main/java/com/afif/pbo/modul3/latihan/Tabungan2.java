package com.afif.pbo.modul3.latihan;

public class Tabungan2 {
    int saldo;

    public Tabungan2(int saldo){
        this.saldo=saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public void simpanUang(int jumlah){
        saldo = saldo+jumlah;
    }
    public boolean ambilUang(int jumlah){
        if (saldo>jumlah){
            saldo =saldo -jumlah;
            return true;
        }else{
            return false;
        }
    }
}
