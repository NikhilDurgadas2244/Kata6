
package toys;


public class Car {
    final private Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

        
    public Integer getSerialNumber() {
        return serialNumber;
    }
        
    public void pack(){
        System.out.printf("'%d' Car packed\n", this.serialNumber);
    }
    
    public void label(){
        System.out.printf(" Car '%d' labelled\n", this.serialNumber);
    }
    
}
