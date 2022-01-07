/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
PILA: LIFO = Last In, First Out.
 */
package pilas;

/**
 *
 * @author Jean Oviedo
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos met = new metodos(); //instanciar
        System.out.println("****Definiendo el tamaño de pila");
        met.tamano();
        System.out.println("****Ingresando datos");
        met.ingrsodatos();
        System.out.println("****Mostrando datos");
        met.mostrar();
        System.out.println("****Eliminando Ultimo dato");
        met.eliminarultimo();
        System.out.println("****Eliminando todos");
        met.vaciarpila();

    }
}
