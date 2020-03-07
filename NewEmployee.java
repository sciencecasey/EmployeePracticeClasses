import java.util.ArrayList;

/**
 * @author CaseyJayne
 *
 */
public class NewEmployee {
   
   private ArrayList<ArrayList<String>> allEmployees;
   private ArrayList<String> currentEmployee;
   
   
   //Constructor
   /*NewEmployee(String userInput) {
      //grab first field, Number
      int start = 0;
      int end = userInput.indexOf('|');
      currentEmployee.set(0,
            userInput.substring(start, end));
      start = end+1;
      //grab next field, full Name and pass to nameParse as input
      end = userInput.indexOf('|', start);
      NameParse nameParse = new NameParse(userInput.substring
            (start, end));
      currentEmployee.set(1 , nameParse.getFirstName());
      currentEmployee.set(2, nameParse.getLastName());
      start = end+1;
      //call to Address Parse to separate address fields
      end = userInput.indexOf('|', start);
      AddressParse addressParse = new AddressParse(userInput.substring
            (start, end));
      currentEmployee.set(3, addressParse.getStreet());
      currentEmployee.set(4, addressParse.getCity());
      currentEmployee.set(5, addressParse.getStateCode());
      currentEmployee.set(6, addressParse.getPostalCode());
      start = end +1;
      //grab last input field, Hire Date & sent to DateParse
      DateParse dateParse = new DateParse(userInput.substring(start));
      currentEmployee.set(7, dateParse.getMonth());
      currentEmployee.set(8, dateParse.getDay());
      currentEmployee.set(9, dateParse.getYear());
      //add the current employee to a row in allEmployees
      this.allEmployees.add(currentEmployee);
   }*/
   
   //default constructor
   NewEmployee(){
      currentEmployee = new ArrayList<String>();
      allEmployees = new ArrayList<ArrayList<String>>();
   }
   
   public void addEmployee(String userInput) {
      int start = 0;
      int end = userInput.indexOf('|');
      this.currentEmployee.set(0,
            userInput.substring(start, end));
      start = end+1;
      //grab next field, full Name and pass to nameParse as input
      end = userInput.indexOf('|', start);
      NameParse nameParse = new NameParse(userInput.substring
            (start, end));
      this.currentEmployee.set(1 , nameParse.getFirstName());
      this.currentEmployee.set(2, nameParse.getLastName());
      start = end+1;
      //call to Address Parse to separate address fields
      end = userInput.indexOf('|', start);
      AddressParse addressParse = new AddressParse(userInput.substring
            (start, end));
      this.currentEmployee.set(3, addressParse.getStreet());
      this.currentEmployee.set(4, addressParse.getCity());
      this.currentEmployee.set(5, addressParse.getStateCode());
      this.currentEmployee.set(6, addressParse.getPostalCode());
      start = end +1;
      //grab last input field, Hire Date & sent to DateParse
      DateParse dateParse = new DateParse(userInput.substring(start));
      this.currentEmployee.set(7, dateParse.getMonth());
      this.currentEmployee.set(8, dateParse.getDay());
      this.currentEmployee.set(9, dateParse.getYear());
      //add the current employee to a row in allEmployees
      this.allEmployees.add(currentEmployee);
   }
   //Convert to Array if desired\
   /**
    * @return
    */
   public String[][] toArray() {
      //10 fields for each employee
      String [][] everyEmployee = new String[allEmployees.size()][10];
      return everyEmployee;
   }
   
   //Override toString() for whole arrayList
   public String toString() {
    //create temporary string of values
      StringBuilder tempEmployee = new StringBuilder();
      for (int i=0; i<allEmployees.size()-1; i++) {
         //String [] empDetails = new String[allEmployees(i).size]
         for(int j = 0; j<10; j++) {
            //insert arraylist values, elementwise into string
            tempEmployee = tempEmployee.append(allEmployees.get(i).get(j));
         }
      }
      //return the string
      return tempEmployee.toString();
   }

   /**
    * @return the allEmployees
    */
   public ArrayList<ArrayList<String>> getAllEmployees() {
      return allEmployees;
   }

   /**
    * @param allEmployees the allEmployees to set
    */
   //public void setAllEmployees(ArrayList<ArrayList<String>> allEmployees) {
   //   this.allEmployees = allEmployees;
   //}

   /**
    * @return the currentEmployee
    */
   public ArrayList<String> getCurrentEmployee() {
      return currentEmployee;
   }

   /**
    * @param currentEmployee the currentEmployee to set
    */
   //public void setCurrentEmployee(ArrayList<String> currentEmployee) {
   //   this.currentEmployee = currentEmployee;
   //}
}
