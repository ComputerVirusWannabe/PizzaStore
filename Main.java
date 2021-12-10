class Main {
	public static void main(String[] args) {
	    PizzaStore USstore = new AmericanPizzaStore();
        USstore.createPizza("beef");
        
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


/*
class PizzaFactory {
    public Pizza createPizza(String pizzaName) {
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

*/

abstract class PizzaStore {
    /*
     Pizza order(String pizzaType) {
        return createPizza(pizzaType);
    }
    */
    
    public abstract Pizza createPizza(String pizzaName);

}


class VietnamesePizzaStore extends PizzaStore {

    public Pizza createPizza(String pizzaName) {
        Pizza pizza = null;
        if(pizzaName == "vegie") {
            pizza = new VegiePizza();
            System.out.println("Pida cho mấy thằng ăn chay");
        } else if (pizzaName == "beef") {
            pizza = new BeefPizza();
            System.out.println("Pida con bò..");
        } else if (pizzaName == "chicken"){
            pizza = new ChickenPizza();
            System.out.println("Giết mấy con gà rồi cho tụi nó");
        } else {
            System.out.println("Cút khổi chỗ này ngay! Ỡ đay không có Pida loại đó!");
            //return null;
        }
        return pizza;
    }    
    
}

class AmericanPizzaStore extends PizzaStore {

    public Pizza createPizza(String pizzaName) {
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

