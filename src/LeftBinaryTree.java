public class LeftBinaryTree {
    public static void main(String[] args) {
        LeftBinaryTree tree = new LeftBinaryTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.leftView();
    }

    Node root;
    int maxDeep = 0;

    void leftViewUtil(Node node, int deep) {
        if (node == null) return;

        if (maxDeep < deep) {
            System.out.print(" " + node.data);
            maxDeep = deep;
        }

        leftViewUtil(node.left, deep + 1);
        leftViewUtil(node.right, deep + 1);
    }

    void leftView() {
        leftViewUtil(root, 1);
    }


}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
