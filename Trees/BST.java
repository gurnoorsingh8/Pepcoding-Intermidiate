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
        if(si >ei)
        {
            return null;
        }

        int mid = (si + ei) / 2;
        Node node = new Node(arr[mid]);

        Node left = constructTree(arr, si, mid - 1);
        Node right = constructTree(arr, mid + 1, ei);

        return node;
    }

    public static Node constructTree(int[] arr)
    {
        return constructTree(arr, 0 , arr.length - 1);
    }

    public static int size(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = size(root.left);
        int right = size(root.right);

        return left + right + 1;
    }

    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        Node left = height(root.left);
        Node right = height(root.right);

        return Math.max(left, right) + 1;
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
        if(node.right == null)
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
        if(node.left == null)
        {
            return node.data;
        }

        minimumRecursive(node.left);
    }

    public static boolean findData(Node node, int data)
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
            // Node base = new Node(data);
            // return base;
            return new Node(data);
        }
        Node curr = node;
        Node dNode = new Node(data);
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
                    curr.left = dNode;
                    break;
                }
            }
            else
            {
                if(curr.right != null)
                {
                    curr = curr.right;
                }
                else
                {
                    curr.right = dNode;
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
            // Node base = new Node(data);
            // return base;
        }

        if(node.data > data)
        {
            node.left = addData(node.left, data);
        }
        else
        {
            node.right = addData(node.right, data);
        }

        return node;
    }

    //LCA = Least Common Ancestor
    public static Node LCA(Node node, int p, int q)
    {
        Node curr = node;
        while(curr != null)
        {
            if(curr.data < p && curr.data < q)
            {
                curr = curr.left;
            }
            else if(curr.data > p && curr.data > q)
            {
                curr = curr.right;
            }
            else
            {
                if(findData(curr, p) && findData(curr, q))
                {
                    return curr;
                }
                else
                {
                    return null;
                }
            }
        }
        return null;
    }

    // public static remove
    // {

    // }

    public static 
}