
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
public class InterfazList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        //Agregar elementos a la lista
        lista.add("elemento 1");
        lista.add("elemento 2");
        lista.add("elemento 3");
        
        //Eliminar un elemento de una posición específica de una lista
        lista.remove(2);
        
        //Devuelve el elemento de una posición específica de una lista
        String elemento = lista.get(1);
        System.out.println("elemento de la posicion: "+elemento);
        
        //devolver el número de elemento de una lista
        int tamaño = lista.size();
        System.out.println("tamaño: "+tamaño);
        
        System.out.println(lista);
    }
}
