public class Arrayaddition {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        if (array1.length != array2.length) {
            System.out.println("Both arrays must have the same length.");
            return;
        }
        int[] resultArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] + array2[i];
        }
        System.out.println("Resulting array after addition:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
