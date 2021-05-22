/**
 * Given a linked list of N nodes. The task is to check if the linked list has a loop.
 * Linked list can contain self loop.
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * value[] = {1,3,4}
 * x = 2
 * Output: True
 * Explanation: In above test case N = 3.
 * The linked list with nodes N = 3 is
 * given. Then value of x=2 is given which
 * means last node is connected with xth
 * node of linked list. Therefore, there
 * exists a loop.
 * Example 2:
 *
 * Input:
 * N = 4
 * value[] = {1,8,3,4}
 * x = 0
 * Output: False
 * Explanation: For N = 4 ,x = 0 means
 * then lastNode->next = NULL, then
 * the Linked list does not contains
 * any loop.
 */

import java.util.*;
import java.lang.*;

class NodeL
{
    int data;
    NodeL next;

    NodeL(int x)
    {
        data = x;
        next = null;
    }
}

class DetectLoopInLinkedList
{
    public static void makeLoop(NodeL head, NodeL tail, int x){
        if (x == 0) return;

        NodeL curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;

        tail.next = curr;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--> 0)
        {
            int n = sc.nextInt();

            int num = sc.nextInt();
            NodeL head = new NodeL(num);
            NodeL tail = head;

            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new NodeL(num);
                tail = tail.next;
            }

            int pos = sc.nextInt();
            makeLoop(head, tail, pos);

            DetectLoop x = new DetectLoop();
            if( x.detectLoop(head) )
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
class DetectLoop
{
    public static boolean detectLoop(NodeL head){
        // Add code here
        NodeL i = head;
        NodeL j = head;
        int flag=0;
        while(j!=null&&i!=null&&j.next!=null)
        {
            i = i.next;
            j = j.next.next;
            if(i==j)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}
