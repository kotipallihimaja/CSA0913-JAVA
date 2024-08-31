import java.util.Scanner;

public class compobetweenaandb {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number(a):");
    int a=sc.nextInt();
    System.out.print("enter a number(b):");
    int b =sc.nextInt();
    System.out.println("composite numbers between " + a + "and" + b + "are:");
    for(int i=a;i<=b;i++)
    {
        if(iscomposite(i))
        {
            System.out.print(i + " ");
        }
    }
    sc.close();
}
public static boolean iscomposite(int num)
{
    if(num<2)
    {
        return false;
    }
    int divisorcount=0;
    for(int i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            divisorcount++;
        }
    }
    return divisorcount>2;
}
}
