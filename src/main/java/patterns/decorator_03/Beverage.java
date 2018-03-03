package patterns.decorator_03;

abstract class Beverage {
    private static int TALL = 1;
    private static int GRANDE = 2;
    private static int BENTI = 3;

    String description = "";
    int size = TALL;

    String getDescription(){
        return description;
    }

    int getSize(){
        return size;
    }

    abstract double cost();
}
