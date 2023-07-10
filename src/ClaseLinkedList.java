
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClaseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        
        // Agregar elementos a la lista
        lista.add("elemento 1");
        lista.add("elemento 2");
        lista.add("elemento 3");
        
        // Agregar un elemento al principio de la lista
        lista.addFirst("elemento 0");
        String primerElemento = lista.getFirst();
        System.out.println("Primer Elemento: " + primerElemento);
        
        // Agregar un elemento al final de la lista
        lista.addLast("elemento 4");
        String ultimoElemento = lista.getLast();
        System.out.println("Ultimo elemento: " + ultimoElemento);
        
        // Eliminar y devolver el primer elemento de la lista
        String eliminarPrimerElemento = lista.removeFirst();
        System.out.println("Elemento removido: " + eliminarPrimerElemento);
        
        // Eliminar y devolver el último elemento de la lista
        String eliminarUltimoElemento = lista.removeLast();
        System.out.println("Elemento removido: " + eliminarUltimoElemento);
        
        System.out.println(lista);
    }
    
}
