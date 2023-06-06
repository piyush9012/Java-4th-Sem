import java.util.*;
public class Matrix_multiply
{
	static void printMatrix(int M[][], int rowSize, int colSize) 
    { 
    	for (int i=0; i<rowSize; i++) 
    	{ 
        	for (int j=0; j<colSize; j++) 
        	{
        		System.out.print(M[i][j] + " "); 
    		} 
    		System.out.println(); 
    	}
	}
    	
	static void Multiply(int row1, int col1, int arr1[][], int row2, int col2, int arr2[][])
	{
		int i, j, k;
    	System.out.println("First Matrix:");
    	printMatrix(arr1, row1, col1);
    	System.out.println("Second Matrix:");
    	printMatrix(arr2, row2, col2);   
    	// Check if multiplication is Possible 
    	if (row2 != col1) 
    	{ 
    		System.out.println("Multiplication Not Possible"); 
    		return; 
    	}   
    	// Matrix to store the result
    	int arr3[][] = new int[col1][col2];
    	// Multiply the two matrices
    	for (i=0; i<row1; i++) 
    	{ 
        	for (j=0; j<col2; j++) 
    		{ 
        		for (k=0; k<row2; k++) 
        			arr3[i][j] += arr1[i][k] * arr2[k][j]; 
    		} 
    	}   
    	// Print the result
    	System.out.println("\nResultant Matrix:"); 
        	printMatrix(arr3, row1, col2); 
    	}

	public static void main(String[] args)
	{
		
		int row1, row2, col1, col2;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of rows in first matrix");
		row1 = sc.nextInt();
		System.out.println("Enter the number of columns in first matrix");
		col1 = sc.nextInt();
		System.out.println("Enter the number of rows in second matrix");
		row2 = sc.nextInt();
		System.out.println("Enter the number of columns in second matrix");
		col2 = sc.nextInt();
		int arr1[][] = new int[row1][col1];
		int arr2[][] = new int[row2][col2];
		System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < row1; i++) 
		{
        	for (int j = 0; j < col1; j++) 
        	{
            	arr1[i][j] = sc.nextInt();
        	}
    	}
     	System.out.println("");
        System.out.println("Enter the elements of second matrix:");
    	for (int i = 0; i < row2; i++) 
    	{
            for (int j = 0; j < col2; j++) 
        	{
        		arr2[i][j] = sc.nextInt();
        	}
    	}
    	Multiply(row1,col1,arr1,row2,col2,arr2);
	}
}
