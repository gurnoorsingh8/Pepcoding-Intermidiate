import java.util.Scanner;
public class L001
{
    public static Scanner scn = new Scanner(System.in);
    public static test1()
    {
        String str = "Hello World";
        String str1 = str;  // complexity O(1)   Interpool Memory
                            // but in cpp same code has a complexity of O(n)
        str += 'g'; // complexity O(n), because new copied in new string 

        char ch = str.charAt(3);
    }

    public static void test2()  // fing complexity
    {
        String str = "";
        for(int i = 0; i < (int)1e6; i++)
        {
            str += i;
        }

        System.out.println(str);
    }
    // O(n^2)

    public static void test3()
    {
        StringBuilder sb = new StringBuilder();
        sb.append('d');  // complexity O(1)
        
        StringBuilder sb1 = sb; // O(1), but changes cannot be made
        //if want changes then
        StringBuilder sb2 = new StringBuilder(sb); //O(n)

        char ch = sb.charAt(3);
        // to print
        System.out.println(sb.toString());
    }

    public static void main(String[] args)
    {
        test1();
    }
}