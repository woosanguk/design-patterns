package patterns.factory_04;

class NYStyleCheesePizza extends Pizza {
    public  NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dought = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
