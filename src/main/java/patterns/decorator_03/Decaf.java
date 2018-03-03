package patterns.decorator_03;

class Decaf extends Beverage {
    Decaf(){
        description = "Decaf";
    }

    double cost() {
        return 0;
    }
}
