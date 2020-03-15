
/**
 * takes a 4 String representations of street, city, stateCode, and postal code
 * and returns separated fields through getters.  
 * precondition: Each field should be delimited by a semicolon.
 * precondition: each field should be a string
 * precondition: zip code should be only 5 units long 
 * @author CaseyJayne
 *
 */
public class AddressParse {
   private String street;
   private String city;
   private String stateCode;
   private String postalCode;
   
   //Constructor objects
    AddressParse(String userInput){
       userInput = userInput.trim();
       //index for the street
       int startFrom = 0;
       int endAt = userInput.indexOf(';');
       this.street = userInput.
             substring(startFrom, endAt).trim();
       startFrom = endAt+1;
       endAt = userInput.indexOf(';', startFrom);
       this.city = userInput.
             substring(startFrom, endAt).trim();
       startFrom = endAt+1;
       endAt = userInput.indexOf(';', startFrom); //
       this.stateCode = userInput.
             substring(startFrom, endAt).
             toUpperCase().trim();
       startFrom = endAt + 1;
       this.postalCode = userInput.substring(startFrom).trim();
       if (this.postalCode.length()>5) {
          this.postalCode= this.postalCode.substring(0,4);
       }
    }
    //default Constructor
    AddressParse(){
       this.street = "<couldn't parse>";
       this.city = "<couldn't parse>";
       this.stateCode = "<couldn't parse>";
       this.postalCode = "<couldn't parse>";
    }
    
    
    //Override toString
    public String toString() {
       return this.street+ " " +this.city+ ", " +this.stateCode+ " " +this.postalCode; 
    }
    
       /**
   * @return the street
   */
   public String getStreet() {
      return this.street;
   }
   /**
   * @param street the street to set
   */
   public void setStreet(String street) {
      this.street = street;
   }
   /**
   * @return the city
   */
   public String getCity() {
      return this.city;
   }
   /**
   * @param city the city to set
   */
   public void setCity(String city) {
      this.city = city;
   }
   /**
   * @return the stateCode
   */
   public String getStateCode() {
      return this.stateCode;
   }
   /**
   * @param stateCode the stateCode to set
   * changes to upperCase and trims
   */
   public void setStateCode(String stateCode) {
      this.stateCode = stateCode.toUpperCase().trim();
   }
   /**
   * @return the postalCode
   */
   public String getPostalCode() {
      return this.postalCode;
   }
   /**
    * @param postalCode the postalCode to set and cuts to 5 digits
    */
   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode.trim();
      //trim to 5 digit
      if (this.postalCode.length()>5) {
         this.postalCode= this.postalCode.substring(0,4);
      }
   }

}
