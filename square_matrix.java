// Design a java code to accept a value for n and calculate the total number of all possible squares in a square matrix
import java.util.*;
public class square_matrix
{
    public static void main(String[] args)
    {
        int size, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        size = sc.nextInt();
        if (size<1)
        {
            System.out.println("Invalid Input");
        }    
        else
        {
            while(size!=0)
            {
                sum += size*size;
                size--;
            }
        }
        System.out.println("Total number of square matrices are "+ sum);
    }
}
