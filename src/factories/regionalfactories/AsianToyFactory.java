
package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;


public class AsianToyFactory extends ToyFactory{

    @Override
    public Toy CreateToy(String type) {
        switch(type){
                case "car":
                    AsianCarToy car = new AsianCarToy(this.generator.next());
                    return car;
                
                case "helicopter":
                    AsianHelicopterToy helicopter = new AsianHelicopterToy(this.generator.next());
                    return helicopter;
                
                default:
                    return null;
        }
    }
    
}
