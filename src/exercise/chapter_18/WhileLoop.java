package exercise.chapter_18;

public class WhileLoop {
    public static void main(String[] args) {
        // 1~10까지 다 더하는 while loop
        int sum = 0;
        int num = 0;

        while (num < 100){
            num = num +1; // <- 단서 구문
            sum = sum + num;
        }
        String result = String.format("모든 수를 더한 값은 %d입니다.",sum);
        System.out.println(result);
    }
}
