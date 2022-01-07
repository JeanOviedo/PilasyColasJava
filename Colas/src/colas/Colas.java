/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *FIFO
 * @author Jean Oviedo
 */
public class Colas {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos met = new metodos(); //instanciar
        
        System.out.println("****Definiendo el tamaño de cola");
        met.tamano();
         System.out.println("****Ingresando datos");
        met.ingrsodatos();
        
       
        
        
    }
}