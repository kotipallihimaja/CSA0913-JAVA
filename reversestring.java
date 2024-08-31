import java.util.Scanner;

public class reversestring {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a string: ");
      String original=sc.next();
      String newone="";
      int len=original.length();
      for(int i=len-1;i>=0;i--)
      {
        newone+=original.charAt(i);
      }
      System.out.println("reverse string: "+newone);

     sc.close();
    }
    
}