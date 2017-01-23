
/**
 * Created by User on 1/19/2017.
 */
public class PairwiseSwapLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    private void pairWiseSwap() {
        if (head == null || head.next == null) return;

        Node firstNode = head;
        Node secondNode = head.next;
        Node tmp = null;

        while(secondNode != null) {
            tmp = firstNode;
            firstNode = secondNode;
            secondNode = tmp;

            if (secondNode.next.next == null) return;
            secondNode = secondNode.next.next;
            firstNode = firstNode.next.next;
        }
    }

    private void pairWiseSwap2() {

        // If linked list is empty or there is only one node in list
        if (head == null || head.next == null) return;

        // Initialize previous and current pointers
        Node prev = head;
        Node curr = head.next;

        head = curr;  // Change head before proceeeding

        // Traverse the list
        while (true) {
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node

            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                return;
            }

            // Change next of previous to next next
            prev.next = next.next;

            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
    }

    private void pairWiseSwap3() {

    }

    private void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    private void printList() {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        PairwiseSwapLinkedList llist = new PairwiseSwapLinkedList();

        for (int i = 5; i >= 0; i--) {
            llist.push(i);
        }

        System.out.println("Linked List before calling pairWiseSwap() ");
        llist.printList();

        //llist.pairWiseSwap();
        llist.pairWiseSwap2();

        System.out.println("Linked List after calling pairWiseSwap() ");
        llist.printList();
    }
}
