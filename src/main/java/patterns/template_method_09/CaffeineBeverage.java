package patterns.template_method_09;

abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }

    }



    abstract void brew();

    abstract void addCondiments();

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }
    private boolean customerWantsCondiments(){
        return true;
    }
}
