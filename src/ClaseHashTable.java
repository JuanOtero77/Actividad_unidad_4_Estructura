
import java.util.Hashtable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClaseHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        
        //insertar elementos de la tabla hash
        hashTable.put(1, "elemento 1");
        hashTable.put(2, "elemento 2");
        hashTable.put(3, "elemento 3");
        
        //obtener un valor asociado a una clave dada anteriormente
        String valorAnterior = hashTable.get(2);
        System.out.println("Valor anterior: "+valorAnterior);
        
        //Eliminar un elemento de la tabla
        hashTable.remove(1);
        
        //Verificar si la tabla contiene un valor específico
        boolean clave = hashTable.containsKey(3);
        System.out.println("la clave contiene el elemento 3: "+clave);
        
        //Verifica si la tabla contiene una clave específica.
        boolean valor = hashTable.containsValue("elemento 2");
        System.out.println("elemento 2 es la clave 2: "+valor);
        
        System.out.println(hashTable);
    }
    
}
