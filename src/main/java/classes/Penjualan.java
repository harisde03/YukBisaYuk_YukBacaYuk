/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Penjualan {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Nama Pembeli : ");
        String namaPembeli;
        namaPembeli = inputUser.nextLine();
        dataBarang[] dataBrg = new dataBarang[0];
        int pilihan, jumlahBuku, x;
        float jumlahBayar = 0;
        do{
            System.out.println("Silahkan Pilih menu Transaksi : ");
            System.out.println("1.Input Data Pembelian: ");
            System.out.println("2.Pembayaran : ");
            System.out.println("3.keluar : ");
            pilihan = inputUser.nextInt();
            switch(pilihan){
                case 1: 
                System.out.println("Masukkan Jumlah Buku : ");
                jumlahBuku = inputUser.nextInt();
                dataBrg = new dataBarang[jumlahBuku];
                for(x = 0; x < dataBrg.length; x++){
                    dataBrg[x] = new dataBarang();
                    System.out.println("Barang ke: "+ (x+1));
                    System.out.print("Masukkan Kode Buku: "); dataBrg[x].setKodeBuku( inputUser.next());
                    System.out.print("Masukkan Nama Buku : "); dataBrg[x].setNamaBuku( inputUser.next());
                    System.out.print("Masukkan Harga Buku : "); dataBrg[x].setHargaBuku( inputUser.nextFloat());
                    System.out.print("Masukkan Jumlah Beli : "); dataBrg[x].setJumlahBeli( inputUser.nextInt());
                }
                break;
                case 2:
                System.out.println("DATA PEMBAYARAN BUKU: ");
                System.out.println("#YukBacaYuk#: ");
                System.out.println("Nama Pembeli: "+ namaPembeli);
                System.out.println("==========================================================================");
                System.out.println("No. \tKode Buku \tNama Buku \tJumlah Beli \tHarga Barang \tTotal Harga: ");
                System.out.println("==========================================================================");
                for(x = 0; x < dataBrg.length; x++){
                    System.out.println((x+1) + "\t" + dataBrg[x].getKodeBuku() + "\t" + "\t" + dataBrg[x].getNamaBuku()+ "\t" +  "\t" + dataBrg[x].getJumlahBeli() + "\t" + dataBrg[x].getHargaBuku() + "\t" + "\t" + dataBrg[x].getBayar()); 
                  
                    jumlahBayar = (float)(jumlahBayar + dataBrg[x].getBayar());
                }
                System.out.println("==========================================================================");
                System.out.println("jumlah Bayar \t\t:Rp. "+ jumlahBayar);
                
            }
        }while(pilihan !=3);
    
    
                
    }
} 
        
    

