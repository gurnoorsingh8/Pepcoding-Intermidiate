public class stackpractice
{
    protected int[] arr = null;
    protected int capacity = 0;         //size of array
    protected int elementCount = 0;     // size of stack
    protected int tos = -1;

    //constructor

    public void initializeVariables(int capacity)
    {
        this.capacity = capacity;
        this.arr = new int(capacity);
        this.elementCount = 0;
        this.tos = -1;
    }

    public stackpractice()
    {
        initializeVariables(10);
    }

    public stackpractice(int size)
    {
        initializeVariables(size);
    }

    //basic functions

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

            if(i != this.elementCount - 1)
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
            throw new Exception("StackIsFull");
        }
    }

    public void underFlowExeption() throws Exception
    {
        if(this.capacity == 0)
        {
            throw new Exception("StackIsEmpty");
        }
    }

    // Stack functions

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
        return arr[this.tos];
    }

    public int pop_()
    {
        int rv = this.arr[tos];
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


public class dynamicStackPractice extends stackpractice
{
    public dynamicStackPractice()
    {
        super();
    }

    public dynamicStackPractice(int size)
    {
        super(size);
    }

    public dynamicStackPractice(int[] arr)
    {
        super.initializeVariables(2 * arr.length);
        for(int ele : arr)
        {
            super.push_(ele);
        }
    }

    @Override
    public void push(int data) throws Exception
    {
        if(super.capacity == super.elementCount)
        {
            int[] temp = super.arr;
            super.initializeVariables(2 * super.capacity);

            for(int ele : temp)
            {
                super.push_(ele);
            }
        }

        super.push(data);
    }
}