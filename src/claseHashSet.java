
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class claseHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        
        //Agregar elementos al conjunto
        hashSet.add("elemento 1");
        hashSet.add("elemento 2");
        hashSet.add("elemento 3");
        
        //Eliminar un elemento del conjunto
        hashSet.remove("elemento 1");
        
        //Verificar si un elemento en especifico esta en el conjunto
        boolean elemento2 = hashSet.contains("elemento 2");
        System.out.println("El elemento 2 esta en el conjunto: "+elemento2);
        
        //Devuelve el número de elementos que hay en el conjunto.
        int tamaño = hashSet.size();
        
        //Verifica si el conjunto está vacío.
        boolean estaVacio = hashSet.isEmpty();
        System.out.println("el conjunto esta vacio: "+estaVacio);
        
        //Elimina todos los elementos del conjunto.
        hashSet.clear();
        
        System.out.println(hashSet);
    }
    
}
