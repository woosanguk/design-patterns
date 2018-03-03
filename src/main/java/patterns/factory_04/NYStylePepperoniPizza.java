package patterns.factory_04;

class NYStylePepperoniPizza extends Pizza {
    public  NYStylePepperoniPizza(){
        name = "NY Style Pepperoni Pizza";
        dought = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
