import java.util.Arrays;

/**
 * Created by User on 1/24/2017.
 */
public class SpiralArray {
    public static void main(String[] args) {
        int[][] array = new int[][] {
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19}
        };

        SpiralArray s = new SpiralArray();
        System.out.println(Arrays.toString(s.spiralArray(array)));
    }

    private int[] spiralArray(int[][] source) {
        int[] resultArray = new int[source.length * source.length];
        int j = 0;
        int k = 0;
        int l = 0;
        int m = source.length;
        int n = source.length;

        while (k < m && l < n) {
            for (int i = l; i < n; i++) {
                resultArray[j] = source[k][i];
                j += 1;
            }
            k++;

            for (int i = k; i < m; i++) {
                resultArray[j] = source[i][n - 1];
                j += 1;
            }
            n--;
        }
        return resultArray;
    }
}
