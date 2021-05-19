class NodeDoublyLL
{
    int data;
    NodeDoublyLL prev;
    NodeDoublyLL next;
    NodeDoublyLL(int data)
    {
        this.data = data;
    }
}
class DoublyLL
{
    NodeDoublyLL head;
    NodeDoublyLL tail;
    public void insert(int data)
    {
        NodeDoublyLL node = new NodeDoublyLL(data);
        if(head==null)
        {
            head = tail = node;
            head.prev=null;
            head.next=null;
        }
        else
        {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }
    }
    public void deleteAt(int data)
    {
        NodeDoublyLL n = head;
        if (n==null)
            return;
        if(n.next==null)
        {
            if(n.data==data)
            {
                n = null;
                return;
            }
        }
        while (n.data!=data)
        {
            n = n.next;
        }
        if(n.data == data)
        {
            NodeDoublyLL x = n.prev;
            NodeDoublyLL y = n.next;
            x.next = y;
            y.prev = x;
            n = null;
        }
    }
    public void deleteFirst()
    {
        NodeDoublyLL node = head;
        NodeDoublyLL x = node;
        x = x.next;
        x.prev = null;
        head = x;
    }
    public void deleteLast()
    {
        NodeDoublyLL node = head;
        while (node.next!=null)
        {
            node = node.next;
        }
        NodeDoublyLL x = node;
        x = node.prev;
        x.next = null;
        node = node;
    }
    public void display()
    {
        NodeDoublyLL node = head;
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
public class DoublyLinkedListImplementation
{
    public static void main(String[] args)
    {
        DoublyLL list = new DoublyLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        list.deleteAt(20);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
    }
}
