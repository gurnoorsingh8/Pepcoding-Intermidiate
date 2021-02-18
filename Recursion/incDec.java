import java.util.Scanner;
public class incDec
{
    public static Scanner scn = new Scanner(System.in);
    public static void incDec(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        incDec(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        incDec(n);
    }
}