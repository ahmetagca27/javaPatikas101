package nearestNumber;
import java.util.Arrays;
import java.util.Scanner;
public class nearestNumber {
    public static void main(String[] args) {
        int[] valueList = {12,42,-4,0,23,1,3,90,-32};
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi : " + Arrays.toString(valueList));

        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int min = number;
        int max = number;

        //We sort our array from smallest to largest
        Arrays.sort(valueList);
        System.out.println("Sıralı : " + Arrays.toString(valueList));

        // Finding the nearest Big number
        for(int item: valueList){
            if(item > number){
                max = item;
                break;
            }
        }

        //Finding the nearest smaller number
        for(int i = valueList.length-1; i >= 0; --i){
            if(valueList[i] < number){
                min = valueList[i];
                break;
            }}

        System.out.println("En yakın büyük : " + max);
        System.out.println("En yakın küçük : " + min);
    }
}

