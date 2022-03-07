package com.tugas2;

public class Lingkaran implements MenghitungBidang {
    private double jari, hasilLuas, hasilKeliling;

    public void setJari(int r){
        jari = r;
    }

    public double getJari(){
        return jari;
    }

    public Lingkaran(double r){
        jari = r;
    }

    public double getDiameter(){
        return 2 * jari;
    }

    @Override
    public double hitungLuas() {
        hasilLuas = phi * (jari * jari);
        return hasilLuas;
    }

    @Override
    public double hitungKeliling() {
        return hasilKeliling = phi * (2 * jari);
    }
}

