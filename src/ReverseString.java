import java.util.Arrays;
import java.util.Objects;

/**
 * Created by User on 1/16/2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        //System.out.println(reverseString("hello"));
        int[] array = new int[] {6, 100, 0, 4};
        //System.out.println(Arrays.toString(reverseArrayRec(array, 0, array.length - 1)));
        System.out.println(Arrays.toString(reverseArray(array)));

    }
    public static String reverseString2(String s) {
        char[] charArray = s.toCharArray();
        StringBuffer resultString = new StringBuffer();
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString.append(charArray[i]);
        }
        return resultString.toString();
    }

    public String reverseString(String s) {
        //if (Objects.equals(s, " ")) return "";



        char[] charArray = s.toCharArray();
        int i = 0;
        int len = s.length() - 1;
        char tmp;
        while (i < len) {
            tmp = charArray[i];
            charArray[i] = charArray[len];
            charArray[len] = tmp;
            i++;
            len--;
        }
        return new String(charArray);
    }

    public static int[] reverseArray(int[] array) {
        int indexFirst = 0;
        int indexLast = array.length - 1;
        int tmp = 0;

        while (indexFirst <= indexLast) {
            tmp = array[indexLast];
            array[indexLast] = array[indexFirst];
            array[indexFirst] = tmp;
            indexFirst += 1;
            indexLast -= 1;
        }
        return array;
    }

    public static int[] reverseArrayRec(int[] array, int first, int last) {
        int tmp = 0;
        while (first >= last) {
            return array;
        }
        tmp = array[last];
        array[last] = array[first];
        array[first] = tmp;
        reverseArrayRec(array, first += 1, last-=1);
        return array;
    }
}
