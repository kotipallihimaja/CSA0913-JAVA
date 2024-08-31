import java.util.Scanner;

public class primeinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();
        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        for (int i = lowerBound; i <= upperBound; i++) 
        {
            if (isPrime(i)) 
            {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) 
        {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0)
             {
                return false; 
            }
        }

        return true; 
    }
}
