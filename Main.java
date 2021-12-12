// Very first Pizza Factory class

class Main {
	public static void main(String[] args) {
	    PizzaStore pizza_store = new VNPizzaStore();
        pizza_store.order("beef");
	}
}

abstract class Pizza {
 
}
 
class VNVegiePizza extends Pizza {
 
}
 
class VNBeefPizza extends Pizza {
 
}
 
class USVegiePizza extends Pizza {
 
}
 
 
class USBeefPizza extends Pizza {
 
}

abstract class PizzaStore {
    public abstract Pizza createPizza(String taste);
    /* 
    {
        Pizza pizza = null;
        if(style == "american" && taste == "vegie") {
            pizza = new USVegiePizza();
            System.out.println("Pizza for the vegans...");
        } else if (style == "american" && taste == "beef") {
            pizza = new USBeefPizza();
            System.out.println("Beefy bois are always the tastiest!");
        } else if (style == "vietnamese" && taste == "vegan"){
            pizza = new VNVegiePizza();
            System.out.println("Nướng cái pida cho mấy thằng ăn chay!");
        } else if (style == "vietnamese" && taste == "beef") {
            pizza = new VNBeefPizza();
            System.out.println("Nướng cho tụi nó vài miếng thịt bò rồi biểu nó cút xéo.");

        } else {
            System.out.println("An error has occured. If you have a grievance, just sue us. We dare you.");
            //return null;
        }
        return pizza;
    } 
    */
    
    Pizza order(String taste) {
        return createPizza(taste);
    }
}


class VNPizzaStore extends PizzaStore {
    public Pizza createPizza (String taste) {
        Pizza pizza = null;
        if (taste == "beef") {
            pizza = new VNBeefPizza();
            System.out.println("Cho tụi nó vài miếng thịt bò rồi hốt xác nó.");
        } else if (taste == "vegie") {
            pizza = new VNVegiePizza();
            System.out.println("Nướng cái pida cho mấy thằng ăn chay!");
        } else {
            System.out.println("Ở đây không có pida loại đó! Xéo!");
        }
        return pizza;
    }
}

class USPizzaStore extends PizzaStore {
    public Pizza createPizza (String taste) {
        Pizza pizza = null;
        if (taste == "beef") {
            pizza = new USBeefPizza();
            System.out.println("Beefy bois are always the tastiest!");
        } else if (taste == "vegie") {
            pizza = new USVegiePizza();
            System.out.println("Pizza for the vegans...");
        } else {
            System.out.println("An error has occured. If you have a grievance, just sue us. We dare you.");
        }
    return pizza;
    }
}
