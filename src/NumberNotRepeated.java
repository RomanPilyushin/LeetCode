/**
 * Created by User on 1/19/2017.
 */
public class NumberNotRepeated {
    public static void main(String[] args) {
        int[] array = new int[] {23, 34, 56, 21, 21, 56, 78, 23, 34};
        System.out.println(notRepeated(array));

    }

    public static int notRepeated(int[] array) {
        int[] arrayNotDublicate = new int[array.length];
        int result = 0;
        for (int i : array) {
            arrayNotDublicate[i] ^= i;
        }


        return result;
    }
}
