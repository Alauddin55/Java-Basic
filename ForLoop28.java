import java.util.Scanner;

public class ForLoop28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ch;
        System.out.print("Enter your country name: ");
        ch=input.nextLine();
          
        for(int i=1;i<=5;i++){
            System.out.println(i+ "The country name is "+ch);
        }
    }
}
