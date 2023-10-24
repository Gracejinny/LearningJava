package mission;

public class ChuncheonTicket3 {
    public static void main(String[] args) {
        final int SENIOR_AGE_STANDARD = 65;
        String country = "KOREA";

        int aliceAge = 70;
        String aliceCountry = "USA";
        int kimAge = 65;
        String kimCountry = "KOREA";
        int yooAge = 42;
        String yooCountry = "KOREA";

        boolean aliceDiscount = (SENIOR_AGE_STANDARD <= aliceAge) && (country == aliceCountry);
        boolean kimDiscount = (SENIOR_AGE_STANDARD <= kimAge) && (country == kimCountry);
        boolean yooDiscount = (SENIOR_AGE_STANDARD <= yooAge) && (country == yooCountry);

        System.out.println(aliceDiscount);
        System.out.println(kimDiscount);
        System.out.println(yooDiscount);

    }
}
