package patterns.decorator_03;

class Mocha extends CondimentDecorator {
    Beverage beverage;

    Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    double cost() {
        return .20 + beverage.cost();



    }
}
