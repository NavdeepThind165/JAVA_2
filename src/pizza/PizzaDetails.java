package pizza;

/**
 *
 * @author navde
 */
public class PizzaDetails {
    private String topping;
    private int size;

    
    /**
     * 
     * @param topping
     * @param size 
     */
    public PizzaDetails(String topping, int size) {
        this.topping = topping;
        this.size = size;
    }

    public PizzaDetails() {
    }
    
    /**
     * 
     * @return the topping
     */
    public String getTopping() {
        return topping;
    }

    /**
     * 
     * @param topping 
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }

    /**
     * 
     * @return the size of pizza
     */
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * 
     * @param size
     * @return compares string and give out size of pizza
     */
    public String finalSize(int size) {

        if (size == 1) {
            String s1 = "Small";
            return s1;
        }
        if (size == 2) {
            String s2 = "Medium";
            return s2;
        }
        if (size == 3) {
            String s3 = "Large";
            return s3;
        }
        if(size > 3){
        
            String s4 ="We have 3 sizes only";
            return s4;
        }
        return null;
    }
   
}
