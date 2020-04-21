
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Clase Scanner
        Scanner sc = new Scanner (System.in);
        //Atributos de Clase
        String nombre="";
        int matricula=0;
        char grupo=0;
        int grado=0;
        
    System.out.println("¿Cuantos alumnos deseas guardar?: ");
    int cantidad=sc.nextInt();
    //Arreglo de objetos
    Alumno alumnos[] = new Alumno[cantidad];
        
    //Llenamos el arreglo de objetos
    for(int i=0; i<alumnos.length; i++){ 
        //Para vaciar el buffered 
        sc.nextLine();
        
        System.out.print((i+1 ) + ".-Ingresa Nombre: ");
        nombre=sc.nextLine();
        System.out.print((i+1 ) + ".-Ingresa Matricula: ");
        matricula=sc.nextInt();
        System.out.print((i+1 ) + ".-Ingresa Grupo: ");
        grupo=sc.next().charAt(0);
        System.out.print((i+1 ) + ".-Ingresa Grado: ");
        grado=sc.nextInt();
        
        //Para vaciar el buffered 
        sc.nextLine();
        
        //Pasamos todas las variables a nuestro objeto
        alumnos[i] = new Alumno(nombre, matricula, grupo, grado);
    }    
        
       //Mostramos el arreglo del objeto
       for(int i=0; i<alumnos.length; i++){   
           System.out.println("Los datos son: ");
           System.out.println((i+1)+".-Nombre: "+alumnos[i].getNombre());
           System.out.println((i+1)+".-Matricula: "+alumnos[i].getMatricula());
           System.out.println((i+1)+".-Grupo: "+alumnos[i].getGrupo());
           System.out.println((i+1)+".-Grado: "+alumnos[i].getGrado());
       }
    
 
        
    }
}
