import java.util.Scanner;

public class Armstrong49 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,sum=0,temp,r;
        System.out.print("Enter your number: ");
        num=input.nextInt();
        temp=num;

        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;


        }
        if(num==sum){
        System.out.println("Armstrond number");  //
        }
        else{ 
            System.out.println("Not armstrong number");
        }
    }
}



