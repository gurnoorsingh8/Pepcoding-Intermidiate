import java.util.Scanner;
public class lastIndex
{
    public static Scanner scn = new Scanner(System.in);
    public static int last(int[] arr, int idx, int data)
    {
        if(idx == -1)
        {
            return -1;
        }
        if(arr[idx] == data)
        {
            return idx;
        }
        return last(arr, idx - 1, data);
    }

    public static void input(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int data = scn.nextInt();
        System.out.println(last(arr, n - 1, data));
    }
}