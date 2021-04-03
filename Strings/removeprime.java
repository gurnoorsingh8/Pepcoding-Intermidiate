import java.util.Scanner;
import java.util.ArrayList;
public class removeprime
{
    public static Scanner scn = new Scanner(System.in);
    public static boolean isPrime(int n)
    {
        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void removeprime(ArrayList<Integer> al)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : al)
        {
            if(!isPrime(ele))
            {
                ans.add(ele);
            }
        }
        al.clear();
        for(int ele : ans)
        {
            al.add(ele);
        }
        // System.out.println(al);
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            al.add(scn.nextInt());
        }
        removeprime(al);
        System.out.println(al);
    }
}