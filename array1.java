/*import java.util.Scanner;
public class array1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        System.err.println("array"+arr[i]);
        sc.close();
    }
} */

import java.util.Scanner;
public class array1
{
    public static void main(String[]args)
    {
        int arr[]=new int[]{10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        System.out.println("array element"+arr[i]);
    }
}