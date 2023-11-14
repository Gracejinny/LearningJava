package mission.day5_5;

public class Main {
    public static void main(String[] args) {
        // Circle 객체 생성
        Circle circle = new Circle(5.0);
        System.out.println("기본 원 색상: " + circle.getColor());
        System.out.println("기본 원 차원: " + circle.getDimension());
        circle.setColor("빨강");  // 도형의 색상 설정

        // Circle 객체 정보 출력
        System.out.println("원 반지름: " + circle.getRadius());
        System.out.println("원 지름: " + circle.calculateDiameter());
        System.out.println("원 둘레: " + circle.calculatePerimeter());
        System.out.println("원 면적: " + circle.calculateArea());
        System.out.println("원 색상: " + circle.getColor());

        System.out.println("---------------------------------------------");

        // Rectangle 객체 생성
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("기본 직사각형 색상: " + rectangle.getColor());
        System.out.println("기본 직사각형 차원: " + rectangle.getDimension());

        rectangle.setColor("파랑");  // 도형의 색상 설정


        // Rectangle 객체 정보 출력
        System.out.println("직사각형 가로 길이: " + rectangle.getWidth());
        System.out.println("직사각형 세로 길이: " + rectangle.getHeight());
        System.out.println("직사각형 대각선 길이: " + rectangle.calculateDiagonal());
        System.out.println("직사각형 면적: " + rectangle.calculateArea());
        System.out.println("직사각형 둘레길이: " + rectangle.calculatePerimeter());
        System.out.println("직사각형 색상: " + rectangle.getColor());
    }
}
/*
TIP :
공통으로 구현할 수 있는 부분은 추상클래스인 Shape,
제각각 구현해야하는 부분은 구체 클래스인 Circle, Rectangle에서 구현합니다.
원의 면적은 반지름의 제곱에 파이(π)를 곱하면 계산할 수 있습니다.
원의 지름은 반지름 * 2 곱하면 계산할 수 있습니다.
원의 둘레는 반지름에 2π를 곱하면 계산할 수 있습니다.
직사각형의 면적은 가로 길이와 세로 길이를 곱하면 계산할 수 있습니다.
직사각형의 둘레는 가로 길이와 세로 길이를 더한 후 2를 곱하면 계산할 수 있습니다.
직사각형의 대각선은 가로 길이^2 와 세로 길이^2 더한 후 제곱근을 하면 계산할 수 있습니다.
계산 하다보면 PI의 값과 제곱, 제곱근 하는 부분이 필요할 텐데요.
각각 PI: Math.PI , 제곱: Math.pow(), 제곱근: Math.sqrt() 를 이용해주세요.
* */
