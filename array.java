//What is a 1D array with  example ?
 import java.util.Scanner;
public class array {
    public static void main(String[] args)
    {
            System.out.println("Enter the arry");
        Scanner scan = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0;i<=3;i++)
        {
             i = scan.nextInt();
             System.out.print(a[i]);
        }

    }
    
}
