import java.util.Scanner;

public class lcmandgcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=a;
        int b1=b;
       while(b1!=0)
       {
        int temp=b1;
        b1=gcd%b1;
        gcd=temp;
       }
       System.out.println("gcd num: "+gcd);

            int lcm=(a*b)/gcd;
            System.out.println("lcm num: "+lcm);
        sc.close();
    }
     
}