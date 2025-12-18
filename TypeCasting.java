import java.util.Scanner;

class TypeCasting 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        int num = (int)(67.56f);
        System.out.println(num);
    }
}

//output : 67 converting float into integer