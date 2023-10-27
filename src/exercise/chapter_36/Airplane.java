package exercise.chapter_36;

public class Airplane implements Flyable{
    //속성
    private String airplaneID;
    private long remaininigFuelAmount;
    private long maximumCapacity;

    @Override
    public void fly() {
        System.out.println("비행기 ID(" + airplaneID + ")가 납니다.");
    }

    public Airplane(String airplaneID) {
        this.airplaneID = airplaneID;
    }

    public void refillFuel(long fuel){
        remaininigFuelAmount += fuel;
    }
}
