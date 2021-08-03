public class client
{
    public static void main(String[] args) throws Exception
    {
        queue que = new queue();
        for(int i = 0; i < 6; i++)
        {
            que.push(i * 100);
        }
        System.out.println(que);
    }
}