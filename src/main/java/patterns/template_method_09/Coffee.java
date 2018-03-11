package patterns.template_method_09;

class Coffee extends CaffeineBeverage {

    void brew() {
        System.out.println("필터를 통해서 커피를 우려내는 중");
    }

    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }


}
