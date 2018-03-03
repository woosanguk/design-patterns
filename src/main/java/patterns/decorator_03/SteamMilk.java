package patterns.decorator_03;

class SteamMilk extends CondimentDecorator{
    Beverage beverage;

    SteamMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", SteamMilk";
    }

    double cost() {
        return .10 + beverage.cost();
    }
}
