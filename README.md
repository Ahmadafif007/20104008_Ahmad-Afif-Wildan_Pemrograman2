# Modul6 : Konsep Inheritance

## Dasar Teori
* Pengertian inheritence :

  Inheritance adalah konsep OOP dimana sebuah class dapat menurunkan property dan method yang dimilikinya kepada class lain. Konsep inheritance dipakai untuk memanfaatkan       fitur code reuse, yakni menghindari terjadinya duplikasi kode program. Konsep inheritance membuat sebuah struktur atau hierarchy class dalam kode program. Class yang akan     diturunkan bisa disebut sebagai class induk (parent class), super class, atau base class.
* Deklarasi inheritance dan Single inheritance :

  Deklarasi Inheritance Dengan menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya. Kata kunci extends tersebut           memberitahu kompiler Java bahwa kita ingin melakukan perluasan class Deklarasi Inheritance. Konsep single inheritance hanya memperbolehkan suatu sublass mempunyai satu       parent class. Multilevel Inheritance Konsep inheritance yang ada di Java memperkenankan adanya multilevel inheritance. Konsep multilevel inheritance memperbolehkan suatu     subclass mempunyai subclass lagi.

* Penerapaan inheritance :

  Tujuan dari penerapan inheritance ini adalah menggunakan kembali fungsi atau kode yang telah dibuat dan ditambah dengan atribut dan method baru. Untuk membuat sebuah class   yang mewarisi class lain kita akan menggunakan keyword extend seperti berikut :
```
   child_class extends parent_class
```
   nama child class ditulis terlebih dahulu kemudian diikuti oleh parent class.
* Pengaksesan member dari parent class

  Pengaksesan member yang ada di parent class dari subclass-nya tidak jauh berbeda dengan pengaksesan member subclass itu sendiri. Misalnya di class Manajer kita ingin         mengakses data member nama di class Pegawai melalui sebuah function member isiData(), sekaligus kita juga ingin mengakses data member departemen di class Manajer.
* Kontrol pengaksesan

  Dalam dunia riil, suatu entitas induk bisa saja tidak mewariskan sebagian dari apa-apa yang ia punyai kepada entitas turunan karena sesuatu hal. Demikian juga dengan konsep 
  inheritance dalam OOP. Suatu parent class dapat tidak mewariskan sebagian member-nya kepada subclass-nya.
* Kata kunci super

  Dengan menggunakan kata kunci super, kita dapat mengakses nilai yang berada pada superclass/kelas induk walaupun nama variable atau methodnya sama, contohnya kita bisa       menggunakan kata kunci super pada sebuah variable 
* Konstruktor tidak diwariskan

  Konstruktor berbeda dari metode kelas lain dalam hal mereka membuat objek baru, sedangkan metode lain dipanggil oleh objek yang ada . Ini adalah salah satu alasan             konstruktor tidak diwariskan . Warisan berarti objek yang diturunkan dapat menggunakan metode kelas dasar, tetapi, dalam kasus konstruktor, objek tidak ada sampai setelah     konstruktor menyelesaikan tugasnya.

## Praktikum
1. Percobaan 1 [A](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/A.java)
2. Percobaan 1 [B](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/B.java)
3. Percobaan 1 [Bentuk Java](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/Bentuk.java)
4. Percobaan 2 [InheritDemo](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/InheritDemo.java)
5. Percobaan 2 [InheritanceTest](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/InheritanceTest.java)
6. Percobaan 3 [Persegi](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/Persegi.java)
7. Percobaan 3 [PersegiTest](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/PersegiTest.java)
8. Percobaan 4 [Person](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/Person.java)
9. Percobaan 4 [Student](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul6/src/main/java/com/afif/pbo/modul6/percobaan/Student.java)


## Kesimpulan
Pada praktikum kali ini kita mempelajari tentang Pengertian inheritence, Deklarasi inheritance dan Single inheritance, Penerapaan inheritance, Pengaksesan member dari parent class, Kontrol pengaksesan, Kata kunci super, dan Konstruktor tidak diwariskan. Setelah mempelajari pengertian dan juga memahami perintah perintahnya kita kemudian mempraktekkannya. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Contoh diatas memberitahukan kompiler Java bahwa kita ingin mengextend class A ke class B. Dengan kata lain, class B adalah subclass (class turunan) dari class A, sedangkan class A adalah parent class dari class B. Java hanya memperkenankan adanya single inheritance. Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan access control (kontrol pengaksesan). Di dalam java, kontrol pengaksesan dapat digambarkan dalam tabel berikut ini: Kata kunci super dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri.

