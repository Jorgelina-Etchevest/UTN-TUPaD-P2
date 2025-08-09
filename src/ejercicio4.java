
import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tienes " + edad + " anios");
        
    }
    
}
