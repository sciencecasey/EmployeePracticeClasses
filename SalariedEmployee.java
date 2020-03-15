
/**
 * @author CaseyJayne
 *
 */
public class SalariedEmployee extends PaidEmployee{
   final char PAYTYPE = 's';
   int workDays;
   
   SalariedEmployee(String number, String name, String address, String date, 
         double rate, int workDays) {
      super(number, name, address, date);
      setPayRate((float)rate);
      setWorkDays(workDays);
      CalculateEarnings calc= new CalculateEarnings(this.PAYTYPE, (float)rate,
            workDays);
      setEarningsInPeriod(calc.getBasepay());
   }

   /**
    * Inherited abstract method
    * @return the payRate
    */
   public float getPayRate() {
      return this.payRate;
   }

   /**
    * inherited abstract method
    * @param payRate the payRate to set
    */
   protected void setPayRate(float payRate) {
      this.payRate = payRate;
   }

   /**
    * @return the workDays
    */
   public int getWorkDays() {
      return this.workDays;
   }

   /**
    * @param workDays the workDays to set
    */
   private void setWorkDays(int workDays) {
      this.workDays = workDays;
   }

   /**
    * inherited abstract method
    * @return the earningsInPeriod
    */
   public float getEarningsInPeriod() {
      return this.earningsInPeriod;
   }

   /**
    * inherited abstract method
    * @param earningsInPeriod the earningsInPeriod to set
    */
   protected void setEarningsInPeriod(float earningsInPeriod) {
      this.earningsInPeriod = earningsInPeriod;
   }

   /**
    * @return the PAYTYPE
    */
   public char getPAYTYPE() {
      return this.PAYTYPE;
   }
   
   public String toString() {
      return super.toString() + ", Salaried, earnings in " + getWorkDays() + 
            " : " + getEarningsInPeriod();
      
   }
}
