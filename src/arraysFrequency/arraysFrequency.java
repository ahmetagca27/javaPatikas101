package arraysFrequency;
import java.util.Arrays;
public class arraysFrequency {
    public static void main(String[] args) {
        // Finding the frequency of elements in a given array
        int[] numbers = {12, 0, -43, 12, 5, -32, -32, 23, 76, 50, 76, 50, 76, 0, 0};
        int counter = 1;
        // Items in array
        System.out.println("Array : " + Arrays.toString(numbers));

        // Sort of elements in array
        Arrays.sort(numbers);
        System.out.println("Sort : " + Arrays.toString(numbers));
        System.out.println(" ");
        //Finding repeating numbers
        System.out.println("Tekrar Sayıları ");

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        counter++;
                    }
                }
                System.out.println(numbers[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            else if (numbers[i] != numbers[i-1]) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        counter++;
                    }
                }
                System.out.println(numbers[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 1;
        }
    }
}