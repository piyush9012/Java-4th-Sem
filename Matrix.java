import java.util.*;
public class Matrix
{
    static void Transpose()
    {
        int arr[][] = {{1,2,3},{4,5,8},{1,8,5}};
        int arr2[][] = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                arr2[j][i] = arr[i][j];
            }
        }
        System.out.println("Initialized array: ");
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array after Transpose: ");
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void even_odd()
    {
        int j= 0, k=0;
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int even[] = new int[5];
        int odd[] = new int[5];
        for(int i=0; i<10;i++)
        {
            if (array[i]%2 == 0)
            {
                even[j++] =array[i];
            }
            else
            {
                odd[k++] = array[i];
            }
        }
        System.out.println("Matrix elements are: ");
        for(int i=0; i<10;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Even Matrix elements are: ");
        for(int i=0; i<5;i++)
        {
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("Odd Matrix elements are: ");
        for(int i=0; i<5;i++)
        {
            System.out.print(odd[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Transpose();
        even_odd();
    }
}