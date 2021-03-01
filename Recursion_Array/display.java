import java.util.Scanner;
public class display
{
    public static Scanner scn = new Scanner(System.in);
    public static void display(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx + 1);
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
        display(arr, 0);
    }
}