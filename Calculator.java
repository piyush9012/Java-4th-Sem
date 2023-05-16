import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        int op1, op2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther first operand");
        op1 = sc.nextInt();
        System.out.println("Enter the second operand");
        op2 = sc.nextInt();
        char operator;
        System.out.println("Enter the operator: ");
        operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+':
                res = op1+op2;
                System.out.println("The addition is "+ res);
                break;
            case '-':
                res = op1-op2;
                System.out.println("The subtraction is "+ res);
                break;
            case '*':
                res = op1*op2;
                System.out.println("The multiplication is "+ res);
                    break;
            case '/':
                res = op1/op2;
                System.out.println("The division is "+ res);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

// Write a java program with one method to put even and odd elements of an array in two separate arrays and another method to find the transpose of the matrix by implementing the concept of method overwriting

// super keyword in java is a reference variable which is used to refer to immediate parent class wheever you create the instance of subclaass an instance of parent class is created implicitly which is referred by super reference variable

// extends keyword