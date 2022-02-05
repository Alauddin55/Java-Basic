import java.util.Scanner;

public class Conditional_25 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1,num2,result;
        System.out.print("Enter first number: ");
        num1=input.nextInt();
        System.out.print("Enter second number: ");
        num2=input.nextInt();

        result=(num1>num2)?num1:num2;
        System.out.println("The large number is= "+result);
    }
}
