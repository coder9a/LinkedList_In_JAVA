/**
 * Given a Matrix mat of N*N size, the task is to complete the function constructLinkedMatrix(),
 * that constructs a 2D linked list representation of the given matrix.
 *
 * Input : 2D matrix
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Output :
 * 1 -> 2 -> 3 -> NULL
 * |    |    |
 * v    v    v
 * 4 -> 5 -> 6 -> NULL
 * |    |    |
 * v    v    v
 * 7 -> 8 -> 9 -> NULL
 * |    |    |
 * v    v    v
 * NULL NULL NULL
 */
class NodeM
{
    int data;
    NodeM right;
    NodeM down;
}
class MyLinkedListM
{
    public NodeM constructMatrix(int arr[][], int i, int j, int m, int n)
    {
        if(i>n-1||j>m-1)
            return null;
        NodeM temp = new NodeM();
        temp.data = arr[i][j];
        temp.right = constructMatrix(arr, i, j+1, m, n);
        temp.down = constructMatrix(arr, i+1, j, m, n);
        return temp;
    }
    public NodeM construct(int arr[][], int i, int n)
    {
        NodeM node = constructMatrix(arr, i, i, n, n);
        return node;
    }
    public void display(NodeM head)
    {
        NodeM rightPtr;
        NodeM downPtr = head;
        while (downPtr!=null)
        {
            rightPtr = downPtr;
            while (rightPtr!=null)
            {
                System.out.print(rightPtr.data+" ");
                rightPtr = rightPtr.right;
            }
            System.out.println();
            downPtr = downPtr.down;
        }
    }
}

public class LinkedListMatrix
{
    public static void main(String[] args)
    {
        MyLinkedListM node = new MyLinkedListM();
        int n=3;
        int arr[][] = {{1,2,3},
                        {4,5,6},
                         {7,8,9}};
        NodeM head = node.construct(arr,0,n);
        node.display(head);
    }
}
