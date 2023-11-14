package mission.day6_4;

abstract class YoungGroupCollegeStudent extends CollegeStudent {
    public YoungGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "YoungGroupCollegeStudent{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

}
