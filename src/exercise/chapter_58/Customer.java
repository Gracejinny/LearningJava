package exercise.chapter_58;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private final long serialVersionUID = 1L;
    // 속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    Customer(){}

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
    }

    Customer(String name){
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo(){
        System.out.printf("Customer(customerID=%s, name = %s, customerGrade = %s, bonusPoint = %d)\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("Customer(customerID=%s, name = %s, customerGrade = %s, bonusPoint = %d)\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof Customer){
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}