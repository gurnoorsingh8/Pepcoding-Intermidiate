import java.util.Scanner;
public class search
{
    public static Scanner scn = new Scanner(System.in);
    public static void search(int[][] arr, int data)
    {
        int i = arr.length -1;
        int j = 0;
        while(i >= 0 && j < arr[0].length)
        {
            if(arr[i][j] == data)
            {
                System.out.println(i + "\n" + j);
                return;
            }
            else if(arr[i][j] < data)
            {
                i--;
            }
            else
            {
                j++;
            }
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        int data = scn.nextInt();
        search(arr, data);
    }
}