/**
 * Given a doubly linked list, rotate the linked list counter-clockwise by P nodes.
 * Here P is a given positive integer and is smaller than the count of nodes(N) in a linked list.
 *
 * Input:
 * The first line of input contains an integer T denoting the no of test cases.
 * For each test case, the first line of input contains two integers N and P
 * denoting the number of nodes in Linked List and the number of nodes to be rotated respectively.
 *
 * Output:
 * For each test case, output the final linked list after the P rotations in it.
 *
 * Constraints:
 * 1 <= T <= 100
 * 2 <= N <= 100
 * 1 <= P <= N
 *
 * Example:
 * Input:
 * 1
 * 6 2
 * 1 2 3 4 5 6
 *
 * Output:
 * 3 4 5 6 1 2
 */
class NodeDL
{
    int data;
    NodeDL prev;
    NodeDL next;
    NodeDL(int data)
    {
        this.data = data;
    }
}
class RotateDL
{
    NodeDL head;
    NodeDL tail;
    public void insert(int data)
    {
        NodeDL node = new NodeDL(data);
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
    public void Rotate(int N)
    {
//        ----------------------------------------------------------
//        NodeDL curr = head;
//        if(N==0)
//            return;
//        while(N>0)
//        {
//            curr = curr.next;
//            N--;
//        }
//        curr.prev.next=null;
//        curr.prev = null;
//        NodeDL x = head;
//        head = curr;
//        while (curr.next!=null)
//        {
//            curr = curr.next;
//        }
//        curr.next = x;
//        x.prev = curr;
//        ----------------------------------------------------------

        NodeDL curr = head;
        int count=1;
        if (N == 0)
            return;
//        while (count<N && curr!=null)
//        {
//            curr = curr.next;
//            count++;
//        }

        while(N>1)
        {
            curr = curr.next;
            N--;
        }

        NodeDL x = curr;
        while (curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = head;
        head.prev = curr;
        head = x.next;
        head.prev=null;
        x.next=null;
    }

    public void display(NodeDL head)
    {
        while (head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
public class RotateDoublyLinkedList
{
    public static void main(String[] args)
    {
        RotateDL list = new RotateDL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.display(list.head);
        list.Rotate(2);
        list.display(list.head);

    }
}
