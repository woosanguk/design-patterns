package patterns.decorator_03;

class Whip extends CondimentDecorator{
    Beverage beverage;

    Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    double cost() {
        return .10 + beverage.cost();
    }
}
