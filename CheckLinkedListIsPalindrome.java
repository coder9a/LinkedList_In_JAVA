/**
 * Given a singly linked list of size N of integers. 
 * The task is to check if the given linked list is palindrome or not.
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * value[] = {1,2,1}
 * Output: 1
 * Explanation: The given linked list is
 * 1 2 1 , which is a palindrome and
 * Hence, the output is 1.
 * Example 2:
 *
 * Input:
 * N = 4
 * value[] = {1,2,3,4}
 * Output: 0
 * Explanation: The given linked list
 * is 1 2 3 4 , which is not a palindrome
 * and Hence, the output is 0.
 */
class NodeP
{
    int data;
    NodeP next;
}
class LinkedListPalindrome
{
    NodeP head;
    public void insert(int data)
    {
        NodeP node = new NodeP();
        node.data = data;
        node.next = null;
        if (head == null)
        {
            head = node;
        }
        else
        {
            NodeP n = head;
            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void checkPalindrome()
    {
        NodeP n = head;
        int count=1, flag=0;
        while(n.next != null)
        {
            count++;
            n = n.next;
        }
        n = head;
        NodeP temp = head;
        for (int i=0;i<(count/2)-1;i++)
        {
            temp = temp.next;
            n = n.next;
        }
        n = n.next;
        temp.next = null;
        NodeP head1 = head;
        NodeP head2 = n;
        NodeP prevPtr, currPtr, nextPtr;
        prevPtr = null;
        currPtr = head2;
        while (currPtr!=null)
        {
            nextPtr = currPtr.next;
            currPtr.next = prevPtr;
            prevPtr = currPtr;
            currPtr = nextPtr;
        }
        head2 = prevPtr;
        while (head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {
                head1 = head1.next;
                head2 = head2.next;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }
    public void show()
    {
        NodeP node = head;
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
public class CheckLinkedListIsPalindrome
{
    public static void main(String[] args)
    {
        LinkedListPalindrome llist = new LinkedListPalindrome();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insert(3);
        llist.insert(2);
        llist.insert(1);
        llist.show();
        llist.checkPalindrome();
    }
}
