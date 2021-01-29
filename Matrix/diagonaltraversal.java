import java.util.Scanner;
public class diagonaltraversal
{
    public static Scanner scn = new Scanner(System.in);
    public static void diagonal(int[][] arr)
    {
        for(int gap = 0; gap < arr[0].length; gap++)
        {
            for(int i = 0, j = gap; i < arr.length && j < arr[0].length; i++, j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[][] arr = new int[3][4];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        diagonal(arr);
    }
}