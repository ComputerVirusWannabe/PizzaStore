class Main {
	public static void main(String[] args) {
	    PizzaFactory factory = new PizzaFactory();
	    PizzaStore store = new PizzaStore(factory);
        store.order("bnonggggges");
	}
}

abstract class Pizza {
    abstract public void prepare();
    abstract public void bake();
}

class VegiePizza extends Pizza {
    public void prepare () {
        
    }
    public void bake() {
        
    }
}

class BeefPizza extends Pizza {
    public void prepare () {
        
    }
    public void bake() {
        
    }
}



class ChickenPizza extends Pizza {
    public void prepare () {
        
    }
    public void bake() {
        
    }
}

class PizzaFactory {
    public Pizza makePizza(String pizzaName) {
        if(pizzaName == "vegie") {
            VegiePizza vegie = new VegiePizza();
            System.out.println("Pizza for the vegans...");
            return vegie;
        } else if (pizzaName == "beef") {
            BeefPizza beef = new BeefPizza();
            System.out.println("Beef pizza comin' right up...");
            return beef;
        } else if (pizzaName == "chicken"){
            ChickenPizza chicken = new ChickenPizza();
            System.out.println("Here comes the chicken pizza");
            return chicken;
        } else {
            System.out.println("We don't serve such pizzas here valued customer..");
            return null;
        }
    }
}

class PizzaStore {
    PizzaFactory factory;
    public PizzaStore (PizzaFactory factory) {
        this.factory = factory;
    }
    
    Pizza order(String pizzaType) {
        return factory.makePizza(pizzaType);
    }
}