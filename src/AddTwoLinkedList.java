
/**
 * Created by User on 1/20/2017.
 */
public class AddTwoLinkedList {
    public static void main(String[] args) {
        AddTwoLinkedList list1 = new AddTwoLinkedList();
        AddTwoLinkedList list2 = new AddTwoLinkedList();

        for (int i = 1; i <= 3; i++) {
            list1.push(i);
        }

        for (int i = 3; i >= 1; i--) {
            list2.push(i);
        }

        printList(list1);
        printList(list2);
        System.out.println("---------------------------");
        printList(addTwoNumbers(list1, list2));

    }

    public static AddTwoLinkedList addTwoNumbers(AddTwoLinkedList list1, AddTwoLinkedList list2) {
        if (list1 == null && list2 == null) return null;
        else if (list1 == null || list2 == null) return list1 == null ? list2 : list1;

        int numberList1 = list1.listToInt();
        int numberList2 = list2.listToInt();
        return intToList(numberList1 + numberList2);
    }

    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public int listToInt() {
        StringBuilder s = new StringBuilder();
        Node tmp = head;
        while (tmp != null)
        {
            s.append(Integer.toString(tmp.data));
            tmp = tmp.next;
        }
        return Integer.parseInt(s.toString());
    }

    public static AddTwoLinkedList intToList(int number) {
        AddTwoLinkedList list = new AddTwoLinkedList();
        
        int len = Integer.toString(number).length();
        int[] arrayNumbers = new int[len];

        while (number > 0) {
            arrayNumbers[len - 1] = number % 10;
            len -= 1;
            number /= 10;
        }

        for (int i : arrayNumbers) {
            list.push(i);
        }

        return list;
    }

    public static void printList(AddTwoLinkedList list) {
        Node tmp = list.head;
        while (tmp != null)
        {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void push(int data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
}
