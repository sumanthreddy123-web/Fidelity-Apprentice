public class ReverseElements {
    Node head;

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    public static void main(String[] args) {
        ReverseElements obj = new ReverseElements();
        obj.append(1);
        obj.append(2);
        obj.append(3);
        obj.append(4);
        obj.append(5);

        System.out.println("Original list:");
        obj.printList();

        obj.reverse();

        System.out.println("Reversed list:");
        obj.printList();
    }
}
