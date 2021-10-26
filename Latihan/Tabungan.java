package com.arisandif.pbo.modul3.Latihan;

public class Tabungan {
    int Saldo;

    Tabungan(int saldo){
        this.Saldo = saldo;
    }

    public boolean simpanUang(int jumlah) {
        Saldo += jumlah;
        return true;
    }
    
    public boolean ambilUang(int Jumlah) {
        boolean saldo = false;
        Saldo = Saldo - Jumlah;
        return saldo;
    }

    public int getSaldo(int saldo) {
        return Saldo = saldo;
    }
}
