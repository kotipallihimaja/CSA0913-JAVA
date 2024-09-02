public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {8 ,9,10,11};
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) 
         {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++)
         {
            mergedArray[array1.length + i] = array2[i];
        }
        System.out.println("Merged Array:");
        for (int i = 0; i < mergedArray.length; i++)
         {
            System.out.print(mergedArray[i] + " ");
        }
    }
}

