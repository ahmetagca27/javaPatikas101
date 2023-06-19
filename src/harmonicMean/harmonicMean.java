package harmonicMean;
import java.util.Arrays;

public class harmonicMean {
    public static void main(String[] args) {
        double[] numberList = {2,4,6,8};
        double sum = 0;

        for (double item : numberList) {
            sum += 1 / item;
        }

        System.out.println(Arrays.toString(numberList) + " Dizisinin");
        System.out.println("Harmonik Ortalama : " + numberList.length / sum);

    }
}
