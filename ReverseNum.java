import java.util.Scanner;

class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        int Reverse = 0;
        
        while (num > 0) 
        {
          int lastnum = num % 10;
          Reverse = Reverse * 10 + lastnum;
          num = num / 10;
        } 

        System.out.println("After Reversing the number is : " + Reverse);

    }
}