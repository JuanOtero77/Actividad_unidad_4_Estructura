
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClaseArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
         //Ordenar los elementos de la matriz en orden ascendente
         Arrays.sort(array);
         System.out.println("Array orden ascendente"+Arrays.toString(array));
         
         //Realiza una búsqueda binaria de un elemento
         int index = Arrays.binarySearch(array, 1);
         System.out.println(index);
         
         //Copia la matriz ordenada
         int[] array2 = Arrays.copyOf(array, 1);
         System.out.println("nuevo array: "+Arrays.toString(array2));
         
         // Rellenar todos los elementos de la matriz con el valor específico
         Arrays.fill(array, 0);
         System.out.println("array rellenado: "+Arrays.toString(array));
    }
    
}
