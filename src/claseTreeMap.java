
import java.util.Map;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class claseTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        
        //agregar pares clave-valor al mapa
        treeMap.put(1, "elemento 1");
        treeMap.put(2, "elemento 2");
        treeMap.put(3, "elemento 3");
        
        //obtener el primer elemento del mapa
        int primerElemento = ((TreeMap<Integer, String>) treeMap).firstKey();
        System.out.println("Primer elemento: "+primerElemento);
        //obtener el ultimo elemento del mapa
        int UltimoElemento = ((TreeMap<Integer, String>) treeMap).lastKey();
        System.out.println("Ultimo Elemento: "+UltimoElemento);
        
        //obtener un elemento esctrictamente menor que 3
        int MenorElemento = ((TreeMap<Integer, String>) treeMap).lowerKey(3);
        System.out.println(MenorElemento);
        //obtener un elemento esctrictamente mayor que 1
        int MayorElemento = ((TreeMap<Integer, String>) treeMap).higherKey(1);
        System.out.println(MayorElemento);
        
        //Devuelve una vista del mapa que contiene elementos menores que 3
        Map<Integer, String> headSet =  ((TreeMap<Integer, String>) treeMap).headMap(3);
        System.out.println(headSet);
        //Devuelve una vista del mapa que contiene elementos mayores o iguales que 1
        Map<Integer, String> tailSet =  ((TreeMap<Integer, String>) treeMap).tailMap(1);
        System.out.println(tailSet);
        //Devuelve una vista del mapa que contiene elementos entre 1 y 3
        Map<Integer, String> subSet = ((TreeMap<Integer, String>) treeMap).subMap(1, 3);
        System.out.println(subSet);
    }
    
}
