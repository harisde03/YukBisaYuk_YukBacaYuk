package classes;

import java.io.IOException;
import database.DataBase;


//private String password;

public class Regist extends Pembeli{
    private String email, password, nama;

    public Regist(String nama, String email, String password){
        super(nama,email, password);
        this.email = email;
        this.password = password;
        this.nama = nama;

    }
    public boolean cekNamaPembeli() throws IOException{
        String data[] = new String[3]; 
        DataBase database = new DataBase();
        data = database.cekDataUser(this.email, this.password); //ada perubahan

        if(this.email.equals(data[0]) && this.password.equals(data[2])){
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }
        return false;
    }

    public void registrasiUser() throws IOException{
        DataBase database = new DataBase();
        // System.out.print(getNama()+getEmail()+getPassword());
        database.menulisDataUser(getNama(),getEmail(),getPassword());//terjadi perubahan
    }
}