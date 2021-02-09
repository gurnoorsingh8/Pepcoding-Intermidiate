import java.util.Scanner;
public class saddle
{
    public static Scanner scn = new Scanner(System.in);
    public static void saddle(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;

        for(int r = 0; r < n; r++)
        {
            int c = 0;
            int minn = (int)1e8;

            for(int j = 0; j < m; j++)
            {
                if(arr[r][j] < minn)
                {
                    minn = arr[r][j];
                    c = j;
                }
            }
            boolean saddlepoint = true;
            for(int i = 0; i < m; i++)
            {
                if(arr[i][c] > minn)
                {
                    saddlepoint = false;
                    break;
                }
            }

            if(saddlepoint)
            {
                System.out.println(minn);
                return;
            }
        }
        System.out.println("Invalid input");
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        saddle(arr);
    }
}