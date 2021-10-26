package com.afif.pbo.modul3.percobaan;

public class Tabungan {
    int saldo;

    Tabungan(int saldo){
        this.saldo = saldo;
    }

    public void ambilUang(int saldo){
        this.saldo = this.saldo - saldo;
    }

}

