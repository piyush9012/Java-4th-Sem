// Design a java code for inplementing binary search, pass array as a parameter to the method

import java.util.*;
public class Binarysearch
{
    int binarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low)
        {
            int mid = low+(high-low)/2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);
            else
                return binarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        Binarysearch ob = new Binarysearch();
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int x = 30;
        int result = ob.binarySearch(arr,0, n-1, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
