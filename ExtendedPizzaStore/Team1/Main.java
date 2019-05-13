import java.util.*;
import java.io.*;
// Sauce 
class Sauce{
    String getSauceKind(){return "Sauce";}
}

class PlumTomatoSauce extends Sauce{
    String getSauceKind(){return "PlumTomatoSauce";}
} 

class MarinaraSauce extends Sauce{
    String getSauceKind(){return "MarinaraSauce";}
}

// Dough
class Dough{
    String getDoughKind(){return "Dough";}
}

class ThickCrustDough extends Dough{
    String getDoughKind(){
        return "ThickCrustDough";
    }
}

class ThinCrustDough extends Dough{
    String getDoughKind(){
        return "ThinCrustDough";
    }
}

// IngridientFactory
class IngridientFactory{
    Sauce createSauce(){return new Sauce();}
    Dough createDough(){return new Dough();}
}

class NYIngridientFactory extends IngridientFactory{
    Sauce createSauce(){return new MarinaraSauce();}
    Dough createDough(){return new ThinCrustDough();}
}

class ChicagoIngridientFactory extends IngridientFactory{
    Sauce createSauce(){return new PlumTomatoSauce();}
    Dough createDough(){return new ThickCrustDough();}
}

// Pizza 

class Pizza{
    String getFlavor(){return "Pizza";}
    Sauce sauce;
    Dough dough;
    void addIngridient(IngridientFactory factory){
        this.sauce = factory.createSauce();
        this.dough = factory.createDough();
    }

    String getSauce(){
        return sauce.getSauceKind();
    }

    String getDough(){
        return dough.getDoughKind();
    }

}

class CheesePizza extends Pizza{
    String getFlavor(){return "Cheese";}
}
class PepperoniPizza extends Pizza{
    String getFlavor(){return "Pepperoni";}
}

class PizzaStore{
    Map<String, IngridientFactory> ingridentFactory = new HashMap<String, IngridientFactory>();
    PizzaStore(){
        ingridentFactory.put("NY", new NYIngridientFactory());
        ingridentFactory.put("Chicago", new ChicagoIngridientFactory());
    }
    void prepare(String flavor, String style){
        Pizza pizza = new Pizza();
        switch(flavor){
            case "Cheese":
                pizza = new CheesePizza();
                break;
            case "Pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                break;
        }

        IngridientFactory factory = ingridentFactory.get(style);
        pizza.addIngridient(factory);
        printPizza(pizza);
    }
    
    void printPizza(Pizza pizza){
        System.out.printf("Prepare %s Pizza with %s and %s\n", pizza.getFlavor(), pizza.getDough(), pizza.getSauce());
    }
}

public class Main{
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore();
        Scanner input = null;
        try{
            input = new Scanner(new FileReader(args[0]));
        }
        catch(IOException e){
            e.printStackTrace();
        }

        String flavor;
        String style;
        while(input.hasNext()){
            flavor = input.next();
            style = input.next();
            pizzaStore.prepare(flavor, style);
        }
    }
}
