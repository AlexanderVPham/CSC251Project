import java.util.Scanner;

public class Project_Alexander_Pham
{
   public static void main(String[] args)
   {
      //Creation of file class
      try {
      File file = new File("PolicyInformation");
      
      //Scanner for the input from the file
      Scanner input = new Scanner(file);
      
      //declare variables
      int policyNumber = 0;
      String providerName = "";
      String policyHolderFirstName = "";
      String policyHolderLastName = "";
      int age = 0;
      String smokerStatus = "";
      double policyHolderHeight = 0.0;
      double policyHolderWeight = 0.0;
      
      //Array holding Policy objects
      ArrayList<Policy> policies = new ArrayList<Course>();
      
      //while loop to read file
      while(inputFile.hasNext()) {
         policyNumber = input.nextInt();
         providerName = input.nextLine();
         policyHolderFirstName = input.nextLine();
         policyHolderLastName = input.nextLine();
         age = input.nextInt();
         smokerStatus = input.nextLine();
         policyHolderHeight = input.nextDouble();
         policyHolderWeight = input.nextDouble();
         
         if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
         //Creation of new Policy object, for each policy   
         Policy p = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, age, smokerStatus, policyHolderHeight, policyHolderWeight);
         
         //Adding each new Policy to the array
         policies.add(p);
      }
      
   }//end of reading file and loop
      
      input.close();//close file
      
      //Creating a policy object
      testPolicyHolder.setPolicyNumber(policyNumber);
      testPolicyHolder.setProviderName(providerName);
      testPolicyHolder.setPolicyHolderFirstName(policyHolderFirstName);
      testPolicyHolder.setPolicyHolderLastName(policyHolderLastName);
      testPolicyHolder.setAge(age);
      testPolicyHolder.setSmokerStatus(smokerStatus);
      testPolicyHolder.setPolicyHolderHeight(policyHolderHeight);
      testPolicyHolder.setPolicyHolderWeight(policyHolderWeight);
      testPolicyHolder.getBMI();

      //Output final insurance policy, with information and price
      System.out.println("Policy Number: " + testPolicyHolder.getPolicyNumber());
      System.out.println("Provider Name: " + testPolicyHolder.getProviderName());
      System.out.println("Policyholder's First Name: " + testPolicyHolder.getPolicyHolderFirstName());
      System.out.println("Policyholder's Last Name: " + testPolicyHolder.getPolicyHolderLastName());
      System.out.println("Policyholder's Smoking Status: " + testPolicyHolder.getSmokerStatus());
      System.out.println("Policyholder's Height: " + testPolicyHolder.getPolicyHolderHeight() + " inches");
      System.out.println("Policyholder's Weight: " + testPolicyHolder.getPolicyHolderWeight() + " pounds");
      System.out.println("Policyholder's BMI: " + testPolicyHolder.getBMI());
      System.out.println("Policy Price: " + testPolicyHolder.getInsurancePolicyPrice());
   }
}