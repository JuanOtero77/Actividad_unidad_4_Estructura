
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class clasePropeties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        
        //Establecer una propiedad
        properties.getProperty("1", "elemento 1");
        properties.getProperty("2", "elemento 2");
        
        //eliminar una propiedad
        properties.remove("2");
        
        try {
            FileOutputStream archivoSalida = new FileOutputStream("config.properties");
            properties.store(archivoSalida, "configuacion de la propiedad");
            archivoSalida.close();
            System.out.println("Propiedades guardadas correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar las propiedades: " + e.getMessage());
        }

        // Cargar propiedades desde un archivo
        try {
            FileInputStream archivoEntrada = new FileInputStream("config.properties");
            properties.load(archivoEntrada);
            archivoEntrada.close();
            System.out.println("Propiedades cargadas correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar las propiedades: " + e.getMessage());
        }
        
        System.out.println(properties);
    }
}
