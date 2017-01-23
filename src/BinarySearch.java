/**
 * Created by User on 1/17/2017.
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binary(new int[]{2, 3, 4, 10, 40}, 40));
    }

    public static int binary(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int middle = 0;
        while (high >= low) {
            middle = (high + low) / 2;
            if (array[middle] == target) {
                return array[middle];
            } else if (array[middle] < target) {
                low = middle + 1;
            } else if (array[middle] > target) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
