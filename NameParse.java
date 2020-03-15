
/**
 * This class takes a String input value of lastname, firstname and separates
 * by comma delimiter into lastName and firstName field.  Alternatively can 
 * manually setFirstName or setLastName.  Also retriever with getters and 
 * toString override method.
 * @author CaseyJayne
 *
 */
public class NameParse {
   private String firstName;
   private String lastName;
   
   //Constructors
   NameParse(String name){
      name =name.trim();
      if (name.contains(",")){
         int end = name.indexOf(",");
         this.lastName = name.substring(0, end).trim();
         this.firstName = name.substring(end+1).trim();
      }
      else if(name.contains(" ")) {
         //Likely separated only by space
         int end = name.indexOf(" ");
         this.lastName = name.substring(0, end).trim();
         this.firstName = name.substring(end+1).trim();
      }
      else {
         System.out.println("Please separate the lastname from the firstname");
         setFirstName("invalid input");
         setLastName("invalid input");
      }
   }
   NameParse(){
      this.firstName = "invalid input";
      this.lastName = "invalid input";
   }
   
   public String toString() {
      return this.firstName + " " + this.lastName;
   }
   /**
   * @return the firstName
   */
   public String getFirstName() {
      return this.firstName;
   }
   /**
   * @param firstName the firstName to set    */
   private void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   /**
   * @return the lastName
   */
   public String getLastName() {
      return this.lastName;
   }
   /**
   * @param lastName the lastName to set
   */
   private void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   

}
