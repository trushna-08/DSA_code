import java.util.Scanner;;

 class SwitchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit) {

            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("Healthy fruit");
                break;

            case "Banana":
                System.out.println("high Protein fruit");
                break;

            case "Strawberry":
                System.out.println("most Loved fruit ");  
                break;

            default  :
                System.out.println("Please Enter a valid fruit");  
        }
    }
    
}
