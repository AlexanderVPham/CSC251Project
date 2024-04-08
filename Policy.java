public class Policy
{
   //initialize fields
   private int policyNumber;
   private String providerName;
   public static int numberPolicies;

   //setters and getters
   public void setPolicyNumber(int pN)
   {
      policyNumber = pN;
   }
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   public void setProviderName(String providerN)
   {
      providerName = providerN;
   }
   public String getProviderName()
   {
      return providerName;
   }
   
   //toString Method
   public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
             "Provider Name: " + providerName;
   }
}