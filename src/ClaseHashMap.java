
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClaseHashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        
        //agregar pares clave-valor al mapa
        hashMap.put(1, "elemento 1");
        hashMap.put(2, "elemento 2");
        hashMap.put(3, "elemento 3");
        hashMap.put(4, "elemento 4");
        
        //Reemplazar un valor asociado a una clave específica en el mapa
        hashMap.replace(1, "elemento 0");
        //Computar un nuevo valor para una clave específica
        hashMap.compute(2, (key, value) -> value + " * 2");
        //Combina un valor específico con un valor existente ya asociado con una clave específica
        hashMap.merge(3, "elemento 3", (oldValue, newValue) -> oldValue + newValue);
        
        System.out.println(hashMap);
    }
    
}
