public class queue
{
    protected int[] arr = null;
    protected int capacity = 0;
    protected int elementCount = 0;
    protected int front = 0;
    protected int back = 0;

    // Constructor

    public void initializeVariables(int capacity)
    {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        this.elementCount = 0; 
        this.front = 0;
        this.back = 0;
    }

    public queue()
    {
        initializeVariables(10);
    }

    public queue(int size)
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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = front; i < this.elementCount; i++)
        {
            int idx = i % this.capacity;
            sb.append(this.arr[idx]);
            if(i != this.elementCount -1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //Exceptions

    public void overflowException() throws Exception
    {
        if(this.capacity == this.elementCount)
        {
            throw new Exception("QueueIsFull");
        }
    }

    public void underFlowExeption() throws Exception
    {
        if(this.elementCount == 0)
        {
            throw new Exception("QueueIsEmpty");
        }
    }

    //Stack Functions

    // Push
    protected void push_(int data)
    {
        this.arr[this.back] = data;
        this.elementCount++;
        this.back = (this.back + 1) % this.capacity;
    }

    public void push(int data) throws Exception
    {
        overflowException();
        push_(data);
    }

    public int front() throws Exception
    {
        underFlowExeption();
        return this.arr[this.front];
    }

    protected int pop_()
    {
        int rv = this.arr[this.front];
        this.arr[this.front] = 0;

        this.elementCount--;
        this.front = (this.front + 1) % this.capacity;
        return rv;
    }

    public int pop() throws Exception
    {
        underFlowExeption();
        return pop_();
    }
}