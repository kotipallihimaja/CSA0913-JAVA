import  java.util.Scanner;
public class matrixaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int res[][]=new int[3][3];
        System.out.println("matrix 1");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix 2");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                res[i][j]=0;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                
                    res[i][j]=arr1[i][j]+arr2[i][j];
                

            }
            
        }
        System.out.println("addition of matrix:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}