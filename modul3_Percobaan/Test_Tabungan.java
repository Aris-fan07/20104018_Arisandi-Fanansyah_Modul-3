package com.arisandif.pbo.modul3_Percobaan;

public class Test_Tabungan {
    public static void main(String[] args) {

        Tabungan t = new Tabungan(5000);
        System.out.println("Saldo awal tabungan anda : " + t.Saldo);

        t.ambil_uang(1500);
        System.out.println("Jumlah uang yang diambil : 1500");
        System.out.println("Saldo tabungan anda sekarang adalah : " + t.Saldo);
    }
}
