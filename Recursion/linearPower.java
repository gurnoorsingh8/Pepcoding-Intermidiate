import java.util.Scanner;
public class linearPower
{
    public static Scanner scn = new Scanner(System.in);
    public static int linearPower(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int ans = linearPower(x, n -1);
        return ans  * x;
    }

    public static void main(String[] args)
    {
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(linearPower(x, n));
    }
}