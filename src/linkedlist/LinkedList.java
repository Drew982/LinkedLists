package linkedlist;

/**
 * Created by Andrew on 12/22/2016.
 */
public class LinkedList
{
    public String name;
    public LinkedList next;

    public LinkedList(String name)
    {
        this.name = name;
        this.next = null;
    }

    public void add(LinkedList node)
    {
        if(next == null)
        {
            this.next = node; //Added node to end of linked list
        }
        else
        {
            next.add(node);
        }
    }

    public void print()
    {
        System.out.println(name);
    }
}
