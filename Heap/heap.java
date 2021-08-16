import java.util.ArrayList;
public class heap
{
    private ArrayList<Integers> arr;
    private int size = 0;
    private boolean isMax = true;

    private void initialize(boolean isMax)
    {
        this.arr = new ArrayList<>();
        this.size = 0;
        this.isMax = isMax;
    }

    public heap()
    {
        initialize(true);
    }

    public heap(int[] arr, boolean isMax)
    {
        initialize(isMax);
        for(int ele : arr)
        {
            this.arr.add(ele);
        }

        for(int i = this.arr.size() - 1; i >= 0; i--)
        {
            downheapify(i);
        }

        this.size = arr.length;
    }

    // General Functions

    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return this.size == 0;
    }

    public void add(int data)
    {
        this.arr.add(data);
        this.size++;
        upheapify(this.size - 1);
    }

    public int remove()
    {
        int n = this.arr.size();
        int rv = this.arr.get(0);

        swap(0, n - 1);
        this.arr.remove(n - 1);
        this.size--;

        downheapify(0);
        return rv;
    }

    public int peek()
    {
        return this.arr.get(0);
    }

    private void swap(int i, int j)
    {
        int ei = arr.get(i);
        int ej = arr.get(j);

        arr.set(i, ej);
        arr.set(j, ei);
    }

    private int compareTo(int a, int b)
    {
        if(isMax)
        {
            return this.arr.get(a) - this.arr.get(b);
        }
        else
        {
            return this.arr.get(b) - this.arr.get(a);
        }
    }

    private void upheapify(int ci)
    {
        int pi = (ci - 1) / 2;
        if(pi >= 0 && compareTo(ci, pi) > 0)
        {
            swap(pi, ci);
            upheapify(pi);
        }
    }
    
    private void downheapify(int pi)
    {
        int maxId = pi;
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;

        if(lci < this.arr.size() && compareTo(lci, maxId) > 0)
        {
            maxId = lci;
        }
        if(rci < this.arr.size() && compareTo(rci, maxId) > 0)
        {
            maxId = rci;
        }

        if(maxId != pi)
        {
            swap(maxId, pi);
            downheapify(maxId);
        }
    }
}