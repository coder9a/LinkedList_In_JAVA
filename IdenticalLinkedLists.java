/**
 * Given two Singly Linked List of N and M nodes respectively.
 * The task is to check whether two linked lists are identical or not.
 * Two Linked Lists are identical when they have same data and with same arrangement too.
 *
 * Example 1:
 *
 * Input:
 * LinkedList1: 1->2->3->4->5->6
 * LinkedList2: 99->59->42->20
 * Output: Not identical
 * Example 2:
 *
 * Input:
 * LinkedList1: 1->2->3->4->5
 * LinkedList2: 1->2->3->4->5
 * Output: Identical
 */
class Node2
{
    int data;
    Node2 next;
}
class LinkedList2
{
    Node2 head;
    public void insert(int data)
    {
        Node2 node = new Node2();
        node.data = data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node2 n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void compare(Node2 llist1, Node2 llist2)
    {
        int flag=0;
        while (llist1!=null && llist2!=null)
        {
            if(llist1.data != llist2.data)
            {
                flag = 1;
                break;
            }
            if(llist1==null && llist2==null)
            {
                flag=0;
            }
            llist1 = llist1.next;
            llist2 = llist2.next;
        }
        if(flag==0)
            System.out.println("Linked Lists are Identical");
        else
            System.out.println("Linked Lists are not Identical");
    }
    public void show()
    {
        Node2 node = head;
        while(node!=null)
        {
            System.out.println(node.data+" "+node);
            node = node.next;
        }
    }
}
public class IdenticalLinkedLists
{
    public static void main(String[] args)
    {
        LinkedList2 llist1 = new LinkedList2();
        LinkedList2 llist2 = new LinkedList2();
        LinkedList2 llist = new LinkedList2();
        llist1.insert(10);
        llist1.insert(20);
        llist1.insert(30);
        llist1.insert(40);
        llist1.insert(50);
        llist2.insert(10);
        llist2.insert(20);
        llist2.insert(30);
        llist2.insert(40);
        llist2.insert(50);
        llist.compare(llist1.head, llist2.head);


    }
}
