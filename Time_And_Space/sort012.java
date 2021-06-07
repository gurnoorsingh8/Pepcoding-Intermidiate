import java.util.Scanner;
public class sort012
{
    public static Scanner scn = new Scanner(System.in);
    public static void swap(int[] arr, int i, int j)
    {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort01(int[] arr)
    {
        int n = arr.length;
        int pt1 = 0;
        int pt2 = n - 1;
        int itr = 0;
        while(itr <= pt2)
        {
            if(arr[itr] == 0)
            {
                swap(arr, pt1++, itr++);
            }
            else if(arr[itr] == 2)
            {
                swap(arr, pt2--, itr);
            }
            else
            {
                itr++;
            }
        }
    }

    public static void main(String[] args)
    {
        int n =  scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }

        sort01(arr);
    
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}