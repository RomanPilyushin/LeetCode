package Sorts;

import java.util.Arrays;

/**
 * Created by User on 1/27/2017.
 */
public class Selection {
    public static void main(String[] args) {
        Selection selection = new Selection();
        int[] ar = {40, 10, -30, 45, 39, 32};
        System.out.println(Arrays.toString(ar));
        selection.selectionSort(ar);
        System.out.println();
        System.out.println(Arrays.toString(ar));
    }

    private void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index]) {
                    index = j;
                }

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
}
