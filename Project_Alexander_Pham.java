import java.util.Scanner;
import java.io.*;
import java.util.*; 

public class Project_Alexander_Pham
{
   public static void main(String[] args)
   {
      //Creation of file class
      try {
      File file = new File("PolicyInformation.txt");
      
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
      int smoker = 0;
      int nonSmoker = 0;
      String inputHolder = "";
      
      //Array holding Policy objects
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //while loop to read file
      while(input.hasNext()) {
         inputHolder = input.nextLine();
         policyNumber = Integer.parseInt(inputHolder); //Converting String to Int
         
         providerName = input.nextLine();
         policyHolderFirstName = input.nextLine();
         policyHolderLastName = input.nextLine();
         
         inputHolder = input.nextLine();
         age = Integer.parseInt(inputHolder); //Converting String to Int
         
         smokerStatus = input.nextLine();
         
         inputHolder = input.nextLine();
         policyHolderHeight = Double.parseDouble(inputHolder); //Converting String to Double
         
         inputHolder = input.nextLine();
         policyHolderWeight = Double.parseDouble(inputHolder); //Converting String to Double
         
         
         if(input.hasNext())
            { 
               input.nextLine();
            }
            
         //Creation of new Policy object, for each policy   
         Policy p = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, age, smokerStatus, policyHolderHeight, policyHolderWeight);
         
         //Adding each new Policy to the array
         policies.add(p);
      }
      
      input.close();//close file
          
      //Output each policy object in array
      for(int i =0; i < policies.size(); i++) {
         System.out.println(policies.get(i));
         if (policies.getPolicyHolder().getSmokerStatus().equals("smoker")) {
            smoker ++;
         }
         else {
            nonSmoker ++;
         }
         System.out.println(); 
       }
      //Printing the number of policies
      System.out.println("There were " + numberPolicies + " Policy objects created.");
      //Printing the number of smokers and non smokers  
      System.out.println();
      System.out.println("The number of policies with a smoker is: " + smoker);
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
      
   }//end of reading file and while loop 
      //If anything goes wrong, the IOException will be caught and output message
      catch(IOException ex) {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}