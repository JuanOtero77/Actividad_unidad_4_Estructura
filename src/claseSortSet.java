
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class claseSortSet {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        
        //Agregar elementos al conjunto
        set.add(1);
        set.add(2);
        set.add(3);
        
        //obtener el primer elemento del conjunto
        int primerElemento = set.first();
        System.out.println("primer elemento: "+primerElemento);
        //obtener el ultimo elemento del conjunto
        int UltimoElemento = set.last();
        System.out.println("Ultimo elemento: "+UltimoElemento);
        
        //Devuelve una vista del conjunto que contiene elementos menores que 3
        SortedSet<Integer> headSet =  set.headSet(3);
        System.out.println(headSet);
        //Devuelve una vista del conjunto que contiene elementos mayores o iguales que 1
        SortedSet<Integer> tailSet =  set.tailSet(1);
        System.out.println(tailSet);
        //Devuelve una vista del conjunto que contiene elementos entre 1 y 3
        SortedSet<Integer> subSet = set.subSet(1, 3);
        System.out.println(subSet);
    }
    
}
