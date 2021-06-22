public class BST
{
    public static class Node
    {
        int data = 0;
        Node left = null;
        Node right = null;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node constructTree(int[] arr, int si, int ei)
    {
        if(si > ei)
        {
            return null;
        }

        int mid = (si + ei) / 2;
        Node node = new Node(arr[mid]);

        Node left = constructTree(arr, si, mid - 1);
        Node right = constructTree(arr, mid + 1, ei);

        return node;
    }

    public static int size(Node node)
    {
        if(node ==null)
        {
            return 0;
        }

        int left = size(node.left);
        int right = size(node.right);

        return left + right + 1;
    }

    public static int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left + right) + 1;
    }

    public static int maximum(Node node)
    {
        Node curr = node;
        while(curr.right != null)
        {
            curr = curr.right;
        }

        return curr.data;
    }

    public static int maximumRecursive(Node node)
    {
        if(node == null)
        {
            return node.data;
        }

        maximumRecursive(node.right);
    }

    public static int minimum(Node node)
    {
        Node curr = node;
        while(curr.left != null)
        {
            curr = curr.left;
        }

        return curr.data;
    }

    public static int minimumRecursive(Node node)
    {
        if(node == null)
        {
            return node.data;
        }

        minimumRecursive(node.left);
    }

    public static boolean findData(Node node)
    {
        Node curr = node;

        while(curr != null)
        {
            if(curr.data == data)
            {
                return true;
            }
            else if(curr.data < data)
            {
                curr = curr.right;
            }
            else
            {
                curr = curr.left;
            }
        }

        return false;
    }

    public static Node addDataItr(Node node, int data)
    {
        if(node == null)
        {
            return new Node(data);
        }
        Node curr = node;
        Node dnode = new Node(data);

        while(true)
        {
            if(curr.data > data)
            {
                if(curr.left != null)
                {
                    curr = curr.left;
                }
                else
                {
                    curr.left = dnode;
                    break;
                }
            }
            else
            {
                if(curr.right != null)
                {
                    curr  = curr.right;
                }
                else
                {
                    curr.right = dnode;
                    break;
                }
            }
        }

        return node;
    }

    public static Node addData(Node node, int data)
    {
        if(node == null)
        {
            return new Node(data);
        }

        if(curr.data > data)
        {
            node.left = addData(node.left, data);
        }
        else
        {
            node.right = addData(node.right, data);
        }

        return node;
    }



}