import java.util.Scanner;

public class composite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter 5 integers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("composite numbers:");
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int fact=0;
            for(int j=2;j<=num/2;j++)
            {
                if(num%j==0)
                {
                    fact++;
                    break;
                }
            }
            if(fact!=0&num>1)
            {
                System.out.println(num+"");
            }
        }
        sc.close();
    }
}
