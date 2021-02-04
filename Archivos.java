package archivos;
import java.io.*;
import java.util.*;

public class Archivos {

    public static void main(String[] args) {
        
        File archivo = new File("C://pruebas//archivo.txt");
        final Formatter nuevoarchivo;
        Scanner x;
        
        if(archivo.exists()){ //Comprueba si existe
            if(archivo.canWrite()){ //Comprueba que no sea de solo lectura
                x = new Scanner("archivo.txt");
                while(x.hasNext()){
                    String a = x.next();                 
                    System.out.printf("%s",a);
                }
                x.close();
            } else {
                System.out.println("El archivo existe pero no puedo escribir");
            }
        }else{ //Si no lo crea
            try{
                nuevoarchivo = new Formatter("C://pruebas//archivo.txt"); 
                //El archivo ha sido creado con exito
                nuevoarchivo.format("%s%s","Jose ","3");
                nuevoarchivo.close();
            }
            catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
    }
}