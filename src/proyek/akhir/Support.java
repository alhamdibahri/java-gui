/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import proyek.akhir.model.SupportInterface;

/**
 *
 * @author alhamdi
 */
public class Support<T> implements SupportInterface<T>{
    
    Class<T> g;
    T t;
    DefaultTableModel tabelModel;
    JTable jTable;
    public ArrayList<T> list = new ArrayList();
    String[] column;

    
    Support(DefaultTableModel tabelModel, JTable jTable, ArrayList<T> list, String[] column) {
        this.tabelModel = tabelModel;
        this.jTable = jTable;
        this.list = list;
        this.column = column;
    }

    Support(ArrayList<T> list) {
        this.list = list;
    }

    public Class<T> getG() {
        return g;
    }

    public void setG(Class<T> g) {
        this.g = g;
    }
    
    

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
    public String[] getColumn() {
        return column;
    }

    public void setColumn(String[] column) {
        this.column = column;
    }

    public DefaultTableModel getTabelModel() {
        return tabelModel;
    }

    public void setTabelModel(DefaultTableModel tabelModel) {
        this.tabelModel = tabelModel;
    }

    public JTable getjTable() {
        return jTable;
    }

    public void setjTable(JTable jTable) {
        this.jTable = jTable;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    
    @Override
    public JTable tampilData(Object[][] objData) {
        this.tabelModel = new DefaultTableModel(objData, this.column);
        this.jTable.setModel(this.tabelModel);
        return this.jTable;
    }

    @Override
    public T updateData(byte urutan, T t) {
        return this.list.set(urutan, t);
    }

    @Override
    public T deleteData(byte urutan) {
        return this.list.remove(urutan);
    }

    @Override
    public boolean insertData(T t) {
        return this.list.add(t);
    }

    @Override
    public String getItemInTable(int tempat) {
        int i = this.getjTable().getSelectedRow();
        TableModel model = getjTable().getModel();
        
        return model.getValueAt(i, tempat).toString();
    }

    @Override
    public String cariData(String data) {
        DefaultTableModel model = (DefaultTableModel)this.getjTable().getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        this.getjTable().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(data.trim()));
        return data.trim();
    }
    
    public String getDay(String data){
        return data.split("-")[0];
    }
    
    public String getMonth(String data){
        return data.split("-")[1];
    }
    
    public String getYear(String data){
        return data.split("-")[2];
    }
    
}
