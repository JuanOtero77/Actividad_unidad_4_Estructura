
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
public class InterfaceSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        //Agregar elementos al conjunto
        set.add("elemento 1");
        set.add("elemento 2");
        set.add("elemento 3");
        
        //eliminar un elemento del conjunto
        set.remove("elemento 1");
        
        //Verificar si un elemento en especifico esta en el conjunto
        boolean elemento = set.contains("elemento 2");
        System.out.println("el elemento 2 esta en el conjunto: "+elemento);
        
        //Devuelve el número de elementos que hay en el conjunto
        int tamaño = set.size();
        System.out.println("tamaño: "+tamaño);
        
        //Verifica si el conjunto está vacío
        boolean EstaVacio = set.isEmpty();
        System.out.println("esta vacio: "+EstaVacio);
        
        //Vaciamos el conjunto
        set.clear();
        
        System.out.println(set);
    }
    
}
