import java.util.Scanner;

public class primeNumber39 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,count=0;
        System.out.print("Enter a number:");
        m=input.nextInt();
        for(int i=2;i<m;i++){
            if(m%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("It's a prime Number");
        }
        else{
            System.out.println("It's not a prime Number");
        }
    
    }
    
}