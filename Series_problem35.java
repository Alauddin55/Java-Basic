import java.util.Scanner;

public class Series_problem35 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,n;
        System.out.print("enter the last number: ");
         n=input.nextInt();
         for(int i=1;i<=n;i++){
             System.out.print(i+"x"+i+" ");
             sum=sum+i*i;
         }
         System.out.println("");
         System.out.println("Sum is ="+sum);
    }
}
