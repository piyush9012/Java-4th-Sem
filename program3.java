// Design a java code to accept 5 strings from the user and print them in lexico graphical order

import java.util.*;
public class program3
{
    public static void main(String[] args)
    {
        System.out.println("Input the names ");
        String[] array = new String[5];             // Declaration of string array      
        Scanner sc = new Scanner(System.in);  
        for(int i=0; i<5; i++)
        {
            array[i] = sc.nextLine();
        }
        Arrays.sort(array);
        System.out.print("Sorted list is: ");
        for(int i=0; i<5; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
