public class PolicyHolder {
   //initialize fields
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int age;
   private String smokerStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   private double BMI = 0;
   
   //no-arg constructor
   public PolicyHolder() 
   {
      String policyHolderFirstName = "John";
      String policyHolderLastName = "Doe";
      age = 18;
      String smokerStatus = "non-smoker";
      policyHolderHeight = 62.0;
      policyHolderWeight = 250.5;
   }
   //constructor
   public PolicyHolder(String policyholderFN, String policyholderLN, int a, String smokerS, double policyholderH, double policyholderW)
   {
      policyHolderFirstName = policyholderFN;
      policyHolderLastName = policyholderLN;
      age = a;
      smokerStatus = smokerS;
      policyHolderHeight = policyholderH;
      policyHolderWeight = policyholderW;
   }
   //Creating a copy, minimizing security holes
   public PolicyHolder(PolicyHolder policyHolderCopy)
   {
      policyHolderFirstName = policyHolderCopy.policyHolderFirstName;
      policyHolderLastName = policyHolderCopy.policyHolderLastName;
      age = policyHolderCopy.age;
      smokerStatus = policyHolderCopy.smokerStatus;
      policyHolderHeight = policyHolderCopy.policyHolderHeight;
      policyHolderWeight = policyHolderCopy.policyHolderWeight;
   }
   
   //setters and getters
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
   //toString method
   public String toString() {
      return "PolicyHolder's First Name: " + policyHolderFirstName + "\n" +
             "PolicyHolder's Last Name: " + policyHolderLastName + "\n" +
             "Policyholder's Age: " + age + "\n" +
             "Policyholder's Smoking Status (Y/N): " + smokerStatus + "\n" +
             "Policyholder's Height: " + policyHolderHeight + "\n" +
             "Policyholder's Weight: " + policyHolderWeight + "\n" +
             "Policyholder's BMI: " + BMI + "\n" +
             "Policy Price: $" + getInsurancePolicyPrice();
   }
}