package patterns.factory_04;

class NYStyleVeggiePizza extends Pizza {
    public  NYStyleVeggiePizza(){
        name = "NY Style Veggie Pizza";
        dought = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
