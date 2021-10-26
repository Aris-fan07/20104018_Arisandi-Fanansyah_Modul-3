# 20104018_Arisandi-Fanansyah_Modul-3

# Modul 3 : PENGENALAN PEMROGRAMAN BERIORIENTASI OBJEK

# DASAR TEORI

1. Pemrograman Berorientasi Objek

  Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam class-class atau object-object.
  
  PBO memiliki beberapa karakteristik mendasar, antara lain adalah abstraksi, encapculation (pembungkusan), inheritance (pewarisan), dan polymorphism.
  
2. Mendeklarasikan suatu class

  Class adalah wadah yang berisi abstraksi (pemodelan) dari suatu fungsi objek (benda), yang mendeskripsikan data (sifat karakteristik) 14 dan fungsi yang dimiliki oleh objek tersebut.
  
  Deklarasi class dapat dilakukan dengan sintaks sebagai berikut:
  
```java
<modifier> class <nama_class> { 
[isi class]
}
Contoh : public class Mobil{
}
```

3. Mendeklarasikan suatu atribut
  
  Attributes merupakan nilai (type) data yang terdapat pada suatu object yang berasal dari class. Attributes merepresentasikan karakteristik dari 
suatu object. 
  
  Deklarasi atribut dapat dilakukan dengan sintaks sebagai berikut:

```java
<modifier> <tipe> <nama_atribut> ;
Contoh : public String warna;
```

4. Mendeklarasikan suatu metode

  Metode/method adalah sesuatu yang dapat dilakukan oleh objek. Method dalam implementasi program ditulis dalam bentuk fungsi. Metode menentukan apa yang terjadi ketika objek itu dibuat serta berbagai operasi yang dapat dilakukan objek.

  Deklarasi metode dapat dilakukan dengan sintaks sebagai berikut:

```java
<modifier> <return_type> <nama_metode> 
([daftar_argumen])
[<statement>]
}
Contoh : public void info(){
System.out.println(warna);
}
```

5. Mengakses anggota suatu obyek

  Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu. Berikut ini 
adalah contoh pengaksesan anggota-anggota dari class Mobil:

```java
public class Mobil {
public static void main(String args[])
{ Mobil m=new Mobil();
m.warna=”hitam”; 
m.no_Plat=”KT 2837 UE”; 
m.info();
}
}
```

# PRAKTIKUM

soal 1. Mengimplementasikan UML class diagram dalam program untuk 

class Tabungan

```
Tabungan
+ saldo: int
+ Tabungan(initsaldo : int)
+ getSaldo() : int
+ simpanUang(jumlah : int)
+ ambilUang(jumlah : int) : boolean
```

Transfor bentuk program? Tulislah listing program berikut ini sebagai pengetesan.

```java
public class TesTabungan {
public static void main(String args[]) {
boolean status;
Tabungan tabungan=new Tabungan(10000); 
System.out.println("Saldo awal : "+tabungan.getSaldo()); 
tabungan.simpanUang(8000);
System.out.println("Jumlah uang yang disimpan : 8000"); 
status=tabungan.ambilUang(7000); 
System.out.print("Jumlah uang yang diambil : 7000");
{if (status) 
System.out.println(" ok"); 
else
{System.out.println(" gagal");}
tabungan.simpanUang(1000);
System.out.println("Jumlah uang yang disimpan : 1000"); 
status=tabungan.ambilUang(10000); 
System.out.print("Jumlah uang yang diambil : 10000");
{if (status) 
System.out.println(" ok"); 
else
System.out.println(" gagal");} 
status=tabungan.ambilUang(2500); 
System.out.print("Jumlah uang yang diambil : 2500");
{if (status) 
System.out.println(" ok"); 
else
System.out.println(" gagal");}
tabungan.simpanUang(2000);
System.out.println("Jumlah uang yang disimpan : 2000"); 
System.out.println("Saldo sekarang = " + 
tabungan.getSaldo());
}}}
```

Lakukan kompilasi pada program diatas dan jalankan. Jika tampilan di 
layar tampak seperti dibawah ini, maka program anda sudah benar. Jika 
tidak sama, benahi kembali program anda dan lakukan hal yang sama
seperti diatas.

```
Saldo awal : 10000
Jumlah uang yang disimpan : 8000
Jumlah uang yang diambil : 7000 ok
Jumlah uang yang disimpan : 1000
Jumlah uang yang diambil : 10000 ok 
Jumlah uang yang diambil : 2500 gagal 
Jumlah uang yang disimpan : 2000
Saldo sekarang = 4000
```

[Jawaban Soal 1](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Modul-3/blob/main/Latihan/Tabungan.java)

Hasil run

```
Jumlah uang yang disimpan : 8000
Jumlah uang yang diambil : 7000 gagal
Jumlah uang yang disimpan : 1000
Jumlah uang yang diambil : 10000 gagal
Jumlah uang yang diambil : 2500 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 1500

Process finished with exit code 0
```
