/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogfuzB;

/**
 *
 *
 */
public class Smartphone {
    private String nama;//untuk mengisikan nama laptop yang akan direkomendasikan
    private double nharga, nmemoriInternal, nkamera, nram;
    /**
     *
     * @param nama
     * @param nharga
     * @param nmemoriInternal
     * @param nkamera
     * @param nram
     */
    public Smartphone(String nama, double nharga, double nmemoriInternal, double nkamera, double nram) {
        this.nama = nama;
        this.nharga = nharga;
        this.nmemoriInternal = nmemoriInternal;
        this.nkamera = nkamera;
        this.nram = nram;
    }

    public double getNilaiHarga() { //mengambil nilai pada class harga
        return nharga;
    }

    public void setNilaiHarga(double nharga) {
        this.nharga = nharga;
    }

    public double getNilaiMemoriInternal() { //mengambil nilai pada class memori internal
        return nmemoriInternal;
    }

    public void setNilaiMemoriInternal(double nmemoriInternal) {
        this.nmemoriInternal = nmemoriInternal;
    }
    
    public double getNilaiKamera() { //mengambil nilai pada class kamera
        return nkamera;
    }

    public void setNilaiKamera(double nkamera) {
        this.nkamera = nkamera;
    }
    
    public double getNilaiRAM() { //mengambil nilai pada class ram
        return nram;
    }

    public void setNilaiRAM(double nram) {
        this.nram = nram;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public double getPotensi(){ //perhitungan untuk mencari nilai potensi dengan mengambil dari class harga,memori Internal,kamera dan ram
        System.out.println("harga= " + nharga);
        System.out.println("memoriInternal= " + nmemoriInternal);
        System.out.println("kamera= " + nkamera);
        System.out.println("ram= " + nram);
        return (new Defuzzy(nharga,nmemoriInternal, nkamera, nram).getPotensiSmartphone());
    }
}

