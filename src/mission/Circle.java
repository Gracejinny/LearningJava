package mission;

class Circle extends Shape{
    private static final double PI = 3.14;
    private double radius;

    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }
    public void printCircleInfo() {
        super.printInfo();
        System.out.println("원의 반지름 : " + radius);
    }
}
