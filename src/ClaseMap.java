
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
public class ClaseMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        //agregar pares clave-valor al mapa
        map.put(1, "elemento 1");
        map.put(2, "elemento 2");
        map.put(3, "elemento 3");
        
        //obtener un valor asociado a una clave dada anteriormente
        String valorAnterior = map.get(2);
        System.out.println("Valor anterior: "+valorAnterior);
        
        //Eliminar un elemento de la tabla
        map.remove(1);
        
        //Verificar si el mapa contiene un valor específico
        boolean clave = map.containsKey(3);
        System.out.println("la clave contiene el elemento 3: "+clave);
        
        //Verifica si el mapa contiene una clave específica.
        boolean valor = map.containsValue("elemento 2");
        System.out.println("elemento 2 es la clave 2: "+valor);
        
        //mostar todas las claves del mapa
        for(int claves : map.keySet()){
            System.out.println("claves: "+clave);
        }
        //mostar todos los valores del mapa
        for(String valores : map.values()){
            System.out.println("valores: "+valores);
        }
        
        System.out.println(map);
    }
    
}
