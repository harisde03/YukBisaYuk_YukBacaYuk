package classes;

import java.io.IOException;
import database.DataBase;

public class Regist extends Pembeli {

    private String email, password, nama;

    public Regist(String email) {
        super(email);
        this.email = email;
    }

    public Regist(String email, String password) {
        super(email, password);
        this.email = email;
        this.password = password;
    }

    public boolean cekNamaPembeli() throws IOException {
        String[] data;
        DataBase database = new DataBase();
        data = database.cekDataUser(this.email, this.password);

        if (this.email.equals(data[0]) && this.password.equals(data[2])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }

        return false;
    }

    public boolean cekEmailPembeli() throws IOException {
        String[] data;
        DataBase database = new DataBase();
        data = database.cekEmailUser(this.email);

        if (this.email.equals(data[0])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }

        return false;
    }

    public void registrasiUser() throws IOException {
        DataBase database = new DataBase();
        database.menulisDataUser(getNama(), getEmail(), getPassword());
    }
}
