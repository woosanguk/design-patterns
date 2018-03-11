package patterns.template_method_09;

class Tea extends CaffeineBeverage{

    void brew() {
        System.out.println("차를 우려내는 중");
    }

    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }


}
