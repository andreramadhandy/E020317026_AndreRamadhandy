package id.ac.poliban.mi.andre.inputmahasiswa2;

import java.io.Serializable;

public class MhsInfo implements Serializable {
    String nime;
    String nama;
    String alamat;
    String telp;

    public String getNime() {
        return nime;
    }

    public void setNime(String nime) {
        this.nime = nime;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
