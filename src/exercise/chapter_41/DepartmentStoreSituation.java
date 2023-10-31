package exercise.chapter_41;

public class DepartmentStoreSituation {
    public static void main(String[] args) throws InterruptedException {
        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        String hello = "hello";
        String hello1 = new String("hello");
        String hello2 = new String("hello");;
        String hello3 = new String("hello");;

        Customer customer1 = new Customer("아이유");
        Customer customer2 = new Customer("이순신");

        Customer customer3 = new VIPCustomer("광해군");
        Customer customer4 = new VIPCustomer("김혜수");
        Customer customer5 = new VIPCustomer("송지효");

        Customer customer6 = new GoldCustomer("가호");
        Customer customer7 = new GoldCustomer("송강");

        Customer[] customersQueue = {
                new GoldCustomer("악동"),
        };

        // 시나리오
        for(Customer customerEach: customersQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }
        staff.printMySalesAmount();

        while (true){
            Thread.sleep(100);
        }
    }
}
