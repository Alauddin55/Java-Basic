import java.util.Scanner;
public class Arithmetic12 {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int n1,n2,rsl;
     System.out.print("Enter a number: ");
      n1=input.nextInt();
     System.out.print("Enter 2nd number: ");
      n2=input.nextInt();
    rsl=n1+n2;
     System.out.println("The number is = "+rsl);
    rsl=n1-n2;
     System.out.println("The number is = "+rsl);
    double rsl2=(double)n1/n2;
     System.out.println("The number is = "+rsl2);
    rsl=n1%n2;
     System.out.println("The number is = "+rsl);
}
    
}