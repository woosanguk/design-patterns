package patterns.decorator_03;

class HouseBlend extends Beverage {
    HouseBlend(){
        description = "HouseBlend";
    }
    double cost() {
        return .89;
    }
}
