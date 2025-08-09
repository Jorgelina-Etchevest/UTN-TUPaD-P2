
import java.util.Scanner;


public class ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2;
        double num3, num4;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
                
        System.out.print("Ingrese el tercer numero: ");
        num3 = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el cuarto numero: ");
        num4 = Double.parseDouble(input.nextLine());
        
        
        System.out.println("La division entre ambos numeros enteros es: " + (num1/num2));
        System.out.println("La division entre ambos numeros es: " + (num3/num4));
    }
    
}
