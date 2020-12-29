/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir.model;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author alhamdi
 */
public class Pembayaran extends Pelanggan{
    
    private String NoPembayaran;
    private String TanggalBayar;
    private int Daya;
    private double Denda;
    private double total;
    private String nama_petugas;
    private JButton actions;

    public static ArrayList<Pembayaran> pembayaran = new ArrayList();

    public Pembayaran(String NoPembayaran, String TanggalBayar, int Daya, double Denda, double total, String nama_petugas, String kodePelanggan, String nama, String jk, String tgl_lahir, String alamat, String agama, String nohp, String golongan, double tarif, String keterangan, JButton actions) {
        super(kodePelanggan, nama, jk, tgl_lahir, alamat, agama, nohp, golongan, tarif, keterangan);
        this.NoPembayaran = NoPembayaran;
        this.TanggalBayar = TanggalBayar;
        this.Daya = Daya;
        this.Denda = Denda;
        this.total = total;
        this.nama_petugas = nama_petugas;
        this.actions = actions;
    }

    

    public JButton getActions() {
        return actions;
    }

    public void setActions(JButton actions) {
        this.actions = actions;
    }

    

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }
   
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String getNoPembayaran() {
        return NoPembayaran;
    }

    public void setNoPembayaran(String NoPembayaran) {
        this.NoPembayaran = NoPembayaran;
    }

    public String getTanggalBayar() {
        return TanggalBayar;
    }

    public void setTanggalBayar(String TanggalBayar) {
        this.TanggalBayar = TanggalBayar;
    }

    public int getDaya() {
        return Daya;
    }

    public void setDaya(int Daya) {
        this.Daya = Daya;
    }

    public double getDenda() {
        return Denda;
    }

    public void setDenda(double Denda) {
        this.Denda = Denda;
    }
    
    
    public static double HitungDenda(String Date1, String golongan) {
        int tglPatokan = 20;
        int tglbayar = Integer.parseInt(Date1);
        double denda = 0;
        if(tglbayar > tglPatokan){
                if(golongan.equalsIgnoreCase("R-1/450") || golongan.equalsIgnoreCase("R-1/900")
                || golongan.equalsIgnoreCase("R-1/900 RTM")) denda = 3000;
                else if(golongan.equalsIgnoreCase("R-1/1300")) denda = 5000;
        }
        else{
                denda = 0;
        }
        return denda;
    }
    
}
