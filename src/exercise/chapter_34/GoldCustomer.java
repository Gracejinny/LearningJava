package exercise.chapter_34;

public class GoldCustomer extends Customer{

    private double discountRatio;

    static{
        System.out.println("Gold Customer 클래스가 로딩됩니다.");
    }

    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    GoldCustomer(String name){
        super();
        this.customerID = "Customer" + Customer.serialNums++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
        this.bonusPointRatio = 0.03;
    }
}
