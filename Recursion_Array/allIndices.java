import java.util.Scanner;
public class allIndices
{
    public static Scanner scn = new Scanner(System.in);
    public static void solution(int[] arr, int idx, int num)
    {
        if(idx == arr.length)
        {
            return;
        }
        if(arr[idx] == num)
        {
            System.out.print(idx + " ");
        }
        solution(arr, idx + 1, num);
    }

    public static void main(String[] args)
    {
        int n = scn. nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int num = scn.nextInt();
        solution(arr, 0, num);

    }
}


