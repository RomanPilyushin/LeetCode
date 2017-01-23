import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by User on 1/17/2017.
 */
public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    private static String reverseWords(String s) {
        if (s.length() == 0) return "";

        ArrayList<String> arrayWords = new ArrayList<>();
        char[] charArray = s.toCharArray();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i <= charArray.length - 1; i++) {
            if (charArray[i] != ' ') {
                word.append(charArray[i]);
            } else {
                arrayWords.add(word.toString());
                word = new StringBuilder();
            }
        }
        arrayWords.add(word.toString());

        String tmp;
        String[] strings = arrayWords.toArray(new String[arrayWords.size()]);
        for (int i = 0; i < strings.length / 2; i++) {
            tmp = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = tmp;
        }
        return Arrays.toString(strings);
    }
}
