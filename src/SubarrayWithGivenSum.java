import java.util.Arrays;

/**
 * Created by User on 1/23/2017.
 */
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        SubarrayWithGivenSum arraysum = new SubarrayWithGivenSum();
        int arr[] = {2, 2, 4, 1, 0, 9, 5, 4};
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arraysum.subArraySum(arr, 8)));
    }

    private int[] subArraySumHelpRange(int[] arr, int sum) {
        if (sum > arr[arr.length - 1] || sum < arr[0]) return new int[0];
        if (arr == null || arr.length == 0) return new int[0];
        int[] resultSet = new int[2];
        int low = 0;
        int high = arr.length - 1;

        while (low != high) {
            if ((low + high) > sum) {
                low += 1;
            } else if ((low + high) == sum) break;
        }
        resultSet[0] = low;
        resultSet[1] = high;
        return resultSet;
    }

    private int[] subArraySum(int[] arr, int sum) {
        //if (sum > arr[arr.length - 1] || sum < arr[0]) return new int[0];
        if (arr == null || arr.length == 0) return new int[0];
        int[] resultSet = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    resultSet[0] = i;
                    resultSet[1] = j;
                    return resultSet;
                }
            }
        }
        //resultSet[0] = low;
        //resultSet[1] = high;
        return new int[0];
    }
}
