import java.util.Scanner;

public class numberoffactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        System.out.println("no.of factors of " + num + " are " + count);
        sc.close();
    }
}
