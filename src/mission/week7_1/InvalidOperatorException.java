package mission.week7_1;

public class InvalidOperatorException extends RuntimeException{
    public InvalidOperatorException(){
        super("유효하지 않은 연산자입니다.");
    }
}
