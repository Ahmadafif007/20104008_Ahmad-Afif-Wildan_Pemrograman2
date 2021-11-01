package com.afif.pbo.modul4.percobaan;

public class maintabungan {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 12345);
        Tabungan kamu = new Tabungan("Menu", 12467, 15000, 22222);

        saya.setSaldo(10000);
        saya.setPin(11111);

        System.out.println("Saldo awal saya : " + saya.getSaldo());
        System.out.println("Saldo awal kamu : " + saya.getSaldo());
        System.out.println("Nomor pin saya : " + saya.getSaldo());
        System.out.println("Nomor pin kamu : " + kamu.getPin());
    }
}
