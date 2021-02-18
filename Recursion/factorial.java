import java.util.Scanner;
public class factorial
{
    public static Scanner scn = new Scanner(System.in);
    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int ans = fact(n - 1);
        return ans * n;
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        System.out.print(fact(n));
    }
}