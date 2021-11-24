# Modul7 : Overloading & Overriding 

## Dasar Teori
* Overloading

  Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return     value). Tujuan   dibuatnyaoverloading yaitu memudahkan pengguna method dengan fungsi yanghampir sama.
  Overloading mempunyai ciri-ciri sebagai berikut :
  a. Nama Method harus sama
  b. Daftar parameter harus berbeda
  c. Return type boleh sama,juga boleh berbeda
  Berikut adalah contohnya :
``` java
public void print( String temp ){ 
System.out.println("Name:" + name); 
System.out.println("Address:" + 
address); System.out.println("Age:" + 
age);
}
public void print(double eGrade, double mGrade, double
sGrade) System.out.println("Name:" + name); 
System.out.println("Math Grade:" + mGrade); 
System.out.println("English Grade:" + eGrade); 
System.out.println("Science Grade:" + sGrade);
}
```
* Overriding
  
  Overriding tidak sama dengan overloading, Overriding merupakan mekanisme dimana sebuah metode dapat dideklarasikan ulang pada kelas turunannya. Overriding mempunyai ciri-     ciri   sebagai berikut :
  a. Nama Method harus sama
  b. Daftar parameter harus sama 
  c. Return type harus sama
* Aturan tentang Overridden method

  Method yang terkena override (overiden method) diharuskan tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang mengoveride (overriding method).
``` java
class Dulu {
public String RupiahVsDolar() { 
System.out.println(“Rp 10.000”);
}
}
class Sekarang extends Dulu {
public String RupiahVsDolar() {
System.out.println(“Rp 14.000”);
}
}
```

## Praktikum
1. Percobaan [A](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/A.java)
   Disini kita membuat Class A
2. Percobaan [B](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/B.java)
   Disini kita membuat class B yang extends ke class A
3. Percobaan [Burung](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/Burung.java)
   Disini kita membuat class burung 
4. Percobaan [C](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/C.java)
   Disini kita membuat class C yang extends ke class B
5. Percobaan [Mahasiswa](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/Mahasiswa.java)
   Disini kita membuat class mahasiswa
6. Percobaan [Main](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/Main.java)
   Disini kita membuat class main untuk menampilkan hasilnya  
7. Percobaan [Overload](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/Overload.java)
   Disini kita membuat class overload
8. Percobaan [Overload1](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/Overload1.java)
   Disini kita membuat class overload 1
9. Percobaan [Overriding](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/Overriding.java)
   Disini kita membuat class overriding
10. Percobaan [Penguin](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/modul7/src/main/java/com/afif/pbo/modul7/percobaan/Penguin.java)
    Disini kita membuat class Penguin yang ectends ke class burung

## Kesimpulan
Pada praktikum kali ini kita belajar tentang overloading & overriding. Belajar mengenai contohnya dan implementasinya kedalam java. Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value). Overriding mempunyai ciri-ciri sebagai berikut : a. Nama Method harus sama b. Daftar parameter harus sama c. Return type harus sama Berikut ini contoh terjadinya overriding dimana method RupiahVsDolar() pada class Sekarang meg-override method RupiahVsDolar() pada class Dulu.

