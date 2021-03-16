import java.util.Scanner;
public class max
{
    public static Scanner scn = new Scanner(System.in);
    public static int maxElement(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return -(int)1e8;
        }
        int ans = maxElement(arr, idx + 1);
        return Math.max(arr[idx], ans);
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
        System.out.println(maxElement(arr, 0));
    }
}