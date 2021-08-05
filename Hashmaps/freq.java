import java.util.HashMap;
import java.util.Scanner;

public class freq
{
    public static Scanner scn = new Scanner(System.in);

    public static void printFrequency(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i < str.length(); i++)
        // {
        //     char ch = str.charAt(i);
        //     if(map.containsKey(ch))
        //     {
        //         map.put(ch, map.get(ch) + 1);
        //     }
        //     else
        //     {
        //         map.put(ch, 1);
        //     }
        // }

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character keys : map.keySet())
        {
            System.out.println(keys + " -> " + map.get(keys));
        }
    }

    public static void main(String[] args)
    {
        printFrequency("abcabcabcabcedddfeabeffabfeddddd");
    }
}