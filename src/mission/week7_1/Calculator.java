package mission.week7_1;

public class Calculator {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 =0;
        int num2 =0;
        char operator = '\0';

        try {
            // 숫자1 입력
            num1 = 20;

            // 숫자2 입력
            num2 = 2;
            // 연산자 입력
            operator = '*';
            // calculate 메소드 호출
            int result = calculate(num1, num2, operator);
            // 결과 출력
            System.out.println(result);

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }
    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        int result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    throw new DivideByZeroException();
                }
                result = num1/num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        return result;
    }
}
