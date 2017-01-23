import java.util.Arrays;

/**
 * Created by User on 1/17/2017.
 */
public class RotateMatrixBy90Degrees {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] array2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array3 = new int[][]{
                {1, 2},
                {4, 5}
        };

        printArray(by90Degrees(array));
    }

    private static int[][] by90Degrees(int[][] sourceArray) {
        int len = sourceArray.length;
        int[][] resultArray = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                resultArray[i][j] = sourceArray[len - j - 1][i];
            }
        }
        return resultArray;
    }

    private static void printArray(int[][] source) {
        for (int[] ints : source) {
            for (int i : ints) {
                System.out.print("  " + i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
