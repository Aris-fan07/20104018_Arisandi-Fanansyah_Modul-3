package com.arisandif.pbo.modul3_Percobaan;

public class Tabungan {
    int Saldo;

    Tabungan(int saldo){
        this.Saldo = saldo;
    }

    public void ambil_uang(int saldo){
        this.Saldo = this.Saldo - saldo;
    }
}
