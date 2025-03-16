import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


      /*  System.out.println("Enter a fruit name:");
        String fruits = sc.next();

        switch (fruits) {
            case "orange":
                System.out.println("orange");
                break;
            case "Banana":
                System.out.println("banana");
                break;
            case "Apple":
                System.out.println("king of fruits");
                break;
            case "grapes":
                System.out.println("grapes");
                break;
            default:
                System.out.println("unknown");
                break;

        } */

    /*    System.out.println("Enter a number: ");
        int day = sc.nextInt();
         switch (day){
             case 1 -> System.out.println("Monday");
             case 2 -> System.out.println("Tuesday");
             case 3 -> System.out.println("Wednesday");
             case 4 -> System.out.println("Thursday");
             case 5 -> System.out.println("Friday");
             case 6 -> System.out.println("Saturday");
             case 7 -> System.out.println("Sunday");
         } */

       /* int day = sc.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("WeekDays");
            case 6,7 -> System.out.println("Weekends");
        } */

        // Multiple Switch case
        int empID = sc.nextInt();
        String Department = sc.next();
         switch (empID) {
             case 1:
                 System.out.println("Kunal");
                 break;
             case 2:
                 System.out.println("Abe");
                 break;
                 case 3:
                     System.out.println("Emp 3");
                     switch (Department){
                         case "IT":
                             System.out.println("IT Department");
                             break;
                         case "CSE":
                             System.out.println("CSE Department");
                             break;
                         case "ECE":
                             System.out.println("ECE Department");
                             break;
                         default:
                             System.out.println("Department not found");
                     }
                     break;
             default:
                 System.out.println("enter correct empid ");
         }
    }
}
