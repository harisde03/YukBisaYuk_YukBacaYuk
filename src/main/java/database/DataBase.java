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
    private final String fileRegistrasi;
    private final String fileBuku;
    private final String fileRecordPembelian;

    public DataBase() {
        this.fileRecordPembelian = "src/main/java/database/RecordPembelian.txt";
        this.fileBuku = "src/main/java/database/Data_Rekom.txt";
        this.fileRegistrasi = "src/main/java/database/registrasi.txt";
    }

    public String[] cekDataUser(String email, String pass) throws IOException {
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
                    return data;
                }
            }
        } catch (Exception e) {
            return data;
        }
        return data;
    }

    public String[] cekEmailUser(String email) throws IOException {
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

                if (email.equals(data[0])) {
                    return data;
                }
            }
        } catch (Exception e) {
            return data;
        }
        return data;
    }

    private String[] DataBuku() {

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

    public void recordPembelian(Pembeli pembeli, String kode, String time) throws IOException {
        FileWriter fileOutput = new FileWriter(this.fileRecordPembelian, true);
        try (BufferedWriter bufferOutput = new BufferedWriter(fileOutput);) {
            bufferOutput.newLine();
            bufferOutput.write(pembeli.getEmail() + "," + kode + "," + time);
        } catch (Exception e) {
        }
    }

}
