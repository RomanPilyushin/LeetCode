import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 1/17/2017.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    private static List<String> fizzBuzz2(int val) {
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= val; i++) {
            if (i % 3 == 0 && i % 5 == 0) stringList.add("FizzBuzz");
            else if (i % 3 == 0) stringList.add("Fizz");
            else if (i % 5 == 0) stringList.add("Buzz");
            else stringList.add(String.valueOf(i));
        }
        return stringList;
    }

    public static List<String> fizzBuzz(int n) {
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) stringList.add("FizzBuzz");
            else if (i % 3 == 0) stringList.add("Fizz");
            else if (i % 5 == 0) stringList.add("Buzz");
            else stringList.add(String.valueOf(i));
        }
        return stringList;
    }
}

