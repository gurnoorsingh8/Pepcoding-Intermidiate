import java.util.Scanner;
public class L001
{
    public static Scanner scn = new Scanner(System.in);
    public static void test1()
    {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[3][4]];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        test1();
    }
}

