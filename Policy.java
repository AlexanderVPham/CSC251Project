public class Policy
{
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int age;
   private String smokerStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   public Policy() 
   {
      policyNumber = 1111;
      String providerName = "John Doe";
      String policyHolderFirstName = "John";
      String policyHolderLastName = "Doe";
      age = 18;
      String smokerStatus = "non-smoker";
      policyHolderHeight = 62.0;
      policyHolderWeight = 250.5;
   }
   public Policy(int pN, String providerN, String policyholderFN, String policyholderLN, int a, String smokerS, double policyholderH, double policyholderW)
   {
      policyNumber = pN;
      providerName = providerN;
      policyHolderFirstName = policyholderFN;
      policyHolderLastName = policyholderLN;
      age = a;
      smokerStatus = smokerS;
      policyHolderHeight = policyholderH;
      policyHolderWeight = policyholderW;
   }
   public void int setPolicyNumber(int pN)
   {
      policyNumber = pN;
   }
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   public void String setProviderName(String providerN)
   {
      providerName = providerN;
   }
   public String getProviderName()
   {
      return providerName;
   }
   public void String setPolicyHolderFirstName(String policyholderFN)
   {
      policyHolderFirstName = policyholderFN;
   }
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   public void String setPolicyHolderLastName(String policyholderLN)
   {
      policyHolderLastName = policyholderLN;
   }
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   public void int setAge(int a)
   {
      age = a;
   }
   public int getAge()
   {
      return age;
   }
   public void String setSmokerStatus(String smokerS)
   {
      smokerStatus = smokerS;
   }
   public String getSmokerStatus()
   {
      return smokerStatus;
   }
   public void double setPolicyHolderHeight(double policyholderH)
   {
      policyHolderHeight = policyholderH;
   }
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   public void double setPolicyHolderWeight(double policyholderW)
   {
      policyHolderWeight = policyholderW;
   }
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   public double BMI() 
   {
      BMI = (policyHolderWeight * 703) / (policyHolderHeight^2);
      return BMI;
   }
   public double insurancePolicyPrice()
   {
      double insurancePolicyPrice = 600;
      if (age > 50) {
         insurancePolicyPrice = insurancePolicyPrice + 75;
      } 
      if (smokerStatus.equals("smoker")) {
         insurancePolicyPrice = insurancePolicyPrice + 100;
      }
      if (BMI > 35) {
         insurancePolicyPrice = insurancePolicyPrice + ((BMI - 35) * 20);
      }
      return insurancePolicyPrice;
   }
}