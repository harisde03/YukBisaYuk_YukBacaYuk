/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

/**
 *
 * @author ASUS
 */
public class dataBarang {
    String kodeBuku, namaBuku;
    float hargaBuku;
    int jumlahBeli;
    double bayar;

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public float getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(float hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

  public double getBayar(){
       bayar = hargaBuku * jumlahBeli;
        return bayar;
    }
    
}
