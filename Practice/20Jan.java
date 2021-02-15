import java.util.Scanner;
public class 20Jan
{
    public static Scanner scn = new Scanner(System.in);
    
//Display Elements Of Array    
    public static void display(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx + 1);
    }

//Display Reverse Of Array
    public static void displayReverse(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return;
        }
        display(arr, idx + 1);
        System.out.println(arr[idx]);
    }

//Display Maximum Element Of Array
    public static int maxOfArray(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return (int)-1e8;
        }
        return Math.max(arr[idx], maxOfArray(arr, idx + 1));
    }

//Display Minimum Element Of Array
    public static int minOfArray(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return (int)1e8;
        }
        return Math.min(arr[idx], minOfArray(arr, idx + 1));
    }

//Main Function
    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        // display(arr, 0);
        // displayReverse(arr, 0);
        // System.out.println(maxOfArray(arr, 0));
        // System.out.println(minOfArray(arr, 0));
    }
}