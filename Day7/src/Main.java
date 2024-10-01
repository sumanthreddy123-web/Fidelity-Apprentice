//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Node nd=new Node(20);
//        nd.data=20;
        nd.next=null;
        System.out.println(nd.data+" "+nd.next);
        Node nd2=new Node(30);
        nd.next=nd2;
        System.out.println(nd.data+" "+nd.next);
        System.out.println(nd.data+" "+nd.next.data);
        System.out.println(nd2.data+" "+nd.next);


        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
    }
}
