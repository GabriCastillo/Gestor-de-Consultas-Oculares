/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import entidades.TClient;
import javax.persistence.EntityManager;

/**
 *
 * @author casti
 */
public class TClientControlador {
    private EntityManager entityManager() {
        return (new Conexion()).getConexion().getEmf().createEntityManager();
    }
    
    public void crear(TClient cliente) {
        EntityManager em = entityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void editar(TClient cliente) {
        EntityManager em = entityManager();
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void eliminar(TClient cliente) {
        EntityManager em = entityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(cliente));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
}
