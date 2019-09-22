/*
 *  Derek Schunicke
 *  991295326
 *  PROG24178 - Object Oriented Programming
 */
package testpackage;

//importing scanner
import java.util.Scanner;

/**
 * @author derek
 */
public class TestPackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables for weight and shipping mode and weight validation
        double weight = 0;
        String shippingMode;
        String validateWeight = "";
        
        //constant variables for air, transport and mail shipping
        final String AIR = "A";
        final String TRUCK = "T";
        final String MAIL = "M";
        
        //initializing scanner
        Scanner input = new Scanner(System.in);

        do{
            
            //reset weight
            weight = 0;
            
            //checking if users input is a number
            try{
            
                //getting weight for first un-insured package
                System.out.print("Please enter the weight for first " +
                        "un-insured package: ");
         
                validateWeight = input.next(); 
                weight = Double.parseDouble(validateWeight);
                
            }
            
            //if user enters a character other than a number
            catch(NumberFormatException ex){
            
                System.out.println(validateWeight + " is invalid weight. " +
                        "Enter new weight!");
                
            }            
            
            //tell user to enter valid weight
            if(weight <= 0)
                System.out.println("Weight MUST be greater than ZERO!!");
            
        //keep looping until user enters a number greater than zero
        }while(weight <= 0);
        
        do{
            
            //getting shipping method for first un-insured package
            System.out.print("Please enter 'A' for air 'T' for truck or 'M'" + 
                    " for mail: ");
            shippingMode = input.next().toUpperCase();
            System.out.println();
            
            //inform user if they enter invalid shipping method
            if(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                    !MAIL.equals(shippingMode))
                System.out.println(shippingMode + " is an invalid shipping" +
                        " method, please enter a new shipping method.");

        //keep looping until user enters a valid shipping method
        }while(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                !MAIL.equals(shippingMode));
        
        //filling first un-insured package with users info
        Package myPackage = new Package(weight, shippingMode);
        
        do{
            
            //reset weight
            weight = 0;
            
            //checking if users input is a number
            try{
            
                //getting weight for second un-insured package
                System.out.print("Please enter the weight for second " + 
                        "un-insured package: ");
         
                validateWeight = input.next(); 
                weight = Double.parseDouble(validateWeight);
                
            }
            
            //if user enters a character other than a number
            catch(NumberFormatException ex){
            
                System.out.println(validateWeight + " is invalid weight. " +
                        "Enter new weight!");
                
            }            
        
            //informing user to enter a valid weight
            if(weight <= 0)
                System.out.println("Weight MUST be greater than ZERO!!");
            
        //keep looping until user enters a number greater than zero
        }while(weight <= 0);

        do{
            
            //getting shipping method for second un-insured package
            System.out.print("Please enter 'A' for air 'T' for truck or 'M'" +
                    " for mail: ");
            shippingMode = input.next().toUpperCase();
            System.out.println();
            
            //inform user if they enter invalid shipping method
            if(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                    !MAIL.equals(shippingMode))
                System.out.println(shippingMode + " is an invalid shipping" +
                        " method, please enter a new shipping method.");

        //keep looping until user enters a valid shipping method
        }while(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                !MAIL.equals(shippingMode));

        //filling second un-insured package with users info
        Package hisPackage = new Package(weight, shippingMode);
        
        do{
            
            //reset weight
            weight = 0;
            
            //checking if users input is a number
            try{
            
                //getting weight for third un-insured package
                System.out.print("Please enter the weight for third" +
                        " un-insured package: ");
         
                validateWeight = input.next(); 
                weight = Double.parseDouble(validateWeight);
                
            }
            
            //if user enters a character other than a number
            catch(NumberFormatException ex){
            
                System.out.println(validateWeight + " is invalid weight." +
                        " Enter new weight!");
                
            }            
        
            //informing user to enter a valid weight
            if(weight <= 0)
                System.out.println("Weight MUST be greater than ZERO!!");
            
        //keep looping until user enters a number greater than zero
        }while(weight <= 0);

        do{
            
            //getting shipping method for third un-insured package
            System.out.print("Please enter 'A' for air 'T' for truck or 'M'" +
                    " for mail: ");
            shippingMode = input.next().toUpperCase();
            System.out.println();
            
            //inform user if they enter invalid shipping method
            if(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                    !MAIL.equals(shippingMode))
                System.out.println(shippingMode + " is an invalid shipping" +
                        " method, please enter a new shipping method.");

        //keep looping until user enters a valid shipping method
        }while(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                !MAIL.equals(shippingMode));

        //filling third un-insured package with users info
        Package herPackage = new Package(weight, shippingMode);
        
        do{
            
            //reset weight
            weight = 0;
            
            //checking if users input is a number
            try{
            
                //getting weight for first insured package
                System.out.print("Please enter the weight for first" + 
                        " insured package: ");
         
                validateWeight = input.next(); 
                weight = Double.parseDouble(validateWeight);
                
            }
            
            //if user enters a character other than a number
            catch(NumberFormatException ex){
            
                System.out.println(validateWeight + " is invalid weight." + 
                        " Enter new weight!");
                
            }            
        
            //informing user to enter a valid weight
            if(weight <= 0)
                System.out.println("Weight MUST be greater than ZERO!!");
            
        //keep looping until user enters a number greater than zero
        }while(weight <= 0);

        do{
            
            //getting shipping method for first insured package
            System.out.print("Please enter 'A' for air 'T' for truck or 'M'" +
                    " for mail: ");
            shippingMode = input.next().toUpperCase();
            System.out.println();
            
            //inform user if they enter invalid shipping method
            if(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                    !MAIL.equals(shippingMode))
                System.out.println(shippingMode + " is an invalid shipping" +
                        " method, please enter a new shipping method.");

        //keep looping until user enters a valid shipping method
        }while(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                !MAIL.equals(shippingMode));

        //filling first insured package with users info
        InsuredPackage myInsPackage = new InsuredPackage(weight, 
                shippingMode);

        do{
            
            //reset weight
            weight = 0;
            
            //checking if users input is a number
            try{
            
                //getting weight for second insured package
                System.out.print("Please enter the weight for second" +
                        " insured package: ");
         
                validateWeight = input.next(); 
                weight = Double.parseDouble(validateWeight);
                
            }
            
            //if user enters a character other than a number
            catch(NumberFormatException ex){
            
                System.out.println(validateWeight + " is invalid weight." +
                        " Enter new weight!");
                
            }            
        
            //informing user to enter a valid weight
            if(weight <= 0)
                System.out.println("Weight MUST be greater than ZERO!!");
            
        //keep looping until user enters a number greater than zero
        }while(weight <= 0);

        do{
            
            //getting shipping method for second insured package
            System.out.print("Please enter 'A' for air 'T' for truck or 'M'" +
                    " for mail: ");
            shippingMode = input.next().toUpperCase();
            System.out.println();
            
            //inform user if they enter invalid shipping method
            if(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                    !MAIL.equals(shippingMode))
                System.out.println(shippingMode + " is an invalid shipping" +
                        " method, please enter a new shipping method.");

        //keep looping until user enters a valid shipping method
        }while(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                !MAIL.equals(shippingMode));

        //filling second insured package with users info
        InsuredPackage hisInsPackage = new InsuredPackage(weight, 
                shippingMode);
        do{
            //reset weight
            weight = 0;
            
            //checking if users input is a number
            try{
            
                //getting weight for third insured package
                System.out.print("Please enter the weight for third" +
                        " insured package: ");
         
                validateWeight = input.next(); 
                weight = Double.parseDouble(validateWeight);
                
            }
            
            //if user enters a character other than a number
            catch(NumberFormatException ex){
            
                System.out.println(validateWeight + " is invalid weight." +
                        " Enter new weight!");
                
            }            
        
            //informing user to enter a valid weight
            if(weight <= 0)
                System.out.println("Weight MUST be greater than ZERO!!");
            
        //keep looping until user enters a number greater than zero
        }while(weight <= 0);

        do{
            //getting shipping method for third insured package
            System.out.print("Please enter 'A' for air 'T' for truck or 'M'" + 
                    " for mail: ");
            shippingMode = input.next().toUpperCase(); 
            System.out.println();
            
            //inform user if they enter invalid shipping method
            if(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                    !MAIL.equals(shippingMode))
                System.out.println(shippingMode + " is an invalid shipping" +
                        " method, please enter a new shipping method.");

        //keep looping until user enters a valid shipping method
        }while(!AIR.equals(shippingMode) && !TRUCK.equals(shippingMode) && 
                !MAIL.equals(shippingMode));

        //filling third insured package with users info
        InsuredPackage herInsPackage = new InsuredPackage(weight, 
                shippingMode);
        
        //displaying the 3 un-insured packages
        System.out.println("First Un-Insured Package Cost:");
        System.out.println(myPackage);
        System.out.println();
        System.out.println("Second Un-Insured Package Cost:");
        System.out.println(hisPackage);
        System.out.println();
        System.out.println("Third Un-Insured Package Cost:");
        System.out.println(herPackage);
        System.out.println();
        
        //displaying the 3 insured packages
        System.out.println("First Insured Package Cost:");
        System.out.println(myInsPackage);
        System.out.println();
        System.out.println("Second Insured Package Cost:");
        System.out.println(hisInsPackage);
        System.out.println();
        System.out.println("Third Insured Package Cost:");
        System.out.println(herInsPackage);
        System.out.println();       
    }
}