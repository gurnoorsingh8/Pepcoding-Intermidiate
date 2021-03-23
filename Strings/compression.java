import java.util.Scanner;
public class compression
{
    public static Scanner scn = new Scanner(System.in);
    public static void compression(String str)
    {
        char prevch = str.charAt(0);
        int i = 1;
        StringBuilder sb = new StringBuilder();
        while(i <= str.length())
        {
            int count = 1;
            while(i < str.length() && prevch == str.charAt(i))
            {
                count++;
                prevch = str.charAt(i);
                i++;
            }

            sb.append(prevch);
            sb.append(count);
            if(i == str.length())
            {
                break;
            }
            prevch = str.charAt(i);
            i++;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args)
    {
        String str = scn.nextLine();
        compression(str);
    }

}