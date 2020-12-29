/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import proyek.akhir.model.Pembayaran;

/**
 *
 * @author alhamdi
 */
public class ButtonEditor extends DefaultCellEditor{
    protected JButton btn;
    private String lbl;
    private Boolean clicked;
    String kode_pembayaran;
    
    public ButtonEditor(JTextField txt) {
        super(txt);
        
        btn = new JButton();
        btn.setPreferredSize(new Dimension(40, 40));
        btn.setOpaque(true);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                fireEditingStopped();
            }
            
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        kode_pembayaran = table.getModel().getValueAt(row, 1).toString();
        lbl=(value==null) ? "" : value.toString();
        btn.setText(lbl);
        clicked = true;
        return btn; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getCellEditorValue() {
        if(clicked){
            Print p = new Print();
            p.getNo_pembayaran().setText(kode_pembayaran);
            for(int i= 0; i<Pembayaran.pembayaran.size(); i++){
                if(Pembayaran.pembayaran.get(i).getNoPembayaran().equals(kode_pembayaran)){
                    p.getTanggal_pembayaran().setText(Pembayaran.pembayaran.get(i).getTanggalBayar());
                    p.getKonsumsi_daya().setText(String.valueOf(Pembayaran.pembayaran.get(i).getDaya()));
                    p.getTotal_konsumsi_daya().setText(String.valueOf(Pembayaran.pembayaran.get(i).getDaya()/1000));
                    p.getNama().setText(Pembayaran.pembayaran.get(i).getNama());
                    p.getJenis_kelamin().setText(Pembayaran.pembayaran.get(i).getJk());
                    p.getAlamat().setText(Pembayaran.pembayaran.get(i).getAlamat());
                    p.getGolongan().setText(Pembayaran.pembayaran.get(i).getGolongan());
                    p.getTarif().setText(String.valueOf(Pembayaran.pembayaran.get(i).getTarif()));
                    p.getKeterangan().setText(Pembayaran.pembayaran.get(i).getKeterangan());
                    p.getDenda().setText(String.valueOf(Pembayaran.pembayaran.get(i).getDenda()));
                    p.getTot_konsumsi_daya().setText(String.valueOf(Pembayaran.pembayaran.get(i).getDaya()/1000));
                    p.getTotal_bayar().setText(String.valueOf(Pembayaran.pembayaran.get(i).getTotal()));
                }
            }
            p.setVisible(true);
        }
        
        clicked=false;
        return new String(lbl);
    }

    @Override
    public boolean stopCellEditing() {
        clicked = false;
        return super.stopCellEditing(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
