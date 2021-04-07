import java.uyil.Scanner;
public class toggle
{
    public static Scanner scn = new Scanner(System.in);
    public static String toogle(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                sb.append((char)(ch - 'a' + 'A'));
            }
            else
            {
                sb.append((char)(ch - 'A' + 'a'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String str = scn.nextLine();
        System.out.println(toggle(str));
    }
}