import java.util.Scanner;
public class Q4
{
    public static Scanner scn = new Scanner(System.in);
    public static void diffOfTwo(String str)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++)
        {
            int diff = str.charAt(i) - str.charAt(i-1);
            char ch = str.charAt(i);
            sb.append(diff);
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args)
    {
        String str = scn.nextLine();
        diffOfTwo(str);
    }
}