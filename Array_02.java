import java.util.Scanner;


public class Array_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0;
         double[] num = new double[5];
         System.out.print("please enter three number: ");
         for(int i=0; i<num.length; i++){
         num[i]= input.nextDouble();
         }
         for(int i=0; i<num.length; i++){
             sum = sum +num[i];}
         
         System.out.println("Sum is: "+sum);  

         //average

         double avr = sum/num.length;
         System.out.println("Average is: "+avr);

         //maxi mini
         double max= num[0];
         double mini= num[0];
         for(int i=1;i<5;i++){
           if(max<num[i]){
               max=num[i];
           }
           if(mini>num[i]){
               mini=num[i];
           }

         }
         System.out.println("The maxi is: "+max);
         System.out.println("The mini is: "+mini);
        
    }
    
}
