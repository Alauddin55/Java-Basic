import java.util.Scanner;

public class Math27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,max,min;
        System.out.print("Enter 1st number: ");
        x=input.nextInt();
        System.out.print("Enter 2nd number: ");
        y=input.nextInt();
        
        max=Math.max(x,y);
        System.out.println("Max = "+max);
        min=Math.min(x, y);
        System.out.println("Min = "+min);

        int round=Math.round(8.2f);
        System.out.println("Round number is= "+round);

        double pi=Math.PI;
        System.out.println("pi number is= "+pi);


    }
}
