import java.util.Scanner;

public class Fibonacci41 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int first=0,second=1,fibo,n;
        System.out.print("How many fibo numbers your want= ");
        n=input.nextInt();
        System.out.print(first+" "+second);
        for(int i=3;i<=n;i++){
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
    }
}
