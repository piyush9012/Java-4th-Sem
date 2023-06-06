import java.util.*;
public class digitsum
{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        while(num != 0)
        {
            while(num != 0)
            {
                sum += num%10;
                num /= 10;    
            }

            if(sum>=10)
            {
                System.out.println("Sum "+sum);
                num = sum;
                sum = 0;
            }
        }
        System.out.println("Sum in single digit= "+sum);
    }
}
