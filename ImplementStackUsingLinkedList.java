/**
 * Let's give it a try! You have a linked list and
 * you have to implement the functionalities push and pop of stack using this given linked list.
 * Your task is to use the class as shown in the comments
 * in the code editor and complete the functions push() and pop() to implement a stack.
 *
 * Example 1:
 *
 * Input:
 * push(2)
 * push(3)
 * pop()
 * push(4)
 * pop()
 * Output: 3 4
 * Explanation:
 * push(2)    the stack will be {2}
 * push(3)    the stack will be {2 3}
 * pop()      poped element will be 3,
 *            the stack will be {2}
 * push(4)    the stack will be {2 4}
 * pop()      poped element will be 4
 * Example 2:
 *
 * Input:
 * pop()
 * push(4)
 * push(5)
 * pop()
 * Output: -1 5
 * Your Task: You are required to complete two methods push() and pop().
 * The push() method takes one argument, an integer 'x' to be pushed into the stack and
 * pop() which returns an integer present at the top and popped out from the stack.
 * If the stack is empty then return -1 from the pop() method.
 */

import static java.lang.System.exit;

class StackNode
{
    int data;
    StackNode next;
}
class StackLinkedList
{
    StackNode head;
    public void push(int data)
    {
        StackNode node = new StackNode();
        if(node==null)
        {
            System.out.println("Stack Overflow");
            exit(1);
        }
        else
        {
            node.data = data;
            node.next = head;
            head = node;
        }
    }
    public void pop()
    {
        if(head==null)
        {
            System.out.println("Stack Undeflow");
            exit(1);
        }
        else
        {
            head = head.next;
        }
    }
    public void peek()
    {
        if(head==null)
        {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else
        {
            System.out.println(head.data);
        }
    }
    public void show()
    {
        if(head==null)
        {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else
        {
            StackNode node = head;
            while (node!=null)
            {
                System.out.print(node.data+" ");
                node = node.next;
            }
        }
    }
}
public class ImplementStackUsingLinkedList
{
    public static void main(String[] args)
    {
        StackLinkedList list = new StackLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.show();
        list.pop();
        System.out.println();
        list.show();
        System.out.println();
        list.peek();
    }
}
