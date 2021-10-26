# Modul3 : Dasar Pemrograman Java

## Dasar Teori
* Pengenalan Pemrograman Berorientasi Objek :

  Pemrograman berorientasi objek (Object Oriented Programming atau disingkat OOP) adalah paradigma pemrograman yang berorientasikan kepada objek yang merupakan suatu metode       dalam pembuatan program, dengan tujuan untuk menyelesaikan kompleksnya berbagai masalah program yang terus meningkat.
* Deklarasi class

  Class adalah sebuah cetak biru definisi pengguna atau prototipe dari object yang diciptakan. Class yang telah diciptakan tersebut merepresentasikan seperangkat dari properti   atau method yang umum dari semua object dari satu tipe data.
* Deklarasi atribut

  Attributes merupakan nilai data yang terdapat pada suatu object yang berasal dari class. Attributes merepresentasikan karakteristik dari suatu objek.
* Deklarasi metode

  Metode/method adalah sesuatu yang dapat dilakukan oleh objek. Method dalam implementasi program ditulis dalam bentuk fungsi. Metode menentukan apa yang terjadi ketika objek     itu dibuat sertaberbagai operasi yang dapat dilakukan objek.

* Pengaksesan anggota objek
  
  Untuk dapat mengakses anggota-anggota dari suatu objek, maka harus dibuat instance dari class tersebut terlebih dahulu.
<hr>

## Praktikum
Soal : Mengimplementasikan UML class diagram dalam program untuk class Tabungan
```
Tabungan
+ saldo: int
+ Tabungan(initsaldo : int)
+ getSaldo() : int
+ simpanUang(jumlah : int)
+ ambilUang(jumlah : int) : boolean
```
Jawaban :
1. [Listing Program untuk pengetesan](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul3/src/main/java/com/afif/pbo/modul3/latihan/TesTabungan2.java)
2. [Jawaban Soal](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul3/src/main/java/com/afif/pbo/modul3/latihan/Tabungan2.java)

Disini kita diminta untuk membuat method method nya agar program untuk pengetesan bisa dijalankan tanpa adanya error. Dan hasil compilenya juga sesuai.

Hasil program setelah dijalankan :
```
Saldo awal : 10000
Jumlah uang yang disimpan : 8000
Jumlah uang yang diambil : 7000 ok
Jumlah uang yang disimpan : 1000
Jumlah uang yang diambil : 10000 ok
Jumlah uang yang diambil : 2500 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 4000

Process finished with exit code 0
```

## Kesimpulan
Pada praktikum kali ini kita mempelajari tentang Pengenalan Pemrograman Berorientasi Objek, Deklarasi class, Deklarasi atribut, Deklarasi metode, dan Pengaksesan anggota obyek. Kita juga mempelajari perintah perintah untuk menjalankannya. Dan diakhir kita belajar untuk memecahkan suatu permasalahan menggunakan materi yang sudah dipelajari.
