package recursivePattern;
import java.util.Scanner;

public class recursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find pattern: ");
        int num = input.nextInt();
        PatternCreator(num, num, -1);
    }

    static void PatternCreator(int constantNum, int variableNum, int sign)
    {
        if(variableNum > constantNum) return;
        if(variableNum < 1) sign *= -1;
        System.out.print(" " + variableNum + " ");
        PatternCreator(constantNum, variableNum  + sign * 5, sign);
    }
}