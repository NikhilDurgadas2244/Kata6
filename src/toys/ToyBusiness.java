
package toys;

import java.util.stream.Collectors;

public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Car createCar() {
        Car car = new Car(this.generator.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter() {
        Helicopter helicopter = new Helicopter(this.generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
    
    
}
