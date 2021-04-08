import java.util.Scanner;
public class bubbleSort
{
    public  static Scanner scn = new Scanner(System.in);
    public static void  swap(int[]  arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void moveToLast(int[] arr, int si, int ei)
    {
        for(int i = si+1; i <= ei; i++)
        {
            if(arr[i-1] > arr[i])
            {
                swap(arr, i - 1, i);
            }
        }
    }
    public static void bubbleSort(int[] arr, int n)
    {
        int ei = n - 1;
        for(int i = 0; i < n; i++)
        {
            moveToLast(arr, 0, ei - i);
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        bubbleSort(arr, n);
        for (int val: arr)
        {
            System.out.print(val + " ");
        }   
    }
}