import java.util.Scanner;

public class Switch_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int digit;
        System.out.print("Enter any digit: ");
        digit=input.nextInt();
        switch(digit){
            case 0:
               System.out.println("Zero");
                 break;
            case 1:
               System.out.println("First");
                 break;
            case 2:
               System.out.println("Second");
                 break;
            case 3:
               System.out.println("Third");
                 break;
            case 4:
               System.out.println("Forth");
                 break;
            case 5:
               System.out.println("Fifth");
                 break;
            default:
               System.out.println("Not matching");
        }

    }
}
