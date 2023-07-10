
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClaseColletionYcollections {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        
        //agregar elementos a la coleccion
        collection.add("elemento 1");
        collection.add("elemento 2");
        collection.add("elemento 3");
        
        //verifica si la colección contiene un elemento específico
        boolean elemento = collection.contains("elemento 1");
        System.out.println("contiene elemento 1: "+elemento);
        
        //Elimina un elemento de la coleccion
        collection.remove("elemento 2");
        
        //devuelve el número de elementos de la colección
        int tamaño = collection.size();
        System.out.println("tamaño: "+tamaño);
        
        //Ordenar los elementos de la lista en orden ascendente
        Collections.sort((ArrayList<String>)collection);
        System.out.println("lista en orden ascendente: "+collection);
    }    
}
