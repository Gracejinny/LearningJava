package mission.week7_2;

public enum OrderStatus {
    PAID("주문 완료"),
    SHIPPED("배송 완료"),
    DELIVERED("배송 완료"),
    ON_ORDER("주문중"),
    NOT_PAID("결제전");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
