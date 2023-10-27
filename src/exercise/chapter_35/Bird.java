package exercise.chapter_35;

import exercise.chapter_36.Flyable;

public class Bird extends Animal implements Flyable {
    // 속성
    private long weight;
    private String color;

    //행위

    @Override
    public void eat(String food) {
        System.out.printf("새가 %s 을 부리로 쪼아 먹습니다.\n",food);
    }

    @Override
    public void sleep() {
        System.out.println("새가 잠을 자고있습니다.");
    }

    @Override
    public void fly(){
        System.out.println("새가 날고 있습니다.");
    }
}
