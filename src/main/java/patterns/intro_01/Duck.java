package patterns.intro_01;

abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    void swim(){
        System.out.println("swim");
    };

    abstract void display();

    void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    void performQuack() {
        System.out.println(quackBehavior.quack());
    }

    void performFly(){
        System.out.println(flyBehavior.fly());
    }
}
