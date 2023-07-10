
import java.util.Enumeration;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class claseEnumeration {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        
        //agregar elementos al vector
        vector.addElement("elemento 1");
        vector.addElement("elemento 2");
        vector.addElement("elemento 3");
        
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String elemento = enumeration.nextElement();
            System.out.println("elemento: "+elemento);
        }
    }
    
}
