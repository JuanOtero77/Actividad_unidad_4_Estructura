
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class claseVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        
        //agregar elementos al vector
        vector.addElement("elemento 1");
        vector.addElement("elemento 2");
        vector.addElement("elemento 3");
        
        //Devuelve el elemento en una posición específica
        String elemento1 = vector.elementAt(1);
        System.out.println("elemento 1: "+elemento1);
        
        //eliminar un elemento del vector
        vector.removeElement("elemento 2");
        
        //devolver el numero de elementos del vector
        int tamaño = vector.size();
        System.out.println("Tamaño vector: "+tamaño);
         
        //Verifica si el vector contiene un elemento especifico
        boolean elemento = vector.contains("elemento 3");
        System.out.println("contiene elemento 3: "+elemento);
        
        System.out.println(vector);
    }
    
}
