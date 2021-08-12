// import java.util.Scanner;
import java.util.PriorityQueue;
public class priorityQueue
{
    public static void MinPQ()
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // by default min PQ
        for(int i = 10; i >= 0; i--)
        {
            pq.add(i);
        }

        while(pq.size() != 0)
        {
            int ele = pq.remove();
            System.out.print(ele + " ");
        }
    }

    public static void MaxPQ()
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
            // return a - b; default behaviour
            return b - a; // reverse of default
        });

        for(int i = 10; i >= 0; i--)
        {
            pq.add(i);
        }

        while(pq.size() != 0)
        {
            int ele = pq.remove();
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args)
    {
        MinPQ();
        System.out.println();
        MaxPQ();
    }
}