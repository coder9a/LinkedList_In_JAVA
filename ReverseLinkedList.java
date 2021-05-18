/**
 * Given a linked list of N nodes. The task is to reverse this list.
 *
 * Example 1:
 *
 * Input:
 * LinkedList: 1->2->3->4->5->6
 * Output: 6 5 4 3 2 1
 * Explanation: After reversing the list,
 * elements are 6->5->4->3->2->1.
 * Example 2:
 *
 * Input:
 * LinkedList: 2->7->8->9->10
 * Output: 10 9 8 7 2
 * Explanation: After reversing the list,
 * elements are 10->9->8->7->2.
 */
class Node4
{
    int data;
    Node4 next;
}
class LinkedList5
{
    Node4 head;
    public void insert(int data)
    {
        Node4 node = new Node4();
        node.data = data;
        node.next = null;
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node4 n = head;
            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void reverseList()
    {
        Node4 prevPtr, currPtr, nextPtr;
        prevPtr = null;
        currPtr = head;
        while (currPtr!=null)
        {
            nextPtr = currPtr.next;
            currPtr.next = prevPtr;
            prevPtr = currPtr;
            currPtr = nextPtr;
        }
        head = prevPtr;
    }
    public void show()
    {
        Node4 node = head;
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        LinkedList5 Llist = new LinkedList5();
        Llist.insert(10);
        Llist.insert(20);
        Llist.insert(30);
        Llist.insert(40);
        Llist.insert(50);
        Llist.show();
        Llist.reverseList();
        Llist.show();
    }
}
