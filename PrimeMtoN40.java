import java.util.Scanner;

public class PrimeMtoN40 {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int m,n,check=0,sum=0,total=0;
         System.out.print("Enter 1st number:");
         m=input.nextInt();
         System.out.print("Enter last number:");
         n=input.nextInt();
         for(int j=m;j<=n;j++){
             if(j==1){
                 check++;
             }
              for(int i=2;i<j;i++){
                 if(j%i==0)
                    {
                      check++;
                      break;
                    }                   
              }
              if(check==0){
               System.out.println(j); 
               total++;
              }
              check=0;
         }   
         System.out.println("Total prime numbers="+total);
 }
}
         