/**
 * Given a Singly Linked List of size N, delete all alternate nodes of the list.
 *
 * Example 1:
 *
 * Input:
 * LinkedList: 1->2->3->4->5->6
 * Output: 1->3->5
 * Explanation: Deleting alternate nodes
 * results in the linked list with elements
 * 1->3->5.
 *
 *
 * Example 2:
 *
 * Input:
 * LinkedList: 99->59->42->20
 * Output: 99->42
 */
class Node1
{
    int data;
    Node1 next;
}
class LinkedList
{
    Node1 head;
    public void Insert(int data)
    {
        Node1 node = new Node1();
        node.data = data;
        node.next = null;
        if(head==null)
        {
            head = node;
        }
        else
        {
            Node1 n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void deleteAlternateNodes()
    {
        Node1 prev = head;
        Node1 curr = head.next;
        System.out.print(prev.data+" ");
        while (prev!=null && curr!=null)
        {
            prev.next = curr.next;
            curr = null;
            prev = prev.next;
            if(prev!=null)
            {
                System.out.print(prev.data+" ");
                curr = prev.next;
            }
        }
    }
    public void show()
    {
        Node1 node = new Node1();
        node = head;
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}

public class DeleteAlternateNodes
{
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.Insert(10);
        llist.Insert(20);
        llist.Insert(30);
        llist.Insert(40);
        llist.Insert(50);
        llist.show();
        System.out.println();
        llist.deleteAlternateNodes();
    }
}
