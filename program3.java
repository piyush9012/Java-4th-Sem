// Design a java code to accept 5 strings from the user and print them in lexico graphical order

import java.util.*;
public class program3
{
    public static void main(String[] args)
    {
        System.out.println("Input the names ");
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];             // Declaration of stringarray        
        Scanner s1 = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            array[i] = s1.nextLine();
        }
        Arrays.sort(array);
        System.out.print("Sorted list is: ");
        for(int i=0; i<5; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}