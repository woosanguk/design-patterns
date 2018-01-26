package factory;

class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza() {
                void prepare() {

                }
            };
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza() {
                void prepare() {

                }
            };
        } else if (type.equals("clam")){
            pizza = new ClamPizza() {
                void prepare() {

                }
            };
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza() {
                void prepare() {

                }
            };
        }
        return pizza;
    }
}
