import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        int reversednum=0;
        while(num!=0)
        {
            int digit=num%10;
            reversednum=reversednum*10+digit;
            num/=10;

        }
        System.out.println("reversednum: " + reversednum);
    }
}
