package classes;

import java.util.HashMap;

public class Pembeli {
    private String email;
    private String nama;
    private String password;
    private String pilihan_buku;
    private HashMap<String, Buku> buku;

    public Pembeli() {
        this.nama = "Guest";
    }

    public Pembeli(String email, String password) {
        this.nama = "";
        this.email = email;
        this.password = password;
        this.buku = new HashMap<String, Buku>();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPilihan() {
        return this.pilihan_buku;
    }

    public void setPilihan(String pilihan_buku) {
        this.pilihan_buku = pilihan_buku;
    }
    
    public int getJumlahBuku() {
        return this.buku.size();
    }
    
    public java.util.Set<String> getKeyBuku() {
        return this.buku.keySet();
    }

    public Buku getBuku(String kode) {
        return this.buku.get(kode);
    }
    
    public void addBuku(String kode, Buku buku) {
        this.buku.put(kode, buku);
    }
    
    public void removeBuku(String kode) {
        this.buku.remove(kode);
    }
    
}
