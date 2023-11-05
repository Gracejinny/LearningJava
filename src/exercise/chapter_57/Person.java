package exercise.chapter_57;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    //
    private String name;
    private String gender;
    private transient int age; // 직렬화할 때 숨기고자 할 때 transient 입력

    private String country;
    private String occupation;

    public void showMyself(){
        System.out.printf("Person 인스턴스 : name : %s, gender : %s, age : %d\n",this.name,this.gender, this.age);
    }

    public Person(String name){
        this(name, "unknown");
    }
    public Person(String name, String gender){
        this(name, gender, -1, "korea",null);
    }

    public Person(String name, String gender, int age, String country, String occupation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    // 리턴값을 나자신의 클래스로 반환
    public Person returnMyself(){
        return this;
    }
}
