package exercise.chapter_43;

public class ObjectTest {
    public static void main(String[] args) {
        Customer customer = new Customer("미처리");

        System.out.println(customer);

        GoldCustomer customer1 = new GoldCustomer("철미");
        System.out.println(customer1);

        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("아이유");

        System.out.println(staff);
        System.out.println(vipCustomer);
    }
}
