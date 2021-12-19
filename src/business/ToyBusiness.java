
package business;

import toyproducts.Toy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();


    public void add (String type, ToyFactory toyFactory){
        toyFactories.put(type, toyFactory);
    }
    
    public Toy produceToy(String type){
        return toyFactories.get(type).produceToy(generator.next());
    }
   
}
