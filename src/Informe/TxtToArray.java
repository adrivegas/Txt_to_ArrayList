package Informe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class TxtToArray {
	
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();
        ArrayList<Integer> precio = new ArrayList<>();
        ArrayList<Integer> cantidad_precio = new ArrayList<>();       
                        
        try (BufferedReader b = new BufferedReader(new FileReader(archivo))) {
            while (b.ready()) {
                result.add(b.readLine());                
            }        
        }
        // Extrae el nombre de los productos en una lista "productos"
        for (int i = 0; i < result.size(); i= i+4) {		
        	productos.add(result.get(i));	
		}
        System.out.println(productos);
        
        // Extrae la cantidad de los productos en una lista "cantidad"
        for (int i = 1; i < result.size(); i= i+4) {		
        	cantidad.add(Integer.parseInt(result.get(i)));	
		}
        System.out.println(cantidad);
        
        // Extrae el precio de los productos en una lista "precio"
        for (int i = 2; i < result.size(); i= i+4) {		
        	precio.add(Integer.parseInt(result.get(i)));	
		}
        System.out.println(precio);
        
        // Lista con el resultado de multiplicar la cantidad de cada producto por el precio
        
        for (int i = 0; i < cantidad.size(); i++) {		
        	cantidad_precio.add(cantidad.get(i) * precio.get(i));	
		}
        System.out.println(cantidad_precio); 
        
    }
	
	
	
	public static void generaInforme(String informe) throws FileNotFoundException, IOException {
        
		try {			
            String saludo = "Bienvenido don José!\n";
            String saludo2 = "La lista de productos es la siguiente:";
            File file = new File(informe);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            //Recorrido de los productos
            for (int i = 1; i < 10; i++) {		
            	System.out.println("Producto " + i);	            	
    		}
            
                       
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(saludo);
            bw.write(saludo2);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	
	
	public static void main(String [] arg) throws FileNotFoundException, IOException {
		muestraContenido("A:\\Productos\\productos.txt");
		generaInforme("A:\\Productos\\informe.txt");

	}
	
	
}