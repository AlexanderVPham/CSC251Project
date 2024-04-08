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
   public static int numberPolicies;
   private PolicyHolder policyHolder;

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
   //mutator and getter for new PolicyHolder
   public void setPolicyHolder(PolicyHolder holder) {
      policyHolder = new PolicyHolder(holder);
   }
   public PolicyHolder getPolicyHolder() {
      return new PolicyHolder(policyHolder);
   }
   //toString Method
   public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
             "Provider Name: " + providerName;
   }
}