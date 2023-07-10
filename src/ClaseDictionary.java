
import java.util.Hashtable;
import java.util.Dictionary;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClaseDictionary {

    public static void main(String[] args) {
        Dictionary<Integer, String> dictionary = new Hashtable<>();

        //Insertamos los elementos en el diccionario
        dictionary.put(1, "elemento 1");
        dictionary.put(2, "elemento 2");
        dictionary.put(3, "elemento 3");

        //Obtenemos un valor asociado a una clave especifica
        String elemento = dictionary.get(1);
        System.out.println("Elemento: " + elemento);

        //eliminamos un elemento del diccionario
        dictionary.remove(3);
        
        System.out.println(dictionary);
        
    }
}

