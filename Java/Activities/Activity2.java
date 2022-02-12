package Activities;
import java.util.*;
public class Activity2 {
    public static void main(String[] args) {

        int[] numArr = {10,77,10,54,-11,10};
        System.out.println("Original Array: " +Arrays.toString(numArr));
        int searchNumber = 10;
        int fixedSum = 30;

        System.out.println("Result: " +result(numArr, searchNumber, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNumber, int fixedSum) {
        int temp = 0;

        for (int number : numbers) {

            if (number == searchNumber) {

                temp += searchNumber;
            }


            if (temp> fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp == fixedSum;
    }
}