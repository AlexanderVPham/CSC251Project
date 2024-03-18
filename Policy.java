public class Policy
{
   //initialize fields
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int age;
   private String smokerStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   private double BMI = 0;
   
   //no-arg constructor
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
   //constructor
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
   public void setPolicyHolderFirstName(String policyholderFN)
   {
      policyHolderFirstName = policyholderFN;
   }
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   public void setPolicyHolderLastName(String policyholderLN)
   {
      policyHolderLastName = policyholderLN;
   }
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   public void setAge(int a)
   {
      age = a;
   }
   public int getAge()
   {
      return age;
   }
   public void setSmokerStatus(String smokerS)
   {
      smokerStatus = smokerS;
   }
   public String getSmokerStatus()
   {
      return smokerStatus;
   }
   public void setPolicyHolderHeight(double policyholderH)
   {
      policyHolderHeight = policyholderH;
   }
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   public void setPolicyHolderWeight(double policyholderW)
   {
      policyHolderWeight = policyholderW;
   }
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   //calculating BMI and returning BMI
   public double getBMI() 
   {
      BMI = (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
      return BMI;
   }
   //Calculating insurance policy price and returning it
   public double getInsurancePolicyPrice()
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