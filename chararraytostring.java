import java.util.Scanner;

public class chararraytostring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char a[]={'w','e','l','c','o','m','e'};
        String s2=new String(a);
        System.out.println(s1+" "+s2);

    }
}