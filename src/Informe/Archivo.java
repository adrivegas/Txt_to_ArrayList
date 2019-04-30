/**
 * 
 */
package Informe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author adrivegas08
 *
 */
public class Archivo {

	/**                                                                                                                                                                       
	 * 
	 */

	public static void muestraProductos(String archivo) throws FileNotFoundException, IOException {
       
		String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
           System.out.println(cadena);
      
        }
   
     
        b.close();
        
        
    }

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println ("Introduzca la ruta donde se encuentra el archivo: productos.txt");
        String entradaRuta = "";
        Scanner rutaArchivo = new Scanner (System.in); //Creación de un objeto Scanner
        entradaRuta = rutaArchivo.nextLine (); //Invocamos un método sobre un objeto Scanner

        // System.out.println ("La ruta es: \"" + entradaRuta +"\"");
        // A:\\Productos\\productos.txt
        rutaArchivo.close();
		muestraProductos(entradaRuta);
	}

}
