import java.util.Scanner;
public  class rotate
{
    public static Scanner scn = new Scanner(System.in);
    public static void rotate(int[][] arr)
    {
        //Transpose
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int c1 = 0;
        int c2 = n - 1;
        while(c1 < c2)
        {
            for(int r = 0; r < n; r++)
            {
                int e1 = arr[r][c1];
                int e2 = arr[r][c2];

                arr[r][c1] = e2;
                arr[r][c2] = e1;
            }
            c1++;
            c2--;
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
        rotate(arr);
    }
}