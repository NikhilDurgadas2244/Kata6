
package toys;

import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;
import java.util.stream.Collectors;
import toyproducts.Toy;

public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy createToy(String type) {
        switch(type){
                case "car":
                    CarToy car = new CarToy(this.generator.next());
                    car.pack();
                    car.label();
                    return car;
                
                case "helicopter":
                    HelicopterToy helicopter = new HelicopterToy(this.generator.next());
                    helicopter.pack();
                    helicopter.label();
                    return helicopter;
                
                default:
                    return null;
        }
    }

    public HelicopterToy createToy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
