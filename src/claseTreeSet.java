
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class claseTreeSet {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        
        //Agregar elementos al conjunto
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        
        //obtener el primer elemento del conjunto
        int primerElemento = ((TreeSet<Integer>) treeSet).first();
        System.out.println("Primer elemento: "+primerElemento);
        //obtener el ultimo elemento del conjunto
        int UltimoElemento = ((TreeSet<Integer>) treeSet).last();
        System.out.println("Ultimo Elemento: "+UltimoElemento);
        
        //obtener un elemento esctrictamente menor que 3
        int MenorElemento = ((TreeSet<Integer>) treeSet).lower(3);
        System.out.println(MenorElemento);
        //obtener un elemento esctrictamente mayor que 1
        int MayorElemento = ((TreeSet<Integer>) treeSet).higher(1);
        System.out.println(MayorElemento);
        
        //Devuelve una vista del conjunto que contiene elementos menores que 3
        Set<Integer> headSet =  ((TreeSet<Integer>) treeSet).headSet(3);
        System.out.println(headSet);
        //Devuelve una vista del conjunto que contiene elementos mayores o iguales que 1
        Set<Integer> tailSet =  ((TreeSet<Integer>) treeSet).tailSet(1);
        System.out.println(tailSet);
        //Devuelve una vista del conjunto que contiene elementos entre 1 y 3
        Set<Integer> subSet = ((TreeSet<Integer>) treeSet).subSet(1, 3);
        System.out.println(subSet);
    }
    
}
