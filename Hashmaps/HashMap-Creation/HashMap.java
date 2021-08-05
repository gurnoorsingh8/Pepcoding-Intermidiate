import java.util.LinkedList;

public class HashMap
{
    private class Node
    {
        int key = 0;
        int value = 0;

        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] buckets;
    private noOfElements = 0;
    private maxSizeOfBucket = 0;

    private initialize(int size)
    {
        buckets = new LinkedList[size];
        for(int i = 0; i < size; i++)
        {
            buckets[i] = new LinkedList<>();
        }

        this.maxSizeOfBucket = size;
    }

    public HashMap()
    {
        initialize(10);
    }

    public Integer size()
    {
        return this.noOfElements;
    }

    public boolean isEmpty()
    {
        return this.noOfElements == 0;
    }

    public void put(Integer key, Integer value)
    {

    }

    public void get(Integer key)
    {

    }

    public Integer remove(Integer key)
    {

    }

    public boolean containsKey(Integer key)
    {
        LinkedList<Node> group = group(key);
        int size = group.size();
        while(size-- > 0)
        {
            if(group.getFrist().key == key)
            {
                return true;
            }
            group.addLast(group.removeFirst());
        }

        return false;
    }

    public ArrayList<Integer> keySet()
    {

    }

    public Integer getOrDefault(Integer key, Integer defaultValue)
    {

    }

    public putIfAbsent(Integer key, Integer value)
    {

    }

    private LinkedList<Node> group(int key)
    {
        int groupNo = groupNo(key);
        return this.buckets[groupNo];
    }

    private Integer groupNo(Integer key)
    {
        Integer hc = Math.abs(key.hashCode());
        return hc % maxSizeOfBucket;
    }
}