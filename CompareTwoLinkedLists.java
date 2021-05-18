/**
 * Given two string, represented as linked lists (every character is a node->data in the linked list).
 * Write a function compare() that works similar to strcmp(),
 * i.e., it returns 0 if both strings are same, 1 if first linked list is lexicographically greater,
 * and -1 if second is lexicographically greater.
 *
 * Input:
 * First line of input contains number of testcases T. For each testcase,
 * there will be 4 lines of input. First line of which contains
 * length of first linked list and next line contains the linked list,
 * similarly next two lines contains length and linked list respectively.
 *
 * Output:
 * Comapare two strings represented as linked list.
 *
 * User Task:
 * The task is to complete the function compare() which compares the strings
 * through linked list and returns 0, 1 or -1 accordingly.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N, M <= 100
 *
 * Example:
 * Input:
 * 2
 * 5
 * a b a b a
 * 4
 * a b a a
 * 3
 * a a b
 * 3
 * a a b
 *
 * Output:
 * 1
 * 0
 *
 * Explanation:
 * Testcase 1: String consisting of nodes of first linked list is
 * lexicographically greater than the second one. So, the result is 1.
 */
class NodeX
{
    char data;
    NodeX next;
}
class LinkedListX
{
    NodeX head;
    public void insert(char data)
    {
        NodeX node = new NodeX();
        node.data = data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            NodeX n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public int compare(NodeX llist1, NodeX llist2)
    {
        while (llist1!=null && llist2!=null)
        {
            if(llist1.data > llist2.data)
            {
                return 1;
            }
            else if(llist1.data < llist2.data)
            {
                return -1;
            }
            else
            {
                llist1 = llist1.next;
                llist2 = llist2.next;
                continue;
            }
        }
        if(llist1!=null)
            return 1;
        if (llist1!=null)
            return -1;
        return 0;
    }
    public void show()
    {
        NodeX node = head;
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}
public class CompareTwoLinkedLists
{
    public static void main(String[] args)
    {
        LinkedListX Llist = new LinkedListX();
        LinkedListX Llist1 = new LinkedListX();
        Llist1.insert('a');
        Llist1.insert('b');
        Llist1.insert('a');
        Llist1.insert('b');
        Llist1.insert('a');
        Llist1.show();
        System.out.println();

        LinkedListX Llist2 = new LinkedListX();
        Llist2.insert('a');
        Llist2.insert('b');
        Llist2.insert('a');
        Llist2.insert('a');
        Llist2.show();
        System.out.println();

        int x = Llist.compare(Llist1.head, Llist2.head);
        System.out.println(x);
    }
}
