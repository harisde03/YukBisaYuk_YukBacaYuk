package database;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.NullPointerException;
import java.lang.IndexOutOfBoundsException;

import java.util.StringTokenizer;

public class DataBase {
    private static String[] data = new String[1000];
    static StringTokenizer stringToken;
    private String fileRegistrasi;
    private String fileBuku;
    private String fileRecordPembelian;

    DataBase() {
        fileRecordPembelian = "src/main/java/database/RecordPembelian.txt";
        fileBuku = "src/main/java/database/Data_Rekom.txt";
        fileRegistrasi = "src/main/java/database/registrasi.txt";

    }

    public String[] cekDataUser(String email, String pass, Pembeli pembeli) throws IOException {
        try (FileReader fileinput = new FileReader(fileRegistrasi);
                BufferedReader bufferedReader = new BufferedReader(fileinput);) {
            String Data;
            bufferedReader.mark(200);
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

    public String[] DataBuku() {
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
        } catch (Exception e) {
        }
    }

    public void recordPembelian(Pembeli pembeli) throws IOException {
        FileWriter fileOutput = new FileWriter(fileRecordPembelian, true);
        try (BufferedWriter bufferOutput = new BufferedWriter(fileOutput);) {
            bufferOutput.newLine();
            bufferOutput.write(pembeli.getEmail() + "," + pembeli.getNama() + "," + pembeli.getPassword()+","+pembeli.getBuku().getJudul());
        } catch (Exception e) {
        }
    }

}
