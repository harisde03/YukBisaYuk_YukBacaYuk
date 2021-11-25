import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.lang.NullPointerException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.IndexOutOfBoundsException;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.String;

public class DataBase {
    private static String[] data = new String[1000];
    static StringTokenizer stringToken;
    private String fileRegistrasi = "registrasi.txt";
    private String fileBuku = "Data_Rekom.txt";
    private String fileRecordPembelian = "RecordPembelian.txt";

    DataBase() {

    }

    // mengecek apakaha user sudah pernah login sebelumnya atau tidak(Login)
    public String[] cekDataUser(String email, String pass, Pembeli pembeli) throws IOException {
        try (FileReader fileinput = new FileReader(fileRegistrasi);
                BufferedReader bufferedReader = new BufferedReader(fileinput);) {
            // akan dibaca secara buffered
            bufferedReader.mark(200);
            bufferedReader.reset();
            String Data;

            while (!(Data = bufferedReader.readLine()).isEmpty()) {
                int i = 0; // membaca satu baris
                stringToken = new StringTokenizer(Data, ",");// varibel data akan menjadi sebuah acuan supaya
                                                             // delimeter koma dapat ditangkap oleh tokenizer
                while (stringToken.hasMoreTokens()) {// selama delimeter dalam baris masih ada
                    data[i] = stringToken.nextToken();// store kata ke data[index]
                    i++;
                }
               // System.out.println(email + "=" + data[0] + " " + pass + "=" + data[2]);// testing cek isi email dan pass

                if (email.equals(data[0]) && pass.equals(data[2])) {//kondisi jika pass dann email sama  di registrasti.txt
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

    // bertujuan untuk membaca datarekomm.txt perbaris untuk dibuat objek
    public String[] DataBuku() {
        try (FileReader fileReader = new FileReader(fileBuku); BufferedReader buku = new BufferedReader(fileReader);) {
            buku.mark(500);
            buku.reset();
            String Data = buku.readLine();
            int i = 0;
            while (Data != null) {
                data[i] = Data;
                // System.out.println(Data);// testing
                Data = buku.readLine();
                i++;
            }
        } catch (Exception e) {
        }
        return data;
    }

    // untuk halaman awal menampilkan buku, terlebih dahulu buatkan semua objek buku
    public Buku2[] buatObjekBuku() {
        data = DataBuku();

        Buku2[] buku = new Buku2[1000];
        try {
            for (int i = 0; i < 165; i++) {
                buku[i] = new Buku2(data[i]);
                // System.out.println(data[i]);
            }
        } catch (IndexOutOfBoundsException exception) {
        }
        return buku;
    }

    // untuk sign in
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


    //klo membeli bnyak buku harus ada method sendiri kayaknya
}