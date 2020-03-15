
/**
 * this method takes pay type, pay rate, and work time and calculates 
 * base and overtime (if applicable) for salaried or hourly employees.
 * includes toString and getter methods for basepay and overtime 
 * @param type: (char) h for hourly or s for salary
 * @param rate: (float) hourly rate or salary per year
 * @param workTime: (float) days elapsed (for salary) or hours worked
 * @author CaseyJayne
 */
public class CalculateEarnings {
   private float basepay;
   private float overtime;
   
   CalculateEarnings(char type, float rate, float workTime) {
      if (type == 's' || type == 'S') {
         //salaried employees: workTime in days, rate in yearly
         float pay = ((workTime/365)*rate);
         setBasepay(pay);
         setOvertime(0, pay);
      }
      else if(type == 'h' || type == 'H') {
         //hourly working in hours, rate in $/hour
         //calculate if overtime occurs
         if (workTime > 40) {
            float oT = -(40 - workTime);
            setOvertime(oT, rate);
            setBasepay((workTime - oT)*rate);
         }
         else {
            //no overtime
            setOvertime(0, rate);
            setBasepay(workTime*rate);
         }
      }
      else {
         //invalid entry
         System.out.println("invalid type entry");
      }
   }
   
   //default method
   CalculateEarnings(){
      setBasepay(-1);
      setOvertime(0, 0);
      System.out.println("please enter arguments");
   }

   /**
    * @return the basepay
    */
   public float getBasepay() {
      return this.basepay;
   }

   /**
    * @param basepay the basepay to set
    */
   private void setBasepay(float basepay) {
      this.basepay = basepay;
   }

   /**
    * @return the overtime
    */
   public float getOvertime() {
      return this.overtime;
   }

   /**
    * @param overtime the overtime to set
    */
   private void setOvertime(float oT, float rate) {
      this.overtime = ((float) ((rate*1.5)*oT));
   }
   //for implementation on its own
   @Override
   public String toString() {
      return "basepay = " + this.basepay + ", overtime = " + this.overtime
            + "]";
   }
   
   

}
