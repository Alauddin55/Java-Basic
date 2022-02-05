import java.util.Scanner;

public class NestedLoop38 {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in); 
         int m,n;
         System.out.print("Enter any positive number: ");
         m=input.nextInt();
         System.out.print("Enter Final number: ");
         n=input.nextInt();
         for(int i=m;i<=n;i++){
            System.out.println("");
             for(int j=1;j<=10;j++){
                
                 System.out.println(i+"x"+j+"="+i*j);
             }
            
         }
        
     }
}
