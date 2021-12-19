

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;


public class Main {
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", new AsianCarToyFactory());
        toyBusiness.add("helicopter", new AmericanHelicopterToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while (!line.equals("exit")){
            line = in.nextLine();
           
            switch(line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(line));
                    System.out.println("Toys list: " + toys.stream().map(c -> c.toString()).collect(Collectors.joining(", ")));
                    break;
                    
                case "exit":
                    System.out.println("exiting The Toy Box ...");
                    break;
                
                default:
                    System.out.println("Command unknown!");
            }
        }
    }
    
}
