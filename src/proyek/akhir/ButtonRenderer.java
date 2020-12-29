/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author alhamdi
 */
public class ButtonRenderer extends JButton implements TableCellRenderer{

    public ButtonRenderer() {
        setOpaque(true);
    }
    
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object obj, boolean selected, boolean focused, int row, int col) {
        setText((obj == null) ? "":obj.toString());
        return this;
    }
    
}

