import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int original = number ;
        int reverse = 0;

        while (number > 0)
        {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10; 
        }

        if (original == reverse)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Palidrome number ");
        }
    }
}