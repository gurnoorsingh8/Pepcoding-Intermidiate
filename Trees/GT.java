import java.util.Scanner;

public class GT
{
    public static class Node
    {
        int data = 0;
        ArrayList<Node> children = new ArrayList();

        Node(data)
        {
            this.data = data;
        }
    }

    public static int size(Node node)
    {
        int sz = 0;
        for(Node child : node.children)
        {
            sz += size(child);
        }

        return sz + 1;
    }

    public static int height(Node node)
    {
        int h = 0;
        for(Node child : node.children)
        {
            h = Math.max(h, height(child));
        }

        return h + 1;
    }

    public static int maximun(Node node)
    {
        int maxEle = node.data;
        for(Node child : node.children)
        {
            maxEle = Math.max(maxEle, maximum(child));
        }

        return maxEle;
    }

    public static int minimum(Node node)
    {
        int minEle = node.data;
        for(Node child : node.children)
        {
            minEle = Math.min(minEle, minimum(child));
        }

        return minEle;
    }

    public static boolean find(Node node, int data)
    {
        boolean res = node.data == data;
        for(Node child : node.children)
        {
            res = res || find(child, data);
        }

        return res;
    }

    public static void display(Node node)
    {
        System.out.print(node.data + " -> ");
        for(Node child : node.children)
        {
            System.out.print(child.data + ", ");
        }
        System.out.println();

        for(Node child : node.children)
        {
            display(child);
        }
    }
}