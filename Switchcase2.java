import java.util.Scanner;

class Switchcase2 {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day : ");
    String day = sc.next();

    switch (day){
        case "Sunday" -> System.out.println("Its a holiday ");
        case "Monday" -> System.out.println("Its a Working day ");
        case "Tuesday" -> System.out.println("Its a Gym day ");
        case "Wednesday" -> System.out.println("Its a gym day");
        case "Thrushday" -> System.out.println("Its a Gym day");
        case "Friday" -> System.out.println("Its a Gym day ");
        case "Saturday" -> System.out.println("Its a Gym day ");
        default ->  System.out.println("Please enter the valid day ");
    }
   } 
}
