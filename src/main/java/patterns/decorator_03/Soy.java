package patterns.decorator_03;

class Soy extends CondimentDecorator{
    Beverage beverage;

    Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    double cost() {
        return .15 + beverage.cost();
    }
}
