import java.util.Scanner;
public class exitpoint
{
    public static Scanner scn = new Scanner(System.in);
    public static void exitpoint(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        int i = 0;
        int j = 0;
        int d = 0;
        while(true)
        {
            d = (d + arr[i][j]) % 4;
            if(d == 0)
            {
                j++;
                if(j == col)
                {
                    System.out.println(i);
                    System.out.println(j-1);
                    break;
                }
            }
            else if(d == 1)
            {
                i++;
                if(i == row)
                {
                    System.out.println(i-1);
                    System.out.println(j);
                    break;
                }
            }
            else if(d == 2)
            {
                j--;
                if(j == -1)
                {
                    System.out.println(i);
                    System.out.println(j+1);
                    break;
                }
            }
            else if(d == 3)
            {
                j--;
                if(i == -1)
                {
                    System.out.println(i+1);
                    System.out.println(j);
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        exitpoint(arr);
    }
}