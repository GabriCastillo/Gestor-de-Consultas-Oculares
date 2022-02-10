/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author casti
 */
public class Conexion {
     public static Conexion conexion = new Conexion();
     public EntityManagerFactory emf;
    
    public Conexion() {
        emf = Persistence.createEntityManagerFactory("openJPAPU");
      
    }

    public static Conexion getConexion() {
        return conexion;
    }

    public static void setConexion(Conexion conexion) {
        Conexion.conexion = conexion;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    
}
