public class Reverse {
    public static void main(String[] args) {
        //reverseArray(new int[]{100, 0, 7, 5});
        reverseString("World!!!");
    }

    private static void reverseArray(int[] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }

    }

    private static void reverseString(String s) {
        final char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
