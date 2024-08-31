import java.util.Scanner;

public class skipnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=50;
        int N=100;
        int K=7;
        for(int i=M;i<=N;i+=(K+1))
        {
            System.out.println(i);
            if(i+(K+1)<=N)
            {
                System.out.println("");
            }
        }
    }
}
