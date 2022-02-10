/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import conexion.Conexion;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author capta
 */
public class ModeloB extends AbstractTableModel {
    EntityManager em = Conexion.conexion.emf.createEntityManager();
    
  
    
    public String nif;
    
    private String[] columnNames = {
        "ID", "NIF", "CONSULTA", "OD_ESFERA", "OD_CILINDRO", "OD_ADICION", "OC_AGUDEZA", "OI_ESFERA", "OI_CILINDRO", "OI_ACICION", "OI_AGUDEZA"
    };
    
    private Object[][] data = rellenar(new Object[em.createQuery("SELECT t.id FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().size()][11]);
   
    public Object[][] rellenar(Object[][] tabla) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for(int f = 0; f < tabla.length; ++f) {
            tabla[f][0] = em.createQuery("SELECT t.id FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][1] = em.createQuery("SELECT t.nif.nif FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][2] =  formatter.format(em.createQuery("SELECT t.consulta FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f));
            tabla[f][3] = em.createQuery("SELECT t.odEsfera FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][4] = em.createQuery("SELECT t.odCilindro FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][5] = em.createQuery("SELECT t.odAdicion FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][6] = em.createQuery("SELECT t.odAgudeza FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][7] = em.createQuery("SELECT t.oiEsfera FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][8] = em.createQuery("SELECT t.oiCilindro FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][9] = em.createQuery("SELECT t.oiAdicion FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
            tabla[f][10] = em.createQuery("SELECT t.oiAgudeza FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().get(f);
        }
        return tabla;
    }

    public ModeloB(String nif) {
        this.nif = nif;
        data = rellenar(new Object[em.createQuery("SELECT t.id FROM TEye t WHERE t.nif.nif = " + "\"" + this.nif + "\"").getResultList().size()][11]);
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
