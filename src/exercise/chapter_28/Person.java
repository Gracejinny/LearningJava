package exercise.chapter_28;

public class Person {

    //
    private String name;
    private String gender;
    private int age;

    public void showMyself(){
        System.out.printf("Person 인스턴스 : name : %s, gender : %s, age : %d\n",this.name,this.gender, this.age);

    }

    public Person(String name){
        this(name, "unknown");
    }
    public Person(String name, String gender){
        this(name, gender, -1);
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // 리턴값을 나자신의 클래스로 반환
    public Person returnMyself(){
        return this;
    }
}
