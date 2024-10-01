class Headinsertion {

    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Headinsertion list = new Headinsertion();
        int[] data = {383, 484, 392, 975, 321};

        for (int value : data) {
            list.insertAtHead(value);
        }

        list.printList();
    }
}
