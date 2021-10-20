# Modul0 : Dasar Pemrograman Java

## Dasar Teori
* Keyword dalam java : Keyword adalah kata kunci yang digunakan dalam bahasa pemrograman. salah satunya adalah java, kata kunci ini digunakan pada sebuah class/variable/method/konstruktor, untuk menentukan sifat, jenis atau hak akses yang digunakan, didalam java terdapat banyak sekali jeni keyword yang bisa kita gunakan.
* Tipe dasar : Java mempunyai 11 macam tipe data yang terdiri atas tipe data sederhana dan referensi / komposit. Tipe sederhana meliputi byte, short, int, long, char, float, double dan boolean yang terbagi menjadi 3 tipe. Sedangkan tipe data referensi meliputi class,array dan interface.
* Variabel : Variabel merupakan tempat yang digunakan untuk menyimpan data pada bahasa pemograman disini khusunya pemograman java. Dalam memahami variabel tentu kita harus mengetahui tipe data, dikarenakan dalam penggunaan variabel selalu di awali oleh tipe data yang bakal digunakan.
* Casting dan Promotion : Casting ini merupajan proses pengkonversian type data dari type data yang berbeda. Casting ini terbagi dua bagian lagi yaitu casting implisit dan casting ekspilisit. Sedangkan promotion adalah proses konversi suatu variabel yang bertype data yang terjadi pada saat menjalankan proses aritmatik. 

<hr>

## Praktikum
Soal :
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1]()
``` java
long p = 2147483648;
```
Syntax diatas akan menampilkan error : 
``
Integer number too large
``

Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ? Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca tipe data yang kita maksud adalah tipe data long.

Contoh :
``` java
long p = 2147483648L;
```
2. [Jawaban Soal 2]()
3. [Jawaban Soal 3]()

<hr>

## Kesimpulan
