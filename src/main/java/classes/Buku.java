package classes;

import java.util.StringTokenizer;
import java.lang.NullPointerException;

public class Buku {

    private String kode;
    private String judul;
    private String penulis;
    private String harga;
    private String rating;
    private String dir;
    private String kategori;

    public Buku() {

    }

    public Buku(String datas) {
        // System.out.println(datas);
        try {
            String Data[] = new String[10];
            int i = 0;
            StringTokenizer sToken = new StringTokenizer(datas, ",");

            while (sToken.hasMoreTokens()) {
                Data[i++] = sToken.nextToken();
            }
            // System.out.println(Data[0]);
            this.judul = Data[0];
            this.penulis = Data[1];
            this.rating = Data[2];
            this.harga = Data[4];
            this.kategori = Data[5];
            this.dir = Data[6];
        } catch (Exception e) {
        }
    }

    public String getKategori() {
        return this.kategori;
    }

    public String getKode() {
        return this.kode;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public double getHarga() {
        return Double.parseDouble(this.harga);
    }

    public double getRating() {
        return Double.parseDouble(this.rating);
    }

    public String getDir() {
        return this.dir;
    }
}