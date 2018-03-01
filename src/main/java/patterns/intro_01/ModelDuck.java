package patterns.intro_01;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    void display() {
        System.out.println("ModelDuck");
    }
}
