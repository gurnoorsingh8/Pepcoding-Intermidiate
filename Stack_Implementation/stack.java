public class stack
{
    protected int[] arr = null;
    protected int capacity = 0;          // array.length()
    protected int elementCount = 0;     // size of our stack
    protected int tos = -1;

    //constructor

    public void initializeVariables(int capacity)
    {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        this.elementCount = 0;
        this.tos = -1;
    }

    public stack()
    {
        initializeVariables(10);
    }

    public stack(int size)
    {
        initializeVariables(size);
    }

    //Basic Functions

    public int size()
    {
        return this.elementCount;
    }

    public boolean isEmpty()
    {
        return this.elementCount == 0;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.elementCount; i++)
        {
            sb.append(this.arr[i]);
            if(i != this.elementCount -1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //Exeptions

    public void overflowException() throws Exception
    {
        if(this.capacity == this.elementCount)
        {
            throw new Exception("StackIsFull");
        }
    }

    public void underFlowExeption() throws Exception
    {
        if(this.elementCount == 0)
        {
            throw new Exception("StackIsEmpty");
        }
    }

    //Stack Functions
    
    //Push
    protected void push_(int data)
    {
        this.arr[++this.tos] = data;
        this.elementCount++;
    }

    public void push(int data) throws Exception
    {
        overflowException();
        push_(data);
    }

    public int top() throws Exception
    {
        underFlowExeption();
        return this.arr[this.tos];
    }

    protected int pop_()
    {
        int rv = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.elementCount--;
        return rv;
    }

    public int pop() throws Exception
    {
        underFlowExeption();
        return pop_();
    }
}