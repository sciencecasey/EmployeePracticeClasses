
/**
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
       //index for the street
       int startFrom = 0;
       int endAt = userInput.indexOf(';');
       street = userInput.substring(startFrom, endAt);
       startFrom = endAt+1;
       endAt = userInput.indexOf(';', startFrom);
       city = userInput.substring(startFrom, endAt);
       startFrom = endAt+1;
       endAt = userInput.indexOf(';', startFrom); //
       stateCode = userInput.substring(startFrom, endAt);
       startFrom = endAt + 1;
       postalCode = userInput.substring(startFrom);
    }
    //default Constructor
    AddressParse(){
       street = "<couldn't parse>";
       city = "<couldn't parse>";
       stateCode = "<couldn't parse>";
       postalCode = "<couldn't parse>";
    }
    
    
    //Override toString
    public String toString() {
       return street+ " " +city+ ", " +stateCode+ " " +postalCode; 
    }
    
       /**
    * @return the street
    */
   public String getStreet() {
      return street;
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
      return city;
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
      return stateCode;
   }
   /**
    * @param stateCode the stateCode to set
    */
   public void setStateCode(String stateCode) {
      this.stateCode = stateCode;
   }
   /**
    * @return the postalCode
    */
   public String getPostalCode() {
      return postalCode;
   }
   /**
    * @param postalCode the postalCode to set
    */
   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

}
