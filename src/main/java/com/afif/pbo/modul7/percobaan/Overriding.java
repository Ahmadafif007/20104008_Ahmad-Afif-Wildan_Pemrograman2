package com.afif.pbo.modul7.Percobaan;

public class Overriding {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Penguin penguin = new Penguin();

        burung.terbang();
        penguin.terbang();
    }
}
