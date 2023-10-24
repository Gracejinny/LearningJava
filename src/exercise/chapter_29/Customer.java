package exercise.chapter_29;

public class Customer {
    // 속성
    private long cashAmount;
    private String myFeeling;

    // 행위
    public void askCoffee(Cashier cashier, String coffeeName){
        System.out.println("손님 ; 커피" + coffeeName + "얼마인가요?");
    }

    public long withDrawCash(long amount){
        this.cashAmount -= amount;
        return amount;
    }

    public void orderCoffee(String coffeeName, boolean isWrappedUp){
        System.out.println("손님: 커피" + coffeeName + "을 주문할게요" + "단, 포장여부는" + isWrappedUp + "으로 부탁드려요.");

    }

    public void drinkCoffee(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님: 나는 커피" + coffeeName + "을 마신다.");
    }

    public void upgradeMyFeeling(){
        this.myFeeling = "기분이 좋아졌다.";
    }

    public void showMyInfo(){
        System.out.printf("손님: 지금 나의 기분은 %s하고, 현금은 %d 있습니다.", this.myFeeling, this.cashAmount);
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
