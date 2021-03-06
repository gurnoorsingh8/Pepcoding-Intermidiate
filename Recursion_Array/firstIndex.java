import java.util.Scanner;
public class firstIndex
{
    public static Scanner scn = new Scanner(System.in);
    public static int first(int[] arr, int idx, int data)
    {
        if(idx == arr.size())
        {
            return -1;
        }
        if(arr[idx] == data)
        {
            return idx;
        }
        return first(arr, idx + 1, data);
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
        System.out.println(first(arr, 0, data));
    }
}