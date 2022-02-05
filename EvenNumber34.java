import java.util.Scanner;

public class EvenNumber34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,i,m,n;
        System.out.print("Enter 1st number: ");
        m=input.nextInt();
        System.out.print("Enter 2nd number: ");
        n=input.nextInt();

        for(i=m;i<=n;i++){
            if(i%2==0){
            sum=sum+i;
            System.out.println(i);
            }
            

        }
        
        System.out.println("Sum is= "+sum);
        
    }
    
}