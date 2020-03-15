
public class testPayments {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      HourlyEmployee hrTest = new HourlyEmployee("9876", 
            "Richards, Casey", "12 Main Street; Napa; CA; 94581",
            "04212019", 31.00f, 40);
      HourlyEmployee hrTest2 = new HourlyEmployee("1556", 
            "McCabe, Cassandra", "11 First St; Napa; CA; 94559",
            "04212019", 31.00f, 46);
      SalariedEmployee salarTest = new SalariedEmployee("6546", 
            "Richards, Shannon", "41 Polk Place; Napa; CA; 95603"
            , "03132020", 125000.00,1);
   
   hrTest.toString();
   hrTest2.toString();
   salarTest.toString();
   
   System.out.println("Casey made "+hrTest.getBasePay()+" base, "
         +hrTest.getOverTimePay()+" overtime, which totals to " +
         hrTest.getEarningsInPeriod());
   
   System.out.println("Cassandra made "+hrTest2.getBasePay()+" base, "
         +hrTest2.getOverTimePay()+" overtime, which totals to " +
         hrTest2.getEarningsInPeriod());
   
   System.out.println("Shannon made "+ salarTest.getEarningsInPeriod());
   }

}
