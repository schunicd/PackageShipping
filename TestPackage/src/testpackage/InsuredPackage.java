/*
 *  Derek Schunicke
 *  991295326
 *  PROG24178 - Object Oriented Programming
 */
package testpackage;

/**
 * @author derek
 */
public class InsuredPackage extends Package{
    
    //constant variables for minimum, middle and max insurance
    final static double MIN_INS = 2.45;
    final static double MID_INS = 3.95;
    final static double MAX_INS = 5.55;
    
    //constant variables for maximum and middle weight insurance costs
    final static double MAX_INS_WEIGHT = 3.01;
    final static double MID_INS_WEIGHT = 1.01;
    
    public InsuredPackage(){}
    
    /**
     * @param weight
     * @param shippingMode 
     */
    public InsuredPackage(double weight, String shippingMode){
    
        super(weight, shippingMode);
        
    }
    
    /**
     * @return double
     */
    @Override
    public double getCost(){
    
        //adding maximum insurance rate to cost
        if(getWeight() > MAX_INS_WEIGHT)
            return calcCost() + MAX_INS;
        
        //adding middle insurance rate to cost
        else if(getWeight() > MID_INS_WEIGHT)
            return calcCost() + MID_INS;
        
        //adding minimum insurance rate to cost
        else
            return calcCost() + MIN_INS;
        
    }
    
        /**
     * @param weight
     * @param shippingMode
     * @return boolean
     */
    @Override
    public boolean equals(double weight, String shippingMode){
    
        return getWeight() == weight && (getShippingMode() == null ? getShippingMode() == null : getShippingMode().equals(shippingMode));
    
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
    
        Package myInsPackage = (Package) obj;
        
        return getWeight() == myInsPackage.getWeight() && (getShippingMode() == null ? myInsPackage.getShippingMode() == null : getShippingMode().equals(myInsPackage.getShippingMode()));
        
    }
    
    /**
     * @return string
     */
    @Override
    public String toString(){
        
        return super.toString() + (" (Insurance included in price.)");
    
    }
    
}
