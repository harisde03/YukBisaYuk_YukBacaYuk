package classes;

import java.io.IOException;
import database.DataBase;

public class Pembeli {
    private String email;
    private String nama;
    private String password;
    private String pilihan_buku;
    private Buku buku;

    public Pembeli() {
        this.nama = "Guest";
    }

    public Pembeli(String nama,String email, String password) {
        this.email = email;
        this.password = password;
        this.nama = nama;
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

    public Buku getBuku(){
        return buku;
    }

    public void setBuku(Buku buku){
        this.buku = buku;
    }

    
    
}