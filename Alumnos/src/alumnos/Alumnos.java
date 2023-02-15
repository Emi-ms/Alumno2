package alumnos;
import Alumno.Alumno;
import java.util.Scanner;

public class Alumnos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    // Define la estructura, un array de 5 alumnos
    // pero no crea los objetos
    Alumno[] alum = new Alumno[5];
    

    // Pide los datos de los alumnos /////////////////////////////////
        
    System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
/**
 * Llamamos al metodo para ingresar los datos de los alumnos
 */
        ingresaAlumnos(alum, entrada);
    
    // Muestra los datos de los alumnos /////////////////////////////////
    
    System.out.println("Los datos introducidos son los siguientes:");
/**
 * Mostramos los datos de los alumnos y la suma de todas las notas
 */
    double  sumaNotasAlumnos = muestraDatos(alum);
    
    System.out.println("La media global de la clase es " + sumaNotasAlumnos / 5);
  }
/**
 * 
 * @param asigna los datos de cada alumno
 * @return muestra la informacion de cada alumno
 */
    private static double muestraDatos(Alumno[] alum) {
        double  sumaDeMedias = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alum[i].getNombre());
            System.out.println("Nota media: " + alum[i].getNota());
            System.out.println("----------------------------");
            
            sumaDeMedias += alum[i].getNota();
        } // for i
        return sumaDeMedias;
    }
/**
 * Este metodo
 * Crea los objetos alumno y le asignamos los datos de cada uno de ellos  
 * 
 * @param alum 
 *
 * @param entrada ingresa los datos de los alumnos
 * @throws NumberFormatException 
 */
    private static void ingresaAlumnos(Alumno[] alum, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;
        
        for(int i = 0; i < 5; i++) {
            
            alum[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            (alum[i]).setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alum[i].setNota(notaIntroducida);
        } 
    }
}
