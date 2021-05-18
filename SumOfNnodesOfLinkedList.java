/**
 * Given a single linked list of size M, your task is to complete the function sumOfLastN_Nodes(),
 * which should return the sum of last N nodes of the linked list.
 *
 * Input:
 * The function takes two arguments as input, the reference pointer to the head of the linked list and the an integer N.
 * There will be T test cases and for each test case the function will be called seperately.
 *
 * Output:
 * For each test case output the sum of last N nodes of the linked list.
 *
 * Constraints:
 * 1<=T<=100
 * 1<=N<=M<=1000
 *
 * Example:
 * Input:
 * 2
 * 6 3
 * 5 9 6 3 4 10
 * 2 2
 * 1 2
 *
 * Output:
 * 17
 * 3
 *
 * Explanation:
 * Testcase 1: Sum of last three nodes in the linked list is 3 + 4 + 10 = 17.
 */
class Node
{
    int data;
    Node next;
}
class LinkedList4
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
//    ----------------------------------------------------
//    public int count()
//    {
//        int c=0;
//        Node n = head;
//        while (n!=null)
//        {
//            c++;
//            n = n.next;
//        }
//        return c;
//    }
//    public void sumofLastNnodes(int x)
//    {
//        Node node = head;
//        int n = count();
//        int sum=0;
//        for (int i=0;i<n-x;i++)
//        {
//            node = node.next;
//        }
//        while (node!=null)
//        {
//            sum = sum+node.data;
//            node = node.next;
//        }
//        System.out.println(sum);
//    }
//    ---------------------------------------------------------
    public void reverseList()
    {
        Node prevPtr, currPtr, nextPtr;
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
    public void sumOflastNnodes(int n)
    {
        Node node = head;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum = sum+node.data;
            node = node.next;
        }
        System.out.println(sum);
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

public class SumOfNnodesOfLinkedList
{
    public static void main(String[] args)
    {
        LinkedList4 Llist = new LinkedList4();
        Llist.insert(10);
        Llist.insert(20);
        Llist.insert(30);
        Llist.insert(40);
        Llist.insert(50);
        Llist.show();
        Llist.reverseList();
        Llist.sumOflastNnodes(3);
    }
}
