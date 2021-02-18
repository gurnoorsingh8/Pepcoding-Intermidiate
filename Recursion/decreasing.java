import java.util.Scanner;
public class decreasing
{
    public static Scanner scn = new Scanner(System.in);
    public static void decreasing(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        decreasing(n - 1);
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        decreasing(n);
    }
}