package classes;

public class Buku{
    private String kode;
    private String judul;
    private String penulis;
    private int    harga;
    private double rating;
    private String dir;

    public Buku(String kode, String judul, String penulis, int harga, double rating, String dir){
        this.kode    = kode;
        this.judul   = judul;
        this.penulis = penulis;
        this.harga   = harga;
        this.rating  = rating;
        this.dir     = dir;
    }

    public String getKode(){
        return this.kode;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public int getHarga(){
        return this.harga;
    }

    public double getRating(){
        return this.rating;
    }

    public String getDir(){
        return this.dir;
    }
}