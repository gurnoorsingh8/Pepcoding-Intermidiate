import java.util.Scanner;
public class mergeSortedArray
{
    public static Scanner scn = new Scanner(System.in);
    public static int[] solution(int[] A, int[] B)
    {
        int n = A.length;
        int m = B.length;
        if(n == 0 || m == 0)
        {
            return n == 0 ? B : A;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[n + m];

        while(i < n && j < m)
        {
            if(A[i] < B[j])
            {
                ans[k++] = A[i++];
            }
            else
            {
                ans[k++] = B[j++];
            }
        }
        while(i < n)
        {
            ans[k++] = A[i++];
        }
        while(j < m)
        {
            ans[k++] = B[j++];
        }

        return ans;
    }

    public static int[] mergeSort(int[] &arr, int si, int ei)
    {
        if(si == ei)
        {
            int[] base = new int[];
            base += arr[si];
            return base;
        }
    
        int mid = (si + ei) / 2;
    
        int[] A = mergeSort(arr, si, mid);
        int[] B = mergeSort(arr, mid + 1, ei);
    
        return mergeTwoSortedArrays(A, B);
    }

    public static int[] mergeSort(int[] &arr)
    {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] A = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            A[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] B = new int[m];
        
        for(int i = 0; i < m; i++)
        {
            B[i] = scn.nextInt();
        }
        
        int[] merge = solution(A, B);
        
        for(int i = 0; i < n + m; i++)
        {
            System.out.print(merge[i] + " ");
        }
    }
}
import java.util.Scanner;
public class mergeSortedArray
{
    public static Scanner scn = new Scanner(System.in);
    public static int[] solution(int[] A, int[] B)
    {
        int n = A.length;
        int m = B.length;
        if(n == 0 || m == 0)
        {
            return n == 0 ? B : A;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[n + m];

        while(i < n && j < m)
        {
            if(A[i] < B[j])
            {
                ans[k++] = A[i++];
            }
            else
            {
                ans[k++] = B[j++];
            }
        }
        while(i < n)
        {
            ans[k++] = A[i++];
        }
        while(j < m)
        {
            ans[k++] = B[j++];
        }

        return ans;
    }

    public static int[] mergeSort(int[] arr, int si, int ei)
    {
        if(si == ei)
        {
            ArrayList<>() base;
            base.add(arr[si]);
            return base;
        }
    
        int mid = (si + ei) / 2;
    
        int[] A = mergeSort(arr, si, mid);
        int[] B = mergeSort(arr, mid + 1, ei);
    
        return mergeTwoSortedArrays(A, B);
    }

    public static int[] mergeSort(int[] arr)
    {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] A = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            A[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] B = new int[m];
        
        for(int i = 0; i < m; i++)
        {
            B[i] = scn.nextInt();
        }
        
        int[] merge = solution(A, B);
        
        for(int i = 0; i < n + m; i++)
        {
            System.out.print(merge[i] + " ");
        }
    }
}