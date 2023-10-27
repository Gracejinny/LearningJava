package mission;

public class Student {
    private String name; //이름
    private int StudentID; // 학번
    private String Major; // 전공
    private int grade; // 학년

    public Student(String name, int studentID, String major, int grade) {
        this.name = name;
        StudentID = studentID;
        Major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return Major;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }
}
