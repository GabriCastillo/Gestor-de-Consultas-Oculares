/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import conexion.Conexion;
import javax.persistence.EntityManager;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author capta
 */
public class ModeloA extends AbstractTableModel {
    EntityManager em = Conexion.conexion.emf.createEntityManager();
    
   
    private String[] columnNames = {
        "NIF", "NOMBRE", "APELLIDOS", "EDAD"
    };
    
    private Object[][] data = rellenar(new Object[em.createQuery("SELECT t.nif FROM TClient t").getResultList().size()][4]);
   
    public Object[][] rellenar(Object[][] tabla) {
        for(int f = 0; f < tabla.length; ++f) {
            tabla[f][0] = em.createQuery("SELECT t.nif FROM TClient t").getResultList().get(f);
            tabla[f][1] = em.createQuery("SELECT t.nombre FROM TClient t").getResultList().get(f);
            tabla[f][2] = em.createQuery("SELECT t.apellidos FROM TClient t").getResultList().get(f);
            tabla[f][3] = em.createQuery("SELECT t.edad FROM TClient t").getResultList().get(f);
        }
        return tabla;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
}
