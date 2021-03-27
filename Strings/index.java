import java.util.Scanner;
import java.util.ArrayList;
public class index
{
    public static Scanner scn = new Scanner(System.in);
    public static void indexCount(String str, char data)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == data)
            {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }

    public static void main(String[] args)
    {
        String str = scn.nextLine();
        // String data = scn.nextLine().charAt(0);
        indexCount(str, 'a');
    }
}