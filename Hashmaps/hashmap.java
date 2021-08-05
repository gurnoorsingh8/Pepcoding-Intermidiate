import java.util.HashMap;

public class hashmap
{
    public static void basic_01()
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nepal", 233);
        map.put("UK", 45);
        map.put("Germany", 35);
        map.put("USA", 20);
        map.put("Russia", 18);
        map.put("India", 10);
        map.put("USA", 19);    // it will update ( not repeat )

        for(String keys : map.keySet())
        {
            System.out.println(keys + " -> " + map.get(keys));
        }

        String key = "USa";
        if(map.containsKey(key))
        {
            System.out.println(key);
        }
        else
        {
            System.out.println("Not Found");
        }
    }

    public static void printFrequency(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i < str.length; i++)
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

        for(int i = 0; i < str.length; i++)
        {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
    }

    public static void highestFrequency(String str)
    {

    }

    public static void positionOfAllChar(String str)
    {
        
    }

    public static void main(String[] args)
    {
        basic_01();
    }
}