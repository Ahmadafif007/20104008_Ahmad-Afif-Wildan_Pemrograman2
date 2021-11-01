package com.afif.pbo.modul4.percobaan;

public class main {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 50410420, 1000000, 12345);
        System.out.println("Nama \t : " + saya.getNama());
        System.out.println("No rekening \t : " + saya.getNoRekening());
        System.out.println("Saldo \t : " + saya.getSaldo());
        System.out.println("Pin \t : " + saya.getPin() );
    }
}
