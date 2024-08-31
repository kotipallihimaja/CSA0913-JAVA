import java.util.Scanner;

public class evensumoffibbonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value n");
        int n=sc.nextInt();
        int fib1=0,fib2=1;
        int evensum=0;
        while(true)
        {
            int fib3=fib1+fib2;
            if(fib3>n)
            {
                break;
            }
            if(fib3%2==0)
            {
                evensum +=fib3;
            }
            fib1=fib2;
            fib2=fib3;
        }
        System.out.println("sum of even fibonacci series"+ n +"is" + evensum);
        sc.close();
    }
}
