//---------------------------------------//
//-----------Nested Switch Case ---------//
//---------------------------------------//

import java.util.Scanner;
 class SwitchCase4 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        int EmpId = sc.nextInt();
        String Department = sc.next();

        switch (EmpId)
        {
            case 1 -> System.out.println("kunal");
            case 2 -> System.out.println("Maya");
            case 3 -> {
                System.out.println("Employee id is 3");

            switch (Department) {
                case "It"-> System.out.println("It ");
                case "AIML"-> System.out.println(" AIML");
                case "DS"-> System.out.println(" dat science");
                case "CS"-> System.out.println(" computer");
                } 
                
            }  
        }
    }
}
