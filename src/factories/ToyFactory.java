package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    
    
    public Toy produceToy(Integer serialNumber){
        Toy toy = this.CreateToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy CreateToy(Integer serialNumber);
}
