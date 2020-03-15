/**
 * this method takes a String number, String name, String address, and String 
 * date and sends them to other methods to separate fields and 
 * creates a new employee array.  Public methods include getters, setters, and 
 * toString.
 * @author CaseyJayne
 *
 */
public class Employee {
   private String employeeCode;
   private String firstName;
   private String lastName;
   private String streetAddress;
   private String city;
   private String stateCode;
   private String zipCode;
   private String hireMonth;
   private String hireDay;
   private String hireYear;
   //Constructor
   Employee(String number, String name, String address, String date) {
      //grab first field, Number
      setEmployeeCode(number);
      //grab next field, full Name and pass to nameParse as input
      NameParse nameParse = new NameParse(name);
      setFirstName(nameParse.getFirstName());
      setLastName(nameParse.getLastName());
      //call to Address Parse to separate address fields
      AddressParse addressParse = new AddressParse(address);
      setStreetAddress(addressParse.getStreet());
      setCity(addressParse.getCity());
      setStateCode(addressParse.getStateCode());
      setZipCode(addressParse.getPostalCode());
      //grab last input field, Hire Date & sent to DateParse
      DateParse dateParse = new DateParse(date);
      setHireMonth(dateParse.getMonth());
      setHireDay(dateParse.getDay());
      setHireYear(dateParse.getYear());
   }
   
   /*Override toString() for whole arrayList
   */
   public String toString() {
    //create temporary string of values
      return getEmployeeCode() + getFirstName() + getLastName() + 
            getStreetAddress() + getCity() + getStateCode() + getZipCode() +
            getHireMonth() + getHireDay() + getHireYear();
   }

   /**
   * @return the employeeCode
   */
   public String getEmployeeCode() {
      return this.employeeCode;
   }

   /**
   */
   private void setEmployeeCode(String number) {
      this.employeeCode = number;
   }

   /**
   * @return the firstName
   */
   public String getFirstName() {
      return this.firstName;
   }

   /**
   * @param firstName the firstName to set
   */
   private void setFirstName(String fName) {
      this.firstName = fName;
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
   private void setLastName(String lName) {
      this.lastName = lName;
   }

   /**
   * @return the streetAddress
   */
   public String getStreetAddress() {
      return this.streetAddress;
   }

   /**
   * @param streetAddress the streetAddress to set
   */
   private void setStreetAddress(String street) {
      this.streetAddress = street;
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
   private void setCity(String city) {
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
   */
   private void setStateCode(String state) {
      this.stateCode = state;
   }

   /**
   * @return the zipCode
   */
   public String getZipCode() {
      return this.zipCode;
   }

   /**
   * @param zipCode the zipCode to set
   */
   private void setZipCode(String zip) {
      this.zipCode = zip;
   }

   /**
   * @return the hireMonth
   */
   public String getHireMonth() {
      return this.hireMonth;
   }

   /**
   * @param hireMonth the hireMonth to set
   */
   private void setHireMonth(String month) {
      this.hireMonth = month;
   }

   /**
   * @return the hireDay
   */
   public String getHireDay() {
      return this.hireDay;
   }

   /**
   * @param hireDay the hireDay to set
   */
   private void setHireDay(String day) {
      this.hireDay = day;
   }

   /**
   * @return the hireYear
   */
   public String getHireYear() {
      return this.hireYear;
   }

   /**
   * @param hireYear the hireYear to set
   */
   private void setHireYear(String year) {
      this.hireYear = year;
   }
}
