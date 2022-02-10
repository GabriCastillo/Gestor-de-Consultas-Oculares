/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openjpa;

import controlador.TClientControlador;
import entidades.TClient;
import interfaz.InterfazA;

/**
 *
 * @author casti
 */
public class OpenJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*
        TClientControlador cl = new TClientControlador();
        TClient cliente = new TClient("7Bbgh", "Nombre0", "Apellidos0", 20);
        cl.crear(cliente);
*/
      InterfazA IA = new InterfazA();
      IA.main(args);
    
    }
    
}
