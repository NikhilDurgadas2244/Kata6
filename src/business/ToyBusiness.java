
package business;

import toyproducts.Toy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;

public class ToyBusiness {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    final private ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }

    
    public Toy produceToy(String type){
        return this.toyFactory.produceToy(type);
    }
   
}
