
import java.util.Scanner;


public class ejercicio5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("La suma de ambos numeros es: " + (num1 + num2));
        System.out.println("La resta del primer numero menos el segundo es: " + (num1 - num2));
        System.out.println("La multiplicacion entre ambos numeros es: " + (num1*num2));
        System.out.println("La division del primer numero divido el segundo es: " + (num1/num2));
        
    }
}
