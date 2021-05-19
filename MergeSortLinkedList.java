/**
 * Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
 * Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * value[]  = {3,5,2,4,1}
 * Output: 1 2 3 4 5
 * Explanation: After sorting the given
 * linked list, the resultant matrix
 * will be 1->2->3->4->5.
 * Example 2:
 *
 * Input:
 * N = 3
 * value[]  = {9,15,0}
 * Output: 0 9 15
 * Explanation: After sorting the given
 * linked list , resultant will be
 * 0->9->15.
 */
class NodeMerge
{
    int data;
    NodeMerge next;
    NodeMerge(int data)
    {
        this.data = data;
    }
}
class MergeSortLL
{
    NodeMerge head;

    public void insert(int data)
    {
        NodeMerge node = new NodeMerge(data);
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            NodeMerge n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public NodeMerge getMiddle(NodeMerge node)
    {
        NodeMerge slow=node;
        NodeMerge fast=node;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public NodeMerge Merge(NodeMerge left, NodeMerge right)
    {
        NodeMerge node = null;
        if(left==null)
            return right;
        if(right==null)
            return left;
        if(left.data<right.data)
        {
            node = left;
            node.next = Merge(left.next, right);
        }
        else
        {
            node = right;
            node.next = Merge(left, right.next);
        }
        return node;
    }
    public NodeMerge MergeSort(NodeMerge head)
    {
        if (head.next == null)
            return head;
        NodeMerge mid = getMiddle(head);
        NodeMerge head2 = mid.next;
        mid.next = null;

        NodeMerge left = MergeSort(head);
        NodeMerge right = MergeSort(head2);
        NodeMerge node = Merge(left, right);
        return node;
    }
    public void display(NodeMerge head)
    {
        while (head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
public class MergeSortLinkedList
{
    public static void main(String[] args)
    {
        MergeSortLL list = new MergeSortLL();
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(30);
        list.insert(30);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.display(list.head);
        NodeMerge head = list.MergeSort(list.head);
        list.display(head);
    }
}
