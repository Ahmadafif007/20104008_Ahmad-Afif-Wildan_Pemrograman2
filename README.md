# Modul5 : Mengelola Class

## Dasar Teori
* Package :

Package adalah suatu cara untuk memenej class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package.
* Import class :

Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut
* Kata kunci this :

Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untukdata member maupun untuk function member, serta dapat jugadigunakan untuk konstruktor.

## Praktikum
Soal : Mengimplementasikan UML class diagram dalam program untuk package perbankan. 
Transformasikan class diagram dibawah ke dalam bentuk program! Tulislah listing program berikut ini sebagai pengetesan.
```
Nasabah
- namaAwal : String
- namaAkhir : String
- tabungan : Tabungan
+ Nasabah (namaAwal : String, 
namaAkhir : String)
+ getNamaAwal() : String
+ getNamaAkhir () : String
+ getTabungan() : Tabungan
+ setTabungan (tabungan : tabungan)
```
```
Tabungan
- saldo : int
+ Tabungan(saldo : int)
+ getSaldo() : int
+ ambilUang(jumlah : int) :
boolean
+ simpanUang(jumlah : int)
```
Jawaban :
1. [Listing Program untuk pengetesan](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul5/src/main/java/com/afif/pbo/modul5/latihan/TesLatihan.java)
2. [Jawaban Soal](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/tree/modul5/src/main/java/com/afif/pbo/modul5/latihan/perbankan)

Disini kita diminta untuk membuat method method nya agar program untuk pengetesan bisa dijalankan tanpa adanya error. Dan beginilah hasil compilenya jika programnya sudah benar.

Hasil program setelah dijalankan :
```
Nasabah atas nama : Agus Daryanto
Saldo awal : 5000
Jumlah uang yang disimpan : 3000
Jumlah uang yang diambil : 6000 ok
Jumlah uang yang disimpan : 3500
Jumlah uang yang diambil : 4000 ok
Jumlah uang yang diambil : 1600 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 3500

Process finished with exit code 0
```

## Kesimpulan
Pada praktikum kali ini kita mempelajari tentang package, mengimport class, dan kata kunci this. Kita juga mempelajari perintah perintah dan cara untuk menjalankannya. Dan diakhir kita belajar untuk memecahkan suatu permasalahan menggunakan materi yang sudah dipelajari. Yaitu mengimplementasikan UML class diagram dalam program untuk package perbankan. 
