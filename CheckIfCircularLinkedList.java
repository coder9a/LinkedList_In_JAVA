/**
 * Given a singly linked list, find if the linked list is circular or not.
 * A linked list is called circular if it not NULL terminated and
 * all nodes are connected in the form of a cycle. An empty linked list is considered as circular.
 *
 * Example 1:
 *
 * Input:
 * LinkedList: 1->2->3->4->5
 * (the first and last node is connected,
 * i.e. 5 --> 1)
 * Output: 1
 * Example 2:
 *
 * Input:
 * LinkedList: 2->4->6->7->5->1
 * Output: 0
 */
class Node3
{
    int data;
    Node3 next;
}
class LinkedList3
{
    Node3 head;

    public void insert(int data)
    {
        Node3 node = new Node3();
        node.data = data;
        node.next = null;
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node3 n = head;
            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void CheckCircularLinkedList(Node3 head)
    {
        Node3 node = head.next;
        int flag=0;
        if(head==null)
        {
            flag=1;
        }
        else
        {
            while (node!=null && node!=head)
            {
                node=node.next;
            }
            if (node==head)
                flag=1;
        }
        if (flag==1)
            System.out.println("Circular LinkedList");
        else
            System.out.println("Not Circular LinkedList");
    }
}
public class CheckIfCircularLinkedList
{
    public static void main(String[] args)
    {
        LinkedList3 llist = new LinkedList3();
        llist.insert(10);
        llist.insert(20);
        llist.insert(30);
        llist.insert(40);
        llist.insert(50);
        llist.CheckCircularLinkedList(llist.head);
    }
}
