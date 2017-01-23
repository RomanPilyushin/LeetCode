/**
 * Created by User on 1/18/2017.
 */
public class MiddleLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    private void findMiddle() {
        if (head == null) return;

        Node current = head;
        int count = 0;
        int index = 0;
        while(current != null) {
            count++;
            current = current.next;
        }

        if (count % 2 == 0) {
            count /= 2;
            current = head;
            while(current != null) {
                index += 1;
                if (count == index) {
                    System.out.println(current.next.data);
                    return;
                }
                current = current.next;
            }
        } else {
            count = (count / 2) + 1;
            current = head;
            while(current != null) {
                index += 1;
                if (count == index) {
                    System.out.println(current.data);
                    return;
                }
                current = current.next;
            }
        }
    }

    private void printMiddle() {
        if (head == null) return;

        Node slow_ptr = head;
        Node fast_ptr = head;
        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println(slow_ptr.data);
    }



    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    private Node nthFromLastNode(int n) {
        if (n <= 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Node node = this.head;
        if (node == null) return null;
        int count = 0;
        int index = 0;

        while (node != null) {
            count += 1;
            node = node.next;
        }

        node = this.head;
        while (node != null) {
            if (index == (count - n)) {
                return node;
            } else {
                index += 1;
                node = node.next;
            }
        }

        return null;
    }


    public static void main(String [] args) {
        MiddleLinkedList llist = new MiddleLinkedList();
        for (int i = 20; i > 0; i--) {
            llist.push(i);
        }
        llist.printList();
        //llist.printMiddle();
        //llist.findMiddle();
        System.out.println(llist.nthFromLastNode(0).data);
    }
}
