public class treeRevision
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

    public static void preOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }

        ans.add(root.data);
        preOrderTraversal(root.left, ans);
        preOrderTraversal(root.right, ans);
    }

    public static void inOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }

        inOrderTraversal(root.left, ans);
        ans.add(root.data);
        inOrderTraversal(root.right, ans);
    }

    public static void postOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }

        postOrderTraversal(root.left, ans);
        postOrderTraversal(root.right, ans);
        ans.add(root.data);
    }

    public static int size(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = size(root.left);
        int right = size(root.right);

        return left + right;
    }

    public static int height(Node root)
    {
        if(root == null)
        {
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left + right) + 1;
    }

    public static int heightInTermsOfNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = heightInTermsOfNode(root.left);
        int right = heightInTermsOfNode(root.right);

        return Math.max(left + right) + 1;
    }

    public static int maximun(Node root)
    {
        if(root == null)
        {
            return -(int)1e8;
        }

        int left = maximum(root.left);
        int right = maximum(root.left);

        return Math.max(Math.max(left, right), root.data);
    }

    public static int maximun(Node root)
    {
        if(root == null)
        {
            return (int)1e8;
        }

        int left = minimum(root.left);
        int right = minimum(root.left);

        return Math.min(Math.min(left, right), root.data);
    }

    public static int sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = sum(root.left);
        int right = sum(root.right);

        return left + right + root.data;
    }

    public static boolean findData(Node root, int data)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == data)
        {
            return true;
        }

        boolean left = findData(root.left, data);
        if(left)
        {
            return true;
        }
        
        boolean right = findData(root.right, data);
        if(right)
        {
            return true;
        }

        return false;
        
    }

    public static void printAtDepthK(Node root, int k, ArrayList<Integer> ans)
    {
        if(root == null || k < 0)
        {
            return;
        }

        if(k == 0)
        {
            ans.add(root.data);
            return;
        }

        printAtDepthK(root.left, k - 1, ans);
        printAtDepthK(root.right, k - 1, ans);

    }

    public static void printSingleChildParent(Node root, Node parent)
    {
        if(root == null)
        {
            return;
        }

        if(parent != null && (root.left == null || root.right == null))
        {
            System.out.print(root.data);
        }

        printSingleChildParent(root.left, root);
        printSingleChildParent(root.right, root);
    }

    public static Node removeLeaves(Node root)
    {
        if(root == null)
        {
            return null;
        }

        if(root.left == null && root.right == null)
        {
            return null;
        }

        removeLeaves(root.left);
        removeLeaves(root.right);

        return root;
    }

    //isBST

    //LCA = Least Common Ancestor

    //Leetcode 863       distanceK

    public static void preOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }

        ans.add(root.data);
        preOrderTraversal(root.left, ans);
        preOrderTraversal(root.right, ans); 
    }

    public static void inOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }

        inOrderTraversal(root.left, ans);
        ans.add(root.data);
        inOrderTraversal(root.right, ans);
    }

    public static void postOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }

        postOrderTraversal(root.left, ans);
        postOrderTraversal(root.right, ans);
        ans.add(root.data);
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
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static int heightInTermsOfNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = heightInTermsOfNode(root.left);
        int right = heightInTermsOfNode(root.right);

        return Math.max(left, right) + 1;
    }

    public static int sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = sum(root.left);
        int right = sum(root.right);

        return left + right + root.data;
    }

    public static int maximun(Node root)
    {
        if(root == null)
        {
            return -(int)1e8;
        }

        int left = maximum(root.left);
        int right = maximum(root.right);

        return Math.max(Math.max(left, right), root.data);
    }

    public static int minimum(Node root)
    {
        if(root == null)
        {
            return (int)1e8;
        }

        int left = minimum(root.left);
        int right = minimum(root.right);

        return Math.min(Math.min(left, right), root.data);
    }

    public static boolean findData(Node root, int data)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == data)
        {
            return true;
        }

        int left = findData(root.left, data);
        if(left)
        {
            return true;
        }

        int right = findData(root.right, data);
        if(right)
        {
            return true;
        }

        return false;
    }

    public static void printAtDepthK(Node root, ArrayList<Integer> ans, int k,)
    {
        if(root == null || k < 0)
        {
            return;
        }

        if(k == 0)
        {
            ans.add(root.data);
            return;
        }

        printAtDepthK(root.left, ans, k-1);
        printAtDepthK(root.right, ans, k - 1);
    }

    public static void printSingleChildParent(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }
        
        // parent = root;

        if(root.left == null || root.right == null)
        {
            ans.add(root.data);
        }

        printSingleChildParent(root.left, ans);
        printSingleChildParent(root.right, ans);
    }

    public static Node removeLeaves(Node root)
    {
        if(root == null)
        {
            return null;
        }

        if(root.left == null && root.right == null)
        {
            return null;
        }

        removeLeaves(root.left);
        removeLeaves(root.right);

        return root;
    }






































}