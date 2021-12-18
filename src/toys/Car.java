
package toys;


public class Car {
    final private Integer serialNumber;
    final String type = "car";


    
    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

        
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public String getType() {
        return type;
    }
        
    public void pack(){
        System.out.printf("'%d' '%s' packed\n", this.serialNumber, this.type);
    }
    
    public void label(){
        System.out.printf(" '%s' '%d' labelled\n", this.type, this.serialNumber);
    }
    
}
