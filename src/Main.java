

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;


public class Main {

    
    public static void main(String[] args) {
        AmericanToyFactory americanToyFactory = new AmericanToyFactory();
        AsianToyFactory asianToyFactory = new AsianToyFactory();
        ToyBusiness business = new ToyBusiness(asianToyFactory);
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        
        while (!line.equals("exit")){
            line = in.nextLine();
           
            switch(line){
                case "car":
                case "helicopter":
                    toys.add(business.produceToy(line));
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
