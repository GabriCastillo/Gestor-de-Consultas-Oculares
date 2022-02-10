/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import entidades.TEye;
import javax.persistence.EntityManager;

/**
 *
 * @author capta
 */
public class TEyeControlador {
    private EntityManager entityManager() {
        return (new Conexion()).getConexion().getEmf().createEntityManager();
    }
    
    public void crear(TEye ojo) {
        EntityManager em = entityManager();
        try {
            em.getTransaction().begin();
            em.persist(ojo);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("---------------------------------------------------------------------------------------");
            e.printStackTrace();
            System.out.println("---------------------------------------------------------------------------------------");

            em.getTransaction().rollback();
        }
    }
    
    public void editar(TEye ojo) {
        EntityManager em = entityManager();
        try {
            em.getTransaction().begin();
            em.merge(ojo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void eliminar(TEye ojo) {
        EntityManager em = entityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(ojo));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
}
