import java.util.Scanner;
public class increasing
{
    public static Scanner scn = new Scanner(System.in);
    public static void increasing(int n)
    {
        if(n == 0)
        {
            return;
        }
        increasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        increasing(n);
    }
}