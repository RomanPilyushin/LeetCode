import sun.reflect.generics.tree.Tree;

/**
 * Created by User on 1/23/2017.
 */
public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] array = new int[] {1, 4, 6, 10, 77, 100, 211};
        SortedArrayToBST arrayToBST = new SortedArrayToBST();
        //System.out.println(arrayToBST.sortedArrayToBST(array));
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) return null;
        return sortedArrayToBST(num, 0, num.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] num, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid - 1);
        root.right = sortedArrayToBST(num, mid + 1, end);
        return root;
    }

}


