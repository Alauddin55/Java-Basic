import java.util.Scanner;

public class DigitsSum42 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,sum=0,temp,r;
        System.out.print("Enter your number: ");
        n=input.nextInt();
        temp=n;

        while(temp!=0){
            r=temp%10;
            sum=sum+r;
            temp=temp/10;


        }
        System.out.println("The sum of this "+n+" number is= "+sum);

    }
}
