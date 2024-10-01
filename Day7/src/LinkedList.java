public class LinkedList {
    private Node head;
    private Node tail;
    private int size;


    LinkedList()
    {
        head=tail=null;
        size=0;
    }
    public void addFirst(int data)
    {
        Node newNode =new Node(data);
        newNode.next=head;
        head= newNode;
        if(size==0)
        {
            tail= newNode;
        }
        size++;
    }
    public void addLast(int data)
    {
        Node newNode =new Node(data);
        if(size==0)
        {
            head=tail= newNode;
        }
        tail.next= newNode;
        tail=tail.next;
        size++;
    }

    public void addAt(int data,int pos)
    {
        Node temp = head;
        for(int i=1;i<=pos-1;i++)
        {
            temp=temp.next;
        }
        Node n = new Node(data);
        n.next=temp.next;
        temp.next=n;
        size++;
    }
    public int getFirst()
    {
        return head.data;
    }
    public int getLast()
    {
        return tail.data;
    }
    public void RemoveFirst()
    {
        head=head.next;
        this.size--;
    }
    public void RemoveLast()
    {
        Node temp=head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        temp.next=null;
    }


    public void Display()
    {
        Node tmp=head;
        while(tmp!=null)
        {
            System.out.println(tmp.data+"->");
            tmp=tmp.next;
        }
    }

}
