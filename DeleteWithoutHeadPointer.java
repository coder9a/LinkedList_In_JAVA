/**
 * You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes.
 * The task is to delete the node. Pointer/ reference to head node is not given.
 * Note: No head reference is given to you.
 * It is guaranteed that the node to be deleted is not a tail node in the linked list.
 *
 * Example 1:
 *
 * Input:
 * N = 2
 * value[] = {1,2}
 * node = 1
 * Output: 2
 * Explanation: After deleting 1 from the
 * linked list, we have remaining nodes
 * as 2.
 * Example 2:
 *
 * Input:
 * N = 4
 * value[] = {10,20,4,30}
 * node = 20
 * Output: 10 4 30
 * Explanation: After deleting 20 from
 * the linked list, we have remaining
 * nodes as 10, 4 and 30.
 */
class NodeD
{
    int data;
    NodeD next;
}
class LinkedListD
{
    NodeD head;
    public void insert(int data)
    {
        NodeD node = new NodeD();
        node.data = data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            NodeD n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void delete(NodeD del)
    {
        if(del.next!=null)
        {
            del.data = del.next.data;
            del.next = del.next.next;
        }
        else
        {
            del=null;
        }
    }
    public NodeD search(int data)
    {
        NodeD node = head;
        while (node!=null)
        {
            if(node.data==data)
                break;
            else
                node = node.next;
        }
        return node;
    }
    public void show()
    {
        NodeD node = head;
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}
public class DeleteWithoutHeadPointer
{
    public static void main(String[] args)
    {
        LinkedListD llist = new LinkedListD();
        NodeD node;
        llist.insert(10);
        llist.insert(20);
        llist.insert(30);
        llist.insert(40);
        llist.insert(50);
        llist.show();
        System.out.println();
        node = llist.search(30);
        llist.delete(node);
        llist.show();
    }
}
