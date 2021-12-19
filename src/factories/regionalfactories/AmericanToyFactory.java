
package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;


public class AmericanToyFactory extends ToyFactory{

    @Override
    public Toy CreateToy(String type) {
        switch(type){
                case "car":
                    AmericanCarToy car = new AmericanCarToy(this.generator.next());
                    return car;
                
                case "helicopter":
                    AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.generator.next());
                    return helicopter;
                
                default:
                    return null;
        }
    }
    
}
