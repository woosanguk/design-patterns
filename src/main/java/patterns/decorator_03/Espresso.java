package patterns.decorator_03;

class Espresso extends Beverage{
    Espresso(){
        description = "Espresso";
    }

    double cost() {
        return 1.99;
    }
}
