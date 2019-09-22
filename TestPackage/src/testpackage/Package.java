/*
 *  Derek Schunicke
 *  991295326
 *  PROG24178 - Object Oriented Programming
 */
package testpackage;

/**
 * @author derek
 */
public class Package {
    
    //variables for weight, shipping method and cost
    private double weight;
    private String shippingMode;
    private double cost;
    
    //constant variable rates for air transportation
    final static double RATE_A_8 = 2.0;
    final static double RATE_A_16 = 3.0;
    final static double RATE_A_17 = 4.5;
    
    //constant variable rates for truck transportation
    final static double RATE_T_8 = 1.5;
    final static double RATE_T_16 = 2.35;
    final static double RATE_T_17 = 3.25;
    
    //constant variable rates for mail transportation
    final static double RATE_M_8 = 0.50;
    final static double RATE_M_16 = 1.50;
    final static double RATE_M_17 = 2.15;
    
    //constant variables for the lower weight and middle weight
    final static double MIN_WEIGHT = 8;
    final static double MID_WEIGHT = 16;
    
    public Package(){}
    
    /**
     * @param weight
     * @param shippingMode 
     */
    public Package(double weight, String shippingMode){
    
        this.weight = weight;
        this.shippingMode = shippingMode;
    
    }
    
    /**
     * @param weight 
     */
    public void setWeight(int weight){
    
        this.weight = weight;
    
    }
    
    /**
     * @param shippingMode 
     */
    public void setShippingMode(String shippingMode){
    
        this.shippingMode = shippingMode;
    
    }
    
    /**
     * @return double
     */
    public double getWeight(){
    
        return weight;
    
    }
    
    /**
     * @return string
     */
    public String getShippingMode(){
    
        return shippingMode;
    
    }
    
    /**
     * @return double
     */
    public double calcCost(){
    
        //calculations for air transportation
        if("A".equals(this.getShippingMode())){
            
            //calculation for within lowest rate
            if(this.getWeight() <= MIN_WEIGHT){
            
                cost = this.weight * RATE_A_8;
            
            }
            
            //calculation for within middle weight
            else if(this.getWeight() <= MID_WEIGHT){
            
                cost = (MIN_WEIGHT * RATE_A_8) + ((this.weight - MIN_WEIGHT) * RATE_A_16);
            
            }
            
            //calculation for heavier than min and mid weights
            else{
            
                cost = (MIN_WEIGHT * RATE_A_8) + ((MID_WEIGHT - MIN_WEIGHT) * RATE_A_16) + ((this.weight - (MID_WEIGHT)) * RATE_A_17);
                
            }
            
        }
        
        //calculations for transportation
        else if("T".equals(this.getShippingMode())){
        
            //calculation within minimum weight
            if(weight <= MIN_WEIGHT){
            
                cost = this.weight * RATE_T_8;
            
            }
            
            //calculation within middle weight
            else if(weight <= MID_WEIGHT){
            
                cost = (MIN_WEIGHT * RATE_T_8) + ((this.weight - MIN_WEIGHT) * RATE_T_16);
            
            }
            
            //calculation for heavier than minimum and middle weight
            else{
            
                cost = (MIN_WEIGHT * RATE_T_8) + ((MID_WEIGHT - MIN_WEIGHT) * RATE_T_16) + ((this.weight - (MID_WEIGHT)) * RATE_T_17);
                
            }
            
        }
        
        //calculations for mail
        else{
        
            //claculation for within minimum weight
            if(weight <= MIN_WEIGHT){
            
                cost = this.weight * RATE_M_8;
            
            }
            
            //calculation for within middle weight
            else if(weight <= MID_WEIGHT){
            
                cost = (MIN_WEIGHT * RATE_M_8) + ((this.weight - MIN_WEIGHT) * RATE_M_16);
            
            }
            
            //calculation for heavier than minimum and middle weight
            else{
            
                cost = (MIN_WEIGHT * RATE_M_8) + ((MID_WEIGHT - MIN_WEIGHT) * RATE_M_16) + ((this.weight - (MID_WEIGHT)) * RATE_M_17);
                
            }
            
        }
        
        //return the cost
        return cost;
        
    }
    
    /**
     * @return double
     */
    public double getCost(){
    
        return cost = calcCost();
    
    }
    
    /**
     * @param weight
     * @param shippingMode
     * @return boolean
     */
    public boolean equals(double weight, String shippingMode){
    
        return this.weight == weight && (this.shippingMode == null ? shippingMode == null : this.shippingMode.equals(shippingMode));
    
    }
    
    /**
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj){
    
        if(obj == null)
            return false;
        else if(!(obj instanceof Package))
            return false;
    
        Package myPackage = (Package) obj;
        
        return this.weight == myPackage.getWeight() && (this.shippingMode == null ? myPackage.getShippingMode() == null : this.shippingMode.equals(myPackage.getShippingMode()));
        
    }
    
    /**
     * @return string
     */
    @Override
    public String toString(){

        return "The weight is: " + weight + " ounce(s), Shipping method is: " + shippingMode + ", Cost is: $" + String.format(java.util.Locale.US, "%.2f", getCost());

    }
    
}
