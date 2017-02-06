package Trees;

/**
 * Created by User on 2/6/2017.
 */
public class Tree {
    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

    public static void main(String[] args) {

    }

    private TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        else if (head.next == null) new TreeNode(head.val);

        ListNode mid = findMiddle(head);
        TreeNode root = new TreeNode(mid.next.val);
        TreeNode right = sortedListToBST(mid.next.next);
        mid.next = null;
        TreeNode left = sortedListToBST(head);

        root.left = left;
        root.right = right;

        return root;
    }


    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    private TreeNode sortedArrayToBST(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return helperSortedArrayToBST(array, 0, array.length - 1);
    }

    private TreeNode helperSortedArrayToBST(int[] num, int start, int end) {
        if (start > end) return null;

        // Binary Search Thought
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(num[mid]);

        // Divide
        node.left = helperSortedArrayToBST(num, start, mid - 1);
        node.right = helperSortedArrayToBST(num, mid + 1, end);

        // Conquer
        return node;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        /* 2. both non-empty -> compare them */
        if (p != null && q != null)
            return (p.val == q.val  && isSameTree(p.left, q.left)
                                    && isSameTree(p.right, q.right));

        /* 3. one empty, one not -> false */
        return false;
    }

    private TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    private int findMaxDepth(TreeNode root)
    {
        if (root == null) return 0;
        int leftDepth = findMaxDepth(root.left);
        int rightDepth = findMaxDepth(root.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
