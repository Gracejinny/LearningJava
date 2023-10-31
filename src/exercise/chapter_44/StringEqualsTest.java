package exercise.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";

        System.out.println(str1 == str2); // 주소 비교 : True
        System.out.println(str1.equals(str2)); // 값 비교 : True

        String str3 = new String("Cat");
        String str4 = new String("Cat");

        System.out.println(str3.equals(str4)); // 값 비교 : true
        System.out.println(str3 == str4); // 주소 비교 : false

        // str1, str3
        System.out.println(str3.equals(str1));
        System.out.println(str3 == str1);
    }
}
