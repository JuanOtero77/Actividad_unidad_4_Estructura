
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class claseLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        
        //agregamos pares clave-valor al mapa
        map.put(1, "elemento 1");
        map.put(2, "elemento 2");
        map.put(3, "elemento 3");
        
        //mostramos el contenido del mapa
         System.out.println("Contenido del mapa:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        //acceder a un elemento por su clave
        String elemento = map.get(1);
        System.out.println(elemento);
        
    }
    
}
