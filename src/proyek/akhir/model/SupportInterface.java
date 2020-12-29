/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir.model;

import javax.swing.JTable;

/**
 *
 * @author alhamdi
 */
public interface SupportInterface<T> {
    public JTable tampilData(Object[][] objData);
    public boolean insertData(T t);
    public T updateData(byte urutan, T t);
    public T deleteData(byte urutan);
    public String getItemInTable(int tempat);
    public String cariData(String data);
}
