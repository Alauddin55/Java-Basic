
public class Array_1 {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0]= 6;
        num[1]= 9;
        num[4]= 7;
        int sum= num[0]+num[1]+num[4];
        int len= num.length;
        System.out.println("Sum is= "+sum);
        System.out.println("Array size is: "+len);
        System.out.println(num[4]);

    }
}