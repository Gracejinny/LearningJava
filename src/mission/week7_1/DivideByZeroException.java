package mission.week7_1;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(){
        super("0으로 나눌 수 없습니다.");
    }

}
