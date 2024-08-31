import java.util.Scanner;

public class rectanglepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a symbol");
        char symbol=sc.next().charAt(0);
        System.out.print("enter no.of rows:");
        int rows=sc.nextInt();
        System.out.print("enter no.of coloums:");
        int coloums=sc.nextInt();
        for(int i=0;i<=rows;i++)
        {
            for(int j=0;j<=coloums;j++){
                System.out.print(symbol +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
