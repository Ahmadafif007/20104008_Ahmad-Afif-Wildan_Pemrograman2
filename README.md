## Tugas Akhir : Program Pendaftaran Mahasiswa Baru
## Anggota Kelompok
   1. Ahmad Afif Wildan/20104008
   2. Anshari Rusmeniar Rizky Arief/20104015
   3. Arisandi Fanansyah/20104018
   4. Emha Hanafi/20104028
## Dasar Teori
* Class & Object :
  
  Class adalah sebuah cetak biru definisi pengguna atau prototipe dari object yang diciptakan. Class yang telah diciptakan tersebut merepresentasikan seperangkat dari properti   atau method yang umum dari semua object dari satu tipe data. Object adalah instance dari class secara umum merepresentasikan (template) sebuah object, sebuah instance adalah   representasi nyata dari class itu sendiri.
* Package :
  
  Package adalah suatu cara untuk memenej class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan     berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package.
* Variable :
  
  Variabel merupakan tempat yang digunakan untuk menyimpan data pada bahasa pemograman disini khusunya pemograman java. Dalam memahami variabel tentu kita harus mengetahui     tipe   data, dikarenakan dalam penggunaan variabel selalu di awali oleh tipe data yang bakal digunakan.
* Methods :
  
  Metode/method adalah sesuatu yang dapat dilakukan oleh objek. Method dalam implementasi program ditulis dalam bentuk fungsi. Metode menentukan apa yang terjadi ketika objek   itu dibuat serta berbagai operasi yang dapat dilakukan objek.
* Access Modifier :

  Fungsi dari access modifier pada Java adalah untuk membatasi scope dari sebuah class, constructor, variabel, method, atau anggota data lainnya yang terdapat dalam suatu       program Java. Ada empat tipe dari access modifier yang tersedia pada Java, yaitu :
  1. Default
  2. Private
  3. Protected
  4. Public
* Inheritence :

  Inheritance adalah konsep OOP dimana sebuah class dapat menurunkan property dan method yang dimilikinya kepada class lain. Konsep inheritance dipakai untuk memanfaatkan       fitur code reuse, yakni menghindari terjadinya duplikasi kode program. Konsep inheritance membuat sebuah struktur atau hierarchy class dalam kode program. Class yang akan     diturunkan bisa disebut sebagai class induk (parent class), super class, atau base class. 
* Constructor : 

  Adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel     instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek.
* Encapsulation
  
  Encapsulation adalah salah satu dari empat konsep fundamental OOP selain inheritance, polymorphism, dan abstraction. Encapsulation adalah teknik membuat “field” di class     dengan atribut “private” dan menyediakan akses ke “field” tersebut melalui “public methods”.
<hr>

## Program
Program Pendaftaran Sekolah :
1. [Class Kalimat](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/TugasAkhir/Kalimat.java)
   Class ini berfungsi untuk menampilkan kalimat akhir pada output.
2. [Class Variable](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/TugasAkhir/Var.java)
   Class Var berfungsi sebagai variable yang akan dipakai pada program
3. [Class Variable2](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/TugasAkhir/Var2.java)
   Class Var2 berfungsi sebagai variable yang akan dimasukkan menjadi outputnya.
4. [Class Demo](https://github.com/Ahmadafif007/20104008_Ahmad-Afif-Wildan_Pemrograman2/blob/TugasAkhir/Demo.java)
   Class Demo berfungsi untuk mendemonstrasikan atau menampilkan program setelah di run.
## Pembahasan Program
* Class Kalimat : Pada class ini kita membuat 2 method yaitu pembuka & penutup. Ini akan menampilkan kalimat pembuka dan penutup pada saat setelah kita mengisi data formulir. 
  ```java. Konsep Methods terdapat pada class ini.
  public void Pembuka()
  public void Penutup()
  ```
* Class Var : Pada class ini kita mendeklarasikan variable apa saja yang akan dipakai pada program. Terdapat 5 variable pada class ini. Class ini juga sudah terhubung dengan   class Kalimat. Variable ini nantinya yang akan kita gunakan untuk mengisi data pada pengisian formulir yang terdiri dari nama,alamat, asalsekolah, tahunlulus, dan jurusan.   Konsep encapsulation dan inheritence terdapat pada class ini.
  ```java
    String nama;
    String alamat;
    String asalsekolah;
    int tahunlulus;
    String jurusan;
  ```
* Class Var2 : Pada class ini kita mendeklarasikan variable yang akan kita masukkan kedalam outputnya. Var2 yang sudah terhubung ke class Var ini nantinya akan menampilkan     data Var yang sudah kita isi pada saat pengisian formulir. 
  ```java
        nama =nama_new;
        alamat=alamat_new;
        tahunlulus=tahunLulus_new;
        asalsekolah = asalSekolah_new;
        jurusan = jurusan_new;
  ```
* Class Demo : Class ini berfungsi untuk menampilkan hasil output dari program nantinya. Terdapat method main yang nantinya untuk menampilkan formulir yang harus kita isi.     Kemudian akan memanggil data dari yang sudah kita inputkan saat pengisian formulir.
  Berikut adalah tampilan saat pertama kali dijalankan. Terdapat formulir pendaftaran kemudian isi sesuai dengan identitas diri.
  ```java
  Selamat datang, Silakan isi formulir pendaftaran dibawah
  Untuk mendaftar pada Institut Teknologi Telkom Purwokerto 

  ***Formulir Pendaftaran***
  Nama                       : Ahmad Afif Wildan
  Alamat                     : Magelang, Jawa Tengah
  Asal Sekolah               : SMKN1 Magelang
  Tahun Lulus                : 2020
  Program Studi Yang Dipilih : RPL
  ```
  Kemudian ini adalah tampilan setelah berhasil mengisi formulir tersebut :
  ```java
  ========================================================

           Institut Teknologi Telkom Purwokerto 

  Selamat atas diterimanya mahasiswa/i dengan nama : 
  Nama            : Ahmad Afif Wildan
  Alamat          : Magelang, Jawa Tengah
  Asal Sekolah    : SMKN1 Magelang
  Tahuh Lulus     : 2020
  Jurusan         : RPL

          Institut Teknologi Telkom Purwokerto
                         2022

  ========================================================

  ```
## Kesimpulan
Pada kali ini kami belajar untuk membuat sebuah program dengan berdasarkan konsep konsep yang ada pada Pemrograman Berorientasi Objek. Kami membaut sebuah program untuk pendaftaran mahasiswa baru. Dengan menggunakan konsep inheritence, encapsulation, dll. 
