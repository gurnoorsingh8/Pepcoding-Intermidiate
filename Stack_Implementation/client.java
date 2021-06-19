public class client
{
    public static void main(String[] args) throws Exception
    {
        stack st = new stack(5);
        for(int i = 0; i < 5; i++)
        {
            st.push(i*10);
        }
        System.out.println(st);
    }
}