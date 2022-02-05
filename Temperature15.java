import java.util.Scanner;

public class Temperature15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double f,celsius;
         System.out.print("Fahrenheit temperature is: ");
         f=input.nextDouble();

         celsius=0.5555*(f-32);
         System.out.print("Celsius temperature is: "+celsius);
         
    }
}
