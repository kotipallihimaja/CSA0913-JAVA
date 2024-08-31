import java.util.Scanner;
public class FibonacciSeries 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series: ");
        if (terms < 1) 
        {
            System.out.println("The number of terms should be at least 1.");
        } else if (terms == 1) 
        {
            System.out.println(first);
        } else 
        {
            System.out.print(first + " " + second + " ");
            for (int i = 2; i < terms; i++) 
            {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
        scanner.close();
    }
}