package exercise.chapter_40;

public class DepartmentStoreSituation {
    public static void main(String[] args) {
        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer1 = new VIPCustomer("아이유");

        Customer[] customersQueue = {
                new Customer("이순신"), new Customer("강감찬"), new VIPCustomer("세종대왕"),
                customer1, new Customer("정약용"), new Customer("문익점"),
                customer1,  new Customer("케이"), customer1,
                new GoldCustomer("카이"), new GoldCustomer("악동"), new GoldCustomer("가호")
        };

        // 시나리오
        for(Customer customerEach: customersQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }
        staff.printMySalesAmount();
    }
}
