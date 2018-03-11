package patterns.template_method_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Coffee extends CaffeineBeverage {

    void brew() {
        System.out.println("필터를 통해서 커피를 우려내는 중");
    }

    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }


    private String getUserInput() {
        String answer = null;

        System.out.print("커피에 우유와 설탕을 넣어 드릴까요? (y/n) ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException ioe){
            System.err.println("IO 오류");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
