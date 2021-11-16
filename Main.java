class Main {
	public static void main(String[] args) {
	    PizzaStore store = new PizzaStore(new PizzaFactory());
        store.order("rety");
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
        Pizza pizza = null;
        if(pizzaName == "vegie") {
            pizza = new VegiePizza();
            System.out.println("Pizza for the vegans...");
        } else if (pizzaName == "beef") {
            pizza = new BeefPizza();
            System.out.println("Beef pizza comin' right up...");
        } else if (pizzaName == "chicken"){
            pizza = new ChickenPizza();
            System.out.println("Here comes the chicken pizza");
        } else {
            System.out.println("We don't serve such pizzas here valued customer..");
            //return null;
        }
        return pizza;
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