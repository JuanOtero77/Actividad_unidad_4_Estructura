
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class Punto20 {

    public static void main(String[] args) {
        //Listas
        List<String> lista = new ArrayList<>();
        lista.add("Samsunmg");
        lista.add("hawei");
        lista.add("xiaomi");
        lista.add("focus");
        lista.add("apple");
        //conjutos
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(33);
        set.add(77);
        set.add(7);
        set.add(23);
        //mapas
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("elemento 1", 1);
        mapa.put("elemento 2", 2);
        mapa.put("elemento 3", 3);
        mapa.put("elemento 4", 4);
        mapa.put("elemento 5", 5);
        //pilas
        Stack<String> pila = new Stack<>();
        pila.push("juan");
        pila.push("jhon");
        pila.push("vallejo");
        pila.push("saulo");
        pila.push("luis");
        //colas
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(100);
        cola.offer(33);
        cola.offer(77);
        cola.offer(7);
        cola.offer(23);

        //buscar un objeto en una lista
        boolean buscarLista = lista.contains("xiaomi");
        System.out.println("Elemento encontrado: " + buscarLista);
        //buscar un objeto en un conjunto
        boolean buscarConjunto = set.contains(33);
        System.out.println("Elemento encontrado: " + buscarConjunto);
        //buscar un objeto en un mapa
        boolean buscarMapa = mapa.containsKey(1);
        System.out.println("Elemento encontrado: " + buscarMapa);
        //buscar un objeto en una pila
        boolean buscarPila = pila.search("juan") != -1;
        System.out.println("Elemento encontrado: " + buscarPila);
        //buscar un objeto en una cola
        boolean buscarCola = cola.contains(33);
        System.out.println("Elemento encontrado: " + buscarCola);
        
        //Eliminar objeto en una lista
        lista.remove("apple");
        //Eliminar objeto en un conjunto
        set.remove(100);
        //Eliminar objeto en un mapa
        mapa.remove("elemento 3");
        //Eliminar objeto en una pila
        pila.remove("jhon");
        //Eliminar objeto en una cola
        cola.remove(100);

        // Recorrer una lista usando for tradicional
        System.out.println("Recorrido de la lista usando for tradicional:");
        for (int i = 0; i < lista.size(); i++) {
            String element = lista.get(i);
            System.out.println("Elemento: " + element);
        }

        // Recorrer una lista usando for-each
        System.out.println("Recorrido de la lista usando for-each:");
        for (String element : lista) {
            System.out.println("Elemento: " + element);
        }

        // Recorrer una lista usando while
        System.out.println("Recorrido de la lista usando while:");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Elemento: " + element);
        }

        // Recorrer una lista usando do-while
        System.out.println("Recorrido de la lista usando do-while:");
        ListIterator<String> listIterator = lista.listIterator();
        do {
            String element = listIterator.next();
            System.out.println("Elemento: " + element);
        } while (listIterator.hasNext());

        // Ordenar una lista
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        // Recorrer un conjunto usando for tradicional
        System.out.println("Recorrido del conjunto usando for tradicional:");
        Integer[] setArray = set.toArray(new Integer[0]);
        for (int i = 0; i < setArray.length; i++) {
            Integer element = setArray[i];
            System.out.println("Elemento: " + element);
        }

        // Recorrer un conjunto usando for-each
        System.out.println("Recorrido del conjunto usando for-each:");
        for (Integer element : set) {
            System.out.println("Elemento: " + element);
        }

        // Recorrer un conjunto usando while
        System.out.println("Recorrido del conjunto usando while:");
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            Integer element = setIterator.next();
            System.out.println("Elemento: " + element);
        }

        // Recorrer un conjunto usando do-while
        System.out.println("Recorrido del conjunto usando do-while:");
        Iterator<Integer> setIterator2 = set.iterator();
        do {
            Integer element = setIterator2.next();
            System.out.println("Elemento: " + element);
        } while (setIterator2.hasNext());

        // Recorrer un mapa usando for tradicional
        System.out.println("Recorrido del mapa usando for tradicional:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Clave: " + key + ", Valor: " + value);
        }

        // Recorrer un mapa usando for-each
        System.out.println("Recorrido del mapa usando for-each:");
        mapa.forEach((key, value) -> System.out.println("Clave: " + key + ", Valor: " + value));

        // Recorrer un mapa usando while
        System.out.println("Recorrido del mapa usando while:");
        Iterator<Map.Entry<String, Integer>> mapIterator = mapa.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = mapIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Clave: " + key + ", Valor: " + value);
        }

        // Recorrer una lista usando Stream
        System.out.println("Recorrido de la lista usando Stream:");
        lista.stream().forEach(element -> System.out.println("Elemento: " + element));

        // Recorrer un conjunto usando Stream
        System.out.println("Recorrido del conjunto usando Stream:");
        set.stream().forEach(element -> System.out.println("Elemento: " + element));

        // Recorrer un mapa usando Stream
        System.out.println("Recorrido del mapa usando Stream:");
        mapa.entrySet().stream().forEach(entry ->
                System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue()));
        
        // Recorrer una lista usando función flecha o función lambda
        System.out.println("Recorrido de la lista usando función flecha o función lambda:");
        lista.forEach(element -> System.out.println("Elemento: " + element));

        // Recorrer un conjunto usando función flecha o función lambda
        System.out.println("Recorrido del conjunto usando función flecha o función lambda:");
        set.forEach(element -> System.out.println("Elemento: " + element));

        // Recorrer un mapa usando función flecha o función lambda
        System.out.println("Recorrido del mapa usando función flecha o función lambda:");
        mapa.forEach((key, value) -> System.out.println("Clave: " + key + ", Valor: " + value));
        
        // Unir dos listas en una sola
        List<String> newList = new ArrayList<>();
        newList.addAll(lista);
        newList.addAll(Arrays.asList("Juan", "Otero"));
        System.out.println("Unión de dos listas: " + newList);

        // Desordenar una lista
        Collections.shuffle(lista);
        System.out.println("Lista desordenada: " + lista);
    }

}
