import java.util.Scanner;

class LinkedList1 {
    Node head;

    public void add(String data) {
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

    public void remove(int index) {
        if (head == null || index < 0) {
            System.out.println("Invalid index. Please enter a valid number.");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int count = 0;

        while (current != null && count < index) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid index. Please enter a valid number.");
        } else {
            previous.next = current.next;
        }
    }

    public void printList() {
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class linkedList1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to add in list:");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter elements to add to the LinkedList:");
        for (int i = 0; i < num; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            list.add(element);
        }

        list.printList();

        System.out.print("Enter the index of the element to remove: ");
        int index = scanner.nextInt();
        list.remove(index);

        list.printList();
    }
}