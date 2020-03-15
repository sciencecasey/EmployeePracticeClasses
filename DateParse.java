
/**
 * Takes a String date input and separates into subfield month, day, and year
 * precondition: month must be 2 digits and populate the first 2 units
 * precondition: day must be 2 digits and populate units 3 and 4 [2] and [3]
 * precondition: year must be 4 digits and populate the last 4 units
 * @author CaseyJayne
 *
 */
public class DateParse {
   private String month;
   private String day;
   private String year;
   
   //constructor
   DateParse(String input){
      this.month = input.substring(0, 2);
      if ((Integer.parseInt(this.month) > 12) || 
            (Integer.parseInt(this.month)<1)) {
         this.month = "<null";
         System.out.println("error, invalid month input");
      }
      this.day = input.substring(2,4);
      if ((Integer.parseInt(this.day) > 31) || 
            (Integer.parseInt(this.day) < 1)) {
         this.day = "<null>";
         System.out.println("error, invalid  day input");
      }
      this.year = input.substring(4);
      if ((Integer.parseInt(this.year) > 2020) || 
            (Integer.parseInt(this.year) < 1900)) {
         this.year = "<null>";
         System.out.println("error, invalid  year input");
      }
   }
   //default constructor
   DateParse(){
      this.month = "<null>";
      this.day = "<null>";
      this.year = "<null>";
      System.out.println("error, invalid input");
   }
   
   public String toString() {
      return this.month + "/" + this.day + "/" + this.year;
   }
   /**
   * @return the month
   */
   public String getMonth() {
      return this.month;
   }
   /**
   * @param month the month to set.  Must be between 1 and 12
   */
   public void setMonth(String month) {
      this.month = month;
      if ((Integer.parseInt(this.month) > 12) || 
            (Integer.parseInt(this.month)<1)) {
         this.month = "<null";
         System.out.println("error, invalid month input");
      }
   }
   /**
   * @return the day
   */
   public String getDay() {
      return this.day;
   }
   /**
   * @param day the day to set between 01 and 31
   */
   public void setDay(String day) {
      this.day = day;
      if ((Integer.parseInt(this.day) > 31) || 
            (Integer.parseInt(this.day) < 1)) {
         this.day = "<null>";
         System.out.println("error, invalid  day input");
      }
   }
   /**
   * @return the year
   */
   public String getYear() {
      return this.year;
   }
   /**
   * @param year the year to set.  Must be between 1900 and 2020
   */
   public void setYear(String year) {
      this.year = year;
      if ((Integer.parseInt(this.year) > 2020) || 
            (Integer.parseInt(this.year) < 1900)) {
         this.year = "<null>";
         System.out.println("error, invalid  year input");
      }
   }
   
}
