import java.util.Scanner;
public class spiral
{
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void spiral(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        int count = n * m;
        int rmin = 0;
        int rmax = n-1;
        int cmin = 0;
        int cmax = m - 1;
        while(count != 0)
        {
            for(int i = rmin; i <= rmax && count > 0; i++)
            {
                System.out.println(arr[i][cmin]);
                count--;
            }
            cmin++;
            for(int i = cmin; i <= cmax && count > 0; i++)
            {
                System.out.println(arr[rmax][i]);
                count--;
            }
            rmax--;
            for(int i = rmax; i >= rmin && count > 0; i--)
            {
                System.out.println(arr[i][cmax]);
                count--;
            }
            cmax--;
            for(int i = cmax; i >= cmin && count > 0; i--)
            {
                System.out.println(arr[rmin][i]);
                count--;
            }
            rmin++;
        }
    }
    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        spiral(arr);
    }
}