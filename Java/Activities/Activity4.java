package Activities;
import java.util.*;

class Activity4 {
    static void ascendingSort(int array[]) {
        int size = array.length, i;
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] data = { 100, 5442, 98998, 2345677, 32330 };
        ascendingSort(data);
        System.out.println("Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}