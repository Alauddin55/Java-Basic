import java.util.Scanner;

public class Factorial37 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num,mul=1;
        System.out.print("Enter any positive Number: ");
        num=input.nextInt();
        for(int i=num;i>=1;i--){
            mul=mul*i;
            System.out.println(i);
           
        }
        System.out.println("Factorial of "+num+"="+mul);
    }
    
}