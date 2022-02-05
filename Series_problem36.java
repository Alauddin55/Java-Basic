import java.util.Scanner;

public class Series_problem36 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,mul=1;
        System.out.print("Enter last number:");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+"x"+i+" ");
            mul=mul*(i);
        }
        System.out.println("");
        System.out.println("Multiple number is="+mul);
    }

}
