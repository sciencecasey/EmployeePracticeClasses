
public class NameParse {
   private String firstName;
   private String lastName;
   
   //Contstructors
   NameParse(String name){
      int end = name.indexOf(" ");
      firstName = name.substring(0, end);
      lastName = name.substring(end+1);
   }
   NameParse(){
      firstName = "invalid input";
      lastName = "invalid input";
   }
   
   public String toString() {
      return firstName + " " +lastName;
   }
   /**
    * @return the firstName
    */
   public String getFirstName() {
      return firstName;
   }
   /**
    * @param firstName the firstName to set
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   /**
    * @return the lastName
    */
   public String getLastName() {
      return lastName;
   }
   /**
    * @param lastName the lastName to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   

}
