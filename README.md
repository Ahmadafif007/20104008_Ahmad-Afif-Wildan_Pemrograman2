# Modul4 : Dasar Pemrograman Java

## Dasar Teori
* Information hiding :

  Information Hiding adalah menyembunyikan atribut dan method suatu
  objek dari objek lain. Informasi dari suatu class disembunyikan agar anggota - anggota tersebut tidak dapat diakses dari luar.
* Enkapsulasi
  
  Encapsulation adalah salah satu dari empat konsep fundamental OOP selain inheritance, polymorphism, dan abstraction. Encapsulation adalah teknik membuat “field” di class       dengan atribut “private” dan menyediakan akses ke “field” tersebut melalui “public methods”.
* Constructor

  Adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel       instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek.
* Overloading constructor

  Adalah mekanisme dimana kita dapat membuat Konstruktor lebih dari satu dalam satu Class, tapi dengan ketentuan setiap Konstruktor memiliki Parameter yang berbeda, bisa         berbeda jumlah Parameternya ataupun berbeda Type Data parameternya.

<hr>

## Praktikum
Soal : Analisislah dan tentukan konsep apa saja yang digunakan (dari modul ini) 
serta mengapa hasil akhirnya seperti itu!

Jawaban :
Pada class pertama kita beri nama dengan StudentRecord, kemudian buat constructor pada class tersebut. Untuk menginisiasikan variabel yang ada pada objek nantinya, dengan information hiding akses control private yaitu :
```
private String name;
private String address;
private int age;
private double mathGrade;
private double englishGrade;
private double scienceGrade;
private double average;
private static int studentCount;

```
Selanjutnya kita buat overloading constructornya lalu dipanggil dengan menggunakan operator baru di class tersebut.
```
public String getName(){
return name;
}
public void setName( String temp ){
name = temp;
}
public double getAverage(){
double result = 0;
result = ( mathGrade+englishGrade+scienceGrade )/3;
return result;
}
public static int getStudentCount(){
return studentCount;
```
Kemudian kita buat class lagi dengan nama StudentRecordExample. Pada class ini kita buat method mainnya untuk memanggil objek pada class tersebut. Kita juga buat enkapsulationnya untuk mengakses data pada method.
Kenapa hasil akhirnya seperti itu? karena pada enkapsulationnya kita panggil objek dengan nama Wahyu, Ini, dan Nama. Maka hasilnya adalah
```
Wahyu
hitung=0
```
1. [Program1](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul4/src/main/java/com/afif/pbo/modul4/latihan/StudentRecord.java)
2. [Program2](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul4/src/main/java/com/afif/pbo/modul4/latihan/StudentRecordExample.java)

## Kesimpulan
Pada praktikum kali ini kita belajar tentang information hiding, Enkapsulasi, Constructor, dan Overloading constructor. kita juga mempelajari apa saja perintah perintah yang digunakan. Selain itu, diakhir praktikum kita juga belajar menganalisis dan mencari konsep apa saja yang digunakan pada sebuah kasus tertentu. 
