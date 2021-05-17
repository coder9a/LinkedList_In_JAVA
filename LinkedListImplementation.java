import java.util.LinkedList;
class Node
{
    int data;
    Node next;
}
class MyLinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next =null;
        if(head==null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    public void insertAtPosition(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next =null;
        if(index == 0)
        {
            insertAtStart(data);
        }
        else
        {
            Node n = head;
            for(int i=0;i<index;i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next=node;
        }
    }
    public void deleteAtPosition(int index)
    {
        if(index==0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }
    public void show()
    {
        Node node = head;
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
public class LinkedListImplementation
{
    public static void main(String[] args)
    {
        MyLinkedList Llist = new MyLinkedList();
        Llist.insert(10);
        Llist.insert(20);
        Llist.insert(30);
        Llist.insert(40);
        Llist.insert(50);
        Llist.show();
        Llist.deleteAtPosition(1);
        Llist.show();
    }
}
