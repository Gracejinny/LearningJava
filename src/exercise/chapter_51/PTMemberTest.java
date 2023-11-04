package exercise.chapter_51;

public class PTMemberTest {
    public static void main(String[] args) {
        PTMemeber memeber = new PTMemeber("미철",178,70, "Male");
        try {
            memeber.setId("abcd");
        }catch (Exception e){
            // 고객에게 알람 보내기
        }
        System.out.println(memeber);
    }
}
