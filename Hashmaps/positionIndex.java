import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class positionIndex
{
    public static Scanner scn = new Scanner(System.in);

    public static void positionOfAllChar(String str)
    {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        
        // for(int i = 0; i < str.length(); i++)
        // {
        //     char ch = str.charAt(i);
        //     if(!map.containsKey(ch))
        //     {
        //         map.put(ch, new ArrayList<>());
        //     }
        //     else
        //     {
        //         map.get(ch).add(i);
        //     }
        // }

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }

        for(Character c : map.keySet())
        {
            System.out.println(c + " -> " + map.get(c));
        }
    }

    public static void main(String[] args)
    {
        positionOfAllChar("abcabcabcdefdefabcdefdefabc");
    }
}