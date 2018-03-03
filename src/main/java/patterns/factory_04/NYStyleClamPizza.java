package patterns.factory_04;

class NYStyleClamPizza extends Pizza {
    public  NYStyleClamPizza(){
        name = "NY Style Clam Pizza";
        dought = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
