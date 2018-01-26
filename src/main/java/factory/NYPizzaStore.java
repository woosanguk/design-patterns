package factory;

class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza() {
                void prepare() {

                }
            };
        } else if (type.equals("pepperoni")){
            return new NYStylePepperoniPizza() {
                void prepare() {

                }
            };
        } else if (type.equals("clam")){
            return new NYStyleClamPizza() {
                void prepare() {

                }
            };
        } else if (type.equals("veggie")){
            return new NYStyleVeggiePizza() {
                void prepare() {

                }
            };
        } else return null;


    }
}
