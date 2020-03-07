
public class DateParse {
   private String month;
   private String day;
   private String year;
   
   //constructor
   DateParse(String input){
      month = input.substring(0, 2);
      if ((Integer.parseInt(month) > 12) || (Integer.parseInt(month)<1)) {
         month = "<null";
         System.out.println("error, invalid month input");
      }
      day = input.substring(2,4);
      if ((Integer.parseInt(day) > 31) || Integer.parseInt(day) < 1) {
         day = "<null>";
         System.out.println("error, invalid  day input");
      }
      year = input.substring(4);
      if ((Integer.parseInt(year) > 2020) || Integer.parseInt(year) < 1900) {
         year = "<null>";
         System.out.println("error, invalid  year input");
      }
   }
   //default constructor
   DateParse(){
      month = "<null>";
      day = "<null>";
      year = "<null>";
      System.out.println("error, invalid input");
   }
   
   public String toString() {
      return month + "/" + day + "/" + year;
   }
   /**
    * @return the month
    */
   public String getMonth() {
      return month;
   }
   /**
    * @param month the month to set
    */
   public void setMonth(String month) {
      this.month = month;
   }
   /**
    * @return the day
    */
   public String getDay() {
      return day;
   }
   /**
    * @param day the day to set
    */
   public void setDay(String day) {
      this.day = day;
   }
   /**
    * @return the year
    */
   public String getYear() {
      return year;
   }
   /**
    * @param year the year to set
    */
   public void setYear(String year) {
      this.year = year;
   }
   
}
