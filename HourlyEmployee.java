
/**
 * @author CaseyJayne
 *
 */
public class HourlyEmployee extends PaidEmployee{
   final char PAYTYPE = 'h';
   private float timeWorked;
   private float basePay;
   private float overTimePay;
   
   HourlyEmployee(String number, String name, String address,
         String date, double rate, float hrsWorked) {
      super(number, name, address, date);
      setPayRate((float)rate);
      setTimeWorked(hrsWorked);
      CalculateEarnings calc = new CalculateEarnings(this.PAYTYPE,
            (float) rate, hrsWorked);
      setBasePay(calc.getBasepay());
      setOverTimePay(calc.getOvertime());
      setEarningsInPeriod( (getBasePay()+getOverTimePay()) );
   }
   
   /**
    * @return the timeWorked
    */
   public float getTimeWorked() {
      return this.timeWorked;
   }

   /**
    * @param timeWorked 
    */
   protected void setTimeWorked(float timeWorked) {
      this.timeWorked = timeWorked;
   }

   /**
    * @return the PAYTYPE
    */
   public char getPAYTYPE() {
      return this.PAYTYPE;
   }

   //Inherited abstract methods
   public float getPayRate() {
      return this.payRate;
   }
   
   protected void setPayRate(float payRate) {
      // TODO Auto-generated method stub
      
   }

   /**
    * @return the basePay
    */
   public float getBasePay() {
      return this.basePay;
   }

   /**
    * @param basePay the basePay to set
    */
   private void setBasePay(float basePay) {
      this.basePay = basePay;
   }

   /**
    * @return the overTimePay
    */
   public float getOverTimePay() {
      return this.overTimePay;
   }

   /**
    * @param overTimePay the overTimePay to set
    */
   private void setOverTimePay(float overTimePay) {
      this.overTimePay = overTimePay;
   }

   public float getEarningsInPeriod() {
      // TODO Auto-generated method stub
      return this.earningsInPeriod;
   }

   protected void setEarningsInPeriod(float earningsInPeriod) {
      this.earningsInPeriod = earningsInPeriod;
   }

   @Override
   public String toString() {
      return  super.toString() + "\nHourlyEmployee, basepay = " + this.basePay
            + ", overtime =" + this.overTimePay + ", total earnings = " 
            + this.earningsInPeriod;
   }
   

   

}
