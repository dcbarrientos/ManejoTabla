/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.dcbarrientos.manejotabla;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Diego
 */
public class TablaRenderer implements TableCellRenderer{
    private PanelAccion panelAccion;
    
    public TablaRenderer()
    {
        panelAccion = new PanelAccion();
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return panelAccion;
    }
    
}
