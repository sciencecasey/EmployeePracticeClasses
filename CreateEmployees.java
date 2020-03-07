import java.util.Scanner;

/**
 * @author CaseyJayne
 *
 */
public class CreateEmployees {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //Start an Array Instance
      NewEmployee newEmp = new NewEmployee();
      System.out.println("Please enter Employee number, name, address, and hire"
            + " date. \nPlease format with a | between fields as last "
            + "name first name | day month year | street address; city; "
            + "state; zip code. \n\nExample: 9999 | Gonzalez Shemika | 02042020"
            + " | 3335 Main Street; Studio City; CA; 91604");

      while(true) {
         String input = sc.nextLine();
         //newEmp= new NewEmployee(input);
         newEmp.addEmployee(input);
         System.out.println("Please enter the next Employee number, name, "
               + "address, and hiring date. (Or enter 0 to quit.)");
         if (input.equals("0")){
            break;
         }
         else {
            input = sc.nextLine();
            newEmp.addEmployee(input);
            //newEmp = new NewEmployee(input);
         }
      }
      
      sc.close();
      
      //Print employees
      newEmp.toString();
   }
}
