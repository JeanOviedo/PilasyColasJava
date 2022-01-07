/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Scanner;

import java.util.Queue;
import java.util.LinkedList; //Implementación de listas doblemente enlazadas de las interfaces List y Deque. 
//Implementa todas las operaciones de lista opcionales y permite todos los elementos (incluido el nulo).

/**
 *
 * @author Jean Oviedo
 */
public class metodos {

    Queue<String> cola1 = new LinkedList<String>();
    Scanner leer = new Scanner(System.in);

    public static int tamano;

    public void tamano() {

        System.out.println("Ingrese la cantidad de datos");
        tamano = leer.nextInt();
        System.out.println("_____________________________");

    }

    public void ingrsodatos() {

        while (cola1.size() < tamano) {
            System.out.println("Ingrese dato");
            String a = leer.next();
            cola1.add(a);
            System.out.println("_____________________________");
        
        }
        //cola1.add("juan");
        //cola1.add("ana");
        //cola1.add("luis");

        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo: " + cola1.peek());
        System.out.println("___________________________________________________");
        System.out.println("Extraemos el primer elemento de cola:" + cola1.poll()); //Recupera y elimina el encabezado de esta cola, o devuelve un valor nulo si esta cola está vacía.
        System.out.println("___________________________________________________");
        System.out.println("Mostramos los elementos restantes en la cola, si esta no está vacia:");
        while (!cola1.isEmpty()) { //Verificamos si cola esta vacia
            System.out.print(cola1.poll() + " - "); //Recupera, pero no elimina, el encabezado de esta cola
        }
         
         cola1.clear();
         System.out.println("****Elementos de cola eliminados");
        System.out.println("_____________________________");

    }

    

}
