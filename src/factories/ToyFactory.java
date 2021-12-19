package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy produceToy(String type){
        Toy toy = this.CreateToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy CreateToy(String type);
}
