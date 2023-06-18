import java.util.*;
public class simple_calculator {
    public static void main(String args[]) {
        int op1, op2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther first operand");
        op1 = sc.nextInt();
        System.out.println("Enter the second operand");
        op2 = sc.nextInt();
        char operator;
        System.out.print("Enter the operator (+,-,*,/,%): ");
        System.out.println();
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                res = op1 + op2;
                System.out.println("The addition is " + res);
                break;
            case '-':
                res = op1 - op2;
                System.out.println("The subtraction is " + res);
                break;
            case '*':
                res = op1 * op2;
                System.out.println("The multiplication is " + res);
                break;
            case '/':
                res = op1 / op2;
                System.out.println("The division is " + res);
                break;
            case '%':
                res = op1 % op2;
                System.out.println("The division is " + res);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
