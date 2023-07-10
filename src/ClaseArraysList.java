
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClaseArraysList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        //Agregar elementos a la lista
        lista.add("elemento 1");
        lista.add("elemento 2");
        lista.add("elemento 3");
        
        //Ajustar la capacidad de la lista al número actual de elementos
        ((ArrayList<String>) lista).trimToSize();
        
        //Agregar todos los elementos de la colección al final de la lista
        List<String> lista2 = new ArrayList<>();
        lista2.add("elemento 4");
        lista2.add("elemento 5");
        lista.addAll(lista2);
        System.out.println(lista);
        
    }
    
}
