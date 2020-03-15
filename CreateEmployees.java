//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author CaseyJayne
 *
 */
public class CreateEmployees {
   /**
    * prompts for new employee information and adds each employee to an 
    * arrayList, then prints the arrayList
    * @param args 
    */
   public static void main(String[] args) {
      //BufferedReader sc =  new BufferedReader(new InputStreamReader(System.in));
      Scanner sc = new Scanner(System.in);
      String name;
      String number;
      String address;
      String hireDate;
      AllEmployeesArray allEmpArray = new AllEmployeesArray();
      
      boolean control = true;
      while(control) {
         //newEmp= new NewEmployee(input);
         System.out.println("Please enter the new  Employee number.");
         number = sc.nextLine();
         System.out.println("Please enter the new Employee name, formatted "
               + "lastname, firstname");
         name = sc.nextLine();
         System.out.println("Please enter the employee address, formatted with ;"
               + "between each field. "
               + "(nExample: 3335 Main Street; Studio City; CA; 91604");
         address = sc.nextLine();
         System.out.println("Please enter the 8 digit hire date as 2 digit month "
               +"two digit day and 4 digit year");
         hireDate = sc.nextLine();
         Employee newEmp = new Employee(number, name, address, hireDate);
         //save the returns to an array
         String[] newEmpArray= {newEmp.getEmployeeCode(), newEmp.getFirstName(), 
               newEmp.getLastName(), newEmp.getHireDay(), newEmp.getHireMonth(), 
               newEmp.getHireYear(), newEmp.getStreetAddress(), 
               newEmp.getCity(), newEmp.getStateCode(), newEmp.getZipCode()};
         allEmpArray.addEmp(newEmpArray);
         System.out.println("Would you like to enter another Employee? Press "
               + "0 to quit or any key to continue.");
         String input = sc.nextLine();
         if (input.equals("0")){
            //Print employees
            allEmpArray.toString();
            control = false;
            //quit the loop when desired
         }
      }
      sc.close();
      allEmpArray.toString();
   }
}


class AllEmployeesArray {
   private ArrayList<String[]> allEmployeesList= new ArrayList<>();
   //private String [] newEmployee;
   
   AllEmployeesArray(String[] inputArray){
      this.allEmployeesList.add(inputArray);
   }
   //default constructor
   AllEmployeesArray(){
      this.allEmployeesList.ensureCapacity(20);
   }
   
   /**
   * @param inputArray
   */
   public void addEmp(String[] inputArray){
      this.allEmployeesList.add(inputArray);
   }
   /*
   * @return the allEmployeesList
   */
   public ArrayList<String[]> getAllEmployeesList() {
      return this.allEmployeesList;
   }
   
   /*public String toString() {
      for (int i=0; i<this.allEmployeesList.size()-1; i++) {
         String [] row = {this.allEmployeesList(i)};
         for(int j = 0; j<10; j++) {
            System.out.println("" +row[j].toString());
         }
   }
}*/
}