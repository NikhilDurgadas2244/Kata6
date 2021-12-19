
package toyproducts.models;

import toyproducts.Toy;


public class AmericanHelicopterToy implements Toy {
    final private Integer serialNumber;
    final String type = "helicopter";


    
    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

        
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public String getType() {
        return type;
    }
        
    @Override
    public void pack(){
        System.out.printf("'%d' '%s' packed\n", this.serialNumber, this.type);
    }
    
    @Override
    public void label(){
        System.out.printf(" '%s' '%d' labelled\n", this.type, this.serialNumber);
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}
