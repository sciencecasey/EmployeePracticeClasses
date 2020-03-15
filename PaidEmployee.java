
/**
 * extend the Employee Class adding abstract variables payType, payRate, and 
 * earningsInPeriod
 * @author CaseyJayne
 *
 */
public abstract class PaidEmployee extends Employee{
   protected char payType; //h: hourly, s: salary
   protected float payRate; //depends on calculation
   protected float earningsInPeriod; //keep vague to allow modifications
   //create abstract methods: calc earnings (base + o/t) 
   
   //constructor matching Employee
   PaidEmployee(String number, String name, String address,
         String date) {
      super(number, name, address, date);
      // TODO Auto-generated constructor stub
   }

   /**
    * @return the payRate
    */
   abstract public float getPayRate();

   /**
    * @param payRate the payRate to set
    */
   abstract protected void setPayRate(float payRate);

   /**
    * @return the earningsInPeriod
    */
   abstract public float getEarningsInPeriod();

   /**
    * @param earningsInPeriod the earningsInPeriod to set
    */
   abstract protected void setEarningsInPeriod(float earningsInPeriod);
}