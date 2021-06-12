public class tree
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

    public static void traversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        //preOrderTraversal(root, ans);
        //inOrderTraversal(root, ans);
        //postOrderTraversal(root, ans);
    }

    public static int size(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        // return size(root.left) + size(root.right) + 1;
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

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static int maximum(Node root)
    {
        if(root == null)
        {
            return -(int)1e8;
        }

        int left = maximum(node.left);
        int right = maximum(node.right);

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
        // boolean res = root.data == data;
        // return res || findData(root.left, data) || findData(root.right, data);
    }

    public static boolean rootToNodePath(Node root, int data, ArrayList<Node> ans)
    {
        if(root == null)
        {
            return false;
        }
        boolean res = root.data == data || rootToNodePath(root.left, data, ans) || rootToNodePath(root.right, data, ans);

        if(res)
        {
            ans.add(root);
        } 
        return res;
    }

    //print at K depth
    public static void printAtDepthK(Node root, int k, Node block, ArrayList<Integer> ans)
    {
        if(root == null || root == block || k < 0)
        {
            return;
        }

        if(k == 0)
        {
            ans.add(root.data);
            return;
        }

        printAtDepthK(root.left, k - 1, block, ans);
        printAtDepthK(root.right, k - 1, block, ans);
    }

    //Leetcode 863
    public static ArrayList<Integer> distanceK(Node root, Node target, int k)
    {
        ArrayList<Node> path = new ArrayList<>();
        rootToNodePath(root, target.data, path);

        Node block = null;

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < path.size(); i++)
        {
            printAtDepthK(path.get(i), k - 1, block, ans);
            block = path.get(i);
        }
    }

    public static void printSingleChildParent(Node root, Node parent)
    {
        if(root == null)
        {
            return;
        }
        if(parent != null && (parent.left == null || parent.right == null))
        {
            System.out.println(root.data);
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

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    //BST
    public static Node prev = null;
    public static boolean isBST(Node root)
    {
        if(root == null)
        {
            return true;
        }

        boolean left = isBST(root.left);
        if(!left)
        {
            return false;
        }

        if(prev != null && prev.data > node.data)
        {
            return false;
        }
        prev = node;
        
        boolean right = isBST(root right);
        if(!right)
        {
            return false;
        }

        return true;
    }

    //LCA = Least Common Ancestor
    public static Node LCA(Node node, int p, int q)
    {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        rootToNodePath(node, p, list1);
        rootToNodePath(node, p, list2);

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        Node lca = null;
        while(i >= 0 && j >= 0)
        {
            if(list1.get(i) != list2.get(j))
            {
                break;
            }

            lca = list1.get(i);
            i--;
            j--;
        }
        
        return lca;
    }
}