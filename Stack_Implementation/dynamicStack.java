public class dynamicStack extends stack
{
    public dynamicStack()
    {
        super();
    }

    public dynamicStack(int size)
    {
        super(size);
    }

    public dynamicStack(int[] arr)
    {
        super.initializeVariables(2 * arr.length);
        for(int ele : arr)
        {
            super.push_(ele);
        }
    }

    @Override
    public void push(int data) throws Exeption
    {
        if(super.capacity == super.elementCount)
        {
            int[] temp = super.arr;  // copy old data
            super.initializeVariables(2 * super.capacity);  // new space allocate for new upcoming data.

            for(int ele : temp)  // copy old data in new space.
            {
                super.push_(ele);
            }
        }
        super.push(data);
    }
}