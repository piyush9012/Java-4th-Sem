import java.util.*;
public class matrix_multiply {
	static void printMatrix(int M[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void Multiply(int row1, int col1, int arr1[][], int row2, int col2, int arr2[][]) {
		System.out.println("First Matrix:");
		printMatrix(arr1, row1, col1);
		System.out.println("Second Matrix:");
		printMatrix(arr2, row2, col2);
		int arr3[][] = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for(int k=0; k<row2; k++) {
                    arr3[i][j] += arr1[i][j] * arr2[i][j];
                }
			}
		}
		System.out.println("Resultant Matrix:");
		printMatrix(arr3, row1, col2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in first matrix");
		int row1 = sc.nextInt();
		System.out.println("Enter the number of columns in first matrix");
		int col1 = sc.nextInt();
		System.out.println("Enter the number of rows in second matrix");
		int row2 = sc.nextInt();
		System.out.println("Enter the number of columns in second matrix");
		int col2 = sc.nextInt();
		if (row2 != col1) {
			System.out.println("Multiplication Not Possible");
		}
		else {
			int arr1[][] = new int[row1][col1];
			int arr2[][] = new int[row2][col2];
			System.out.println("Enter the elements of first matrix:");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					arr1[i][j] = sc.nextInt();
				}
			}
			System.out.println("");
			System.out.println("Enter the elements of second matrix:");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < col2; j++) {
					arr2[i][j] = sc.nextInt();
				}
			}
			Multiply(row1, col1, arr1, row2, col2, arr2);
		}
	}
}
