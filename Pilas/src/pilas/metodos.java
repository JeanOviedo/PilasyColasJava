/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;//Un escáner de texto simple que puede analizar tipos primitivos y cadenas usando expresiones regulares.
import java.util.Stack; //La clase java.util.Stack representa una pila de objetos de último en entrar, primero en salir (LIFO).

/**
 *
 * @author Jean Oviedo
 */
public class metodos {

    Scanner leer = new Scanner(System.in);
    Stack pila = new Stack();
    public static int tamano;

    public void tamano() {

        System.out.println("Ingrese la cantidad de datos");
        tamano = leer.nextInt();
        System.out.println("_____________________________");

    }

    public void ingrsodatos() {

        while (pila.size() < tamano) {
            System.out.println("Ingrese dato ");
            String a = leer.next();
            pila.add(a);
            System.out.println("_____________________________");
            System.out.println(pila);
        }

    }

   
    public void mostrar() {

        Object a = pila.lastElement();
        System.out.println("_____________________________");
    }

    public void eliminarultimo() {

        Object a = pila.pop();
        System.out.println(a);
        System.out.println(pila);
        System.out.println("_____________________________");
    }

    public void vaciarpila() {

        pila.removeAllElements();

        System.out.println(pila);
        System.out.println("_____________________________");
    }

}
