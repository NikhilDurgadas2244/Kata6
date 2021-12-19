
package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianHelicopterToy;


public class AsianHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy CreateToy(Integer serialNumber) {
        return new AsianHelicopterToy(serialNumber);
    }
    
}
