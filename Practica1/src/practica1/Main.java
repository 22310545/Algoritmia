package practica1;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Lista lista = new Lista();
        
        int opcion  = 0;
        int dato;
        
        while(opcion != 4)
        {
            
            System.out.println("Menu\n");
            System.out.println("1) Agregar");
            System.out.println("2) Eliminar");
            System.out.println("3) Mostrar");
            System.out.println("4) Salir");
            System.out.println("Opcion = ");
                opcion = scan.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Agrega un dato: ");
                        dato = scan.nextInt();

                    lista.encolar(dato);
                    break;

                case 2:
                    lista.desencolar();
                    break;

                case 3:
                    lista.mostrar();
                    break;

                case 4:
                    System.out.println("Sale bye");
                    break;
            }
        }
        
    }
    
}
