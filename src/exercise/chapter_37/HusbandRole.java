package exercise.chapter_37;

public interface HusbandRole {
    void takeCareWife(Wife wife);
    default void sayLoveEveryDay(){
        System.out.println("우리 가족 사랑합니다~");
    };

    String getName();
}
