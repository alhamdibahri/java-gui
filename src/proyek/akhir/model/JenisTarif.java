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
public class JenisTarif {
    private String golongan;
    private double tarif;
    private String keterangan;

    public static ArrayList<JenisTarif> jenis_tarif = new ArrayList();
    
    public JenisTarif(String golongan, double tarif, String keterangan) {
        this.golongan = golongan;
        this.tarif = tarif;
        this.keterangan = keterangan;
    }

    public JenisTarif() {
        jenis_tarif.add(new JenisTarif("R-1/450",415,"Subsidi"));
        jenis_tarif.add(new JenisTarif("R-1/900",568,"Subsidi"));
        jenis_tarif.add(new JenisTarif("R-1/900 RTM",1352,"Non Subsidi"));
        jenis_tarif.add(new JenisTarif("R-1/1300",1467.28,"Non Subsidi"));
    }
    
   
    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
