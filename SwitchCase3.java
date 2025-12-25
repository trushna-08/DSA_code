import java.util.Scanner;

class SwitchCase3 {
   public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    String Day = sc.next();

    switch (Day) {
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thrushday":
        case "Friday":
            System.out.println("Weekday");
            break;
        case "Saturday":
        case "Sunday": 
           System.out.println("Weekend");
           break;
    }
   }    
}
