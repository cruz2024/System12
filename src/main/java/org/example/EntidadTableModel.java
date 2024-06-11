package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class EntidadTableModel extends AbstractTableModel {
    private List<Object[]> datos = new ArrayList<>();
    private String[] columnas = {"Tipo", "Nombre", "Detalles"};
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datos.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column){
        return columnas[column];
    }

    public void agregarFila(Object[] fila){
        datos.add(fila);
        fireTableDataChanged();
    }

    public void editarFila(int rowIndex, Object[] fila) {
        datos.set(rowIndex, fila);
        fireTableDataChanged();
    }

    public void eliminarFila(int rowIndex) {
        datos.remove(rowIndex);
        fireTableDataChanged();
    }
}
