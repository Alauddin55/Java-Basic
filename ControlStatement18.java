import java.util.Scanner;

public class ControlStatement18 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x;
        System.out.print("Enter any number: ");
        x=input.nextInt();
        if(x>0){
            System.out.print("\"Positive\"");
        }
        else if(x<0)
        {
            System.out.println("\"Negative\"");
        }
        else
        {
            System.out.println("\"Zero\"");
        }

    }
}
