public class TailInsertion {
    Node head;

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TailInsertion list = new TailInsertion();
        int[] data = {141, 302, 164, 530, 474};

        for (int value : data) {
            list.insertAtTail(value);
        }

        list.printList();
    }
}
