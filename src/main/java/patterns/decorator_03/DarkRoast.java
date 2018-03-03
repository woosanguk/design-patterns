package patterns.decorator_03;

class DarkRoast extends Beverage {
    DarkRoast() {
        description = "DarkRoast";
    }

    double cost() {
        return .99;
    }
}
