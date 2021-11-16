package com.afif.pbo.modul6.percobaan;

public class PersegiTest {
    public static void main(String[] args) {
        Persegi kotak = new Persegi();

        kotak.setSuperP(5);
        kotak.setSuperL(10);

        kotak.setP(3);
        kotak.setL(13);

        kotak.getLuas();
    }
}
