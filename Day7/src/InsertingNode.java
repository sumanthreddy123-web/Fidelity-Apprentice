public class InsertingNode {
    Node head;
    public void InserAtPosition(int data,int position) {
        Node newNode1 = new Node(data);
        if(position == 0) {
            newNode1.next=head;
            head=newNode1;
            return ;
        }
        Node current = head;
        int count=0;
        while(current != null && count < position-1) {
            current=current.next;
            count++;
        }
        if(current == null) {
            System.out.println("Positions out of Bounds");
            return;

        }
        newNode1.next=current.next;
        current.next=newNode1;
    }
    public void printList()
    {
        Node current = head;
        while(current != null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertingNode in=new InsertingNode();
        in.head =new Node(16);
        in.head.next=new Node(13);
        in.head.next.next=new Node(7);
        System.out.println("Initial list");
        in.printList();
        in.InserAtPosition(1,2);
        System.out.println("Updated  List");
        in.printList();

    }
}
