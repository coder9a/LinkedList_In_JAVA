/**
 * Given a singly linked list and a key, count the number of occurrences of given key in the linked list.
 *
 * Example 1:
 *
 * Input:
 * N = 7
 * Link List = 1->2->1->2->1->3->1
 * search_for = 1
 * Output: 4
 * Explanation:1 appears 4 times.
 * Example 2:
 *
 * Input:
 * N = 5
 * Link List = 1->2->1->2->1
 * search_for = 3
 * Output: 0
 * Explanation:3 appears 0 times.
 */
class NodeO
{
    int data;
    NodeO next;
}
class MyLinkedListO
{
    NodeO head;
    public void insert(int data)
    {
        NodeO node = new NodeO();
        node.data = data;
        node.next =null;
        if(head==null)
        {
            head = node;
        }
        else
        {
            NodeO n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void search(int n)
    {
        int count=0;
        NodeO node = head;
        while (node!=null)
        {
            if(node.data==n)
                count++;
            node = node.next;
        }
        System.out.println(count);
    }
    public void show()
    {
        NodeO node = head;
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
public class OccurenceOfAnInteger
{
    public static void main(String[] args)
    {
        MyLinkedListO llist = new MyLinkedListO();
        llist.insert(10);
        llist.insert(20);
        llist.insert(10);
        llist.insert(30);
        llist.insert(10);
        llist.insert(40);
        llist.insert(10);
        llist.insert(50);
        llist.show();
        llist.search(10);
    }
}
