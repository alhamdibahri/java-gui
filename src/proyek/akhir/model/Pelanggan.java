/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir.model;

import java.util.ArrayList;

/**
 *
 * @author alhamdi
 */
public class Pelanggan extends JenisTarif{
    private String kodePelanggan;
    private String nama;
    private String jk;
    private String tgl_lahir;
    private String alamat;
    private String agama;
    private String nohp;
    
    public static ArrayList<Pelanggan> pelanggan = new ArrayList();

    public Pelanggan(String kodePelanggan, String nama, String jk, String tgl_lahir, String alamat, String agama, String nohp, String golongan, double tarif, String keterangan) {
        super(golongan, tarif, keterangan);
        this.kodePelanggan = kodePelanggan;
        this.nama = nama;
        this.jk = jk;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.agama = agama;
        this.nohp = nohp;
    }
 
    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    
    
}
