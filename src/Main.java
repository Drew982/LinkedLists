import linkedlist.LinkedList;

import java.util.Scanner;

/**
 * Created by Andrew on 12/22/2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //Pass data into scanner
        String string;
        LinkedList head = new LinkedList("Andrew");

        do
        {
            string = scanner.next(); //Pass data from terminal to program
            LinkedList node = new LinkedList(string); //Holds new string passed in
            head.add(node);
        }
        while (!string.equalsIgnoreCase("q"));
        scanner.close();
    }
}
