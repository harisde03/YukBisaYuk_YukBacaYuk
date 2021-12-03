package database;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.StringTokenizer;

import classes.Pembeli;
import classes.Buku;

public class DataBase {
    private static String[] data = new String[1000];
    static StringTokenizer stringToken;
    private String fileRegistrasi;
    private String fileBuku;
    private String fileRecordPembelian;

    public DataBase() {
        this.fileRecordPembelian = "database/RecordPembelian.txt";//terjadi perubahan
        this.fileBuku = "src/main/java/database/Data_Rekom.txt";
        this.fileRegistrasi = "database/registrasi.txt";//TERJADI PERUBAHAN
        //ga ngerti path :D.. :(
    }

    public String[] cekDataUser(String email, String pass) throws IOException {//baru aku ubah hilangin objeknya
        try (FileReader fileinput = new FileReader(fileRegistrasi);
                BufferedReader bufferedReader = new BufferedReader(fileinput);) {
            String Data;
            bufferedReader.mark(500);
            bufferedReader.reset();

            while (!(Data = bufferedReader.readLine()).isEmpty()) {
                int i = 0; 
                stringToken = new StringTokenizer(Data, ",");
                while (stringToken.hasMoreTokens()) {
                    data[i] = stringToken.nextToken();
                    i++;
                }

                if (email.equals(data[0]) && pass.equals(data[2])) {
                    System.out.println("semua benar, bisa masuk ke laman berikutnya");
                    return data;     
                }
            }
        } catch (Exception e) {
                System.out.println("Belum terdaftar , Daftar dulu woe");
                return data;     
        }
        return data;   
    }

    private String[] DataBuku() {//terjadi perubahan
        try (FileReader fileReader = new FileReader(fileBuku); BufferedReader buku = new BufferedReader(fileReader);) {
            buku.mark(500);
            buku.reset();
            String Data = buku.readLine();
            int i = 0;
            while (Data != null) {
                data[i] = Data;
                Data = buku.readLine();
                i++;
            }
        } catch (Exception e) {
        }
        return data;
    }

    public Buku[] buatObjekBuku() {
        data = DataBuku();

        Buku[] buku = new Buku[1000];
        try {
            for (int i = 0; i < 165; i++) {
                buku[i] = new Buku(data[i]);
            }
        } catch (IndexOutOfBoundsException exception) {
        }
        return buku;
    }

    public void menulisDataUser(String nama, String email, String pass) throws IOException {
        FileWriter fileOutput = new FileWriter(fileRegistrasi, true);
        try (BufferedWriter bufferOutput = new BufferedWriter(fileOutput);) {
            bufferOutput.newLine();
            bufferOutput.write(email + "," + nama + "," + pass);
             //System.out.println("hasil semnatra"+email + "," + nama + "," + pass);
        } catch (Exception e) {
        }
    }

    public void recordPembelian(Pembeli pembeli) throws IOException {
        FileWriter fileOutput = new FileWriter(this.fileRecordPembelian, true);
        try (BufferedWriter bufferOutput = new BufferedWriter(fileOutput);) {
            bufferOutput.newLine();
            bufferOutput.write(pembeli.getEmail() + "," + pembeli.getNama() + "," + pembeli.getPassword()+","+pembeli.getBuku().getJudul());
        } catch (Exception e) {
        }
    }

}
