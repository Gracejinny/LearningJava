package exercise.chapter_29;

// 시나리오
// 아메리카노 커피는 물 500ml와 원두 30g으로 만들어진다.
// 아메리카노 커피는 '테이크 아웃용'으로 포장된다.
public class Coffee {
    // 속성
    private String coffeeName;
    private long waterQuantity; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp; // 포장됨 여부

    // 행위
    void beWrappedUp(){
        this.isWrappedUp = true;
    }

    // 생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }

    // getter

    public String getCoffeeName() {
        return coffeeName;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }
}
