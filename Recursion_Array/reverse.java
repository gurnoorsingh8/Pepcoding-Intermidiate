import java.util.Scanner;
public class reverse
{
    public static Scanner scn = new Scanner(System.in);
    public static void reverse(int[] arr, int idx)
    {
        if(idx == -1)
        {
            return;
        }
        System.out.println(arr[idx]);
        reverse(arr, idx - 1);
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
        reverse(arr, n - 1);
    }
}