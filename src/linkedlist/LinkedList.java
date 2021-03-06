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
        System.out.println(name); //Prints out head of list
        if(next != null)
        {
            next.print();
        }
    }

    public void reversePrint()
    {
        if (this.next != null)
        {
            this.next.reversePrint();
        }
        System.out.println(this.name);
    }

    public int getLengthOfList()
    {
        if(next == null)
        {
            return 1;
        }
        else
        {
            return 1+next.getLengthOfList();
        }
    }
}
