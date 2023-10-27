package mission;

import java.util.Arrays;

public class ExamSituation {
    public static void main(String[] args) {
        System.out.println("학생들이 아무도 없을 때, 전체 시험 점수: " + Arrays.toString(StudnetScore.getAllScores()));

        StudnetScore student1 = new StudnetScore();

        System.out.println("학생이 한명 추가 되었을 떄, 전체 시험 점수: " + Arrays.toString(StudnetScore.getAllScores()));

        StudnetScore student2 = new StudnetScore();
        StudnetScore student3 = new StudnetScore();

        System.out.println("여러 명 추가후 전체 시험 점수: " + Arrays.toString(StudnetScore.getAllScores()));

        student1.setScore(95);
        student2.setScore(88);
        student3.setScore(55);

        System.out.println("변경된 전체 시험 점수: " + Arrays.toString(StudnetScore.getAllScores()));

        StudnetScore student4 = new StudnetScore();

        System.out.println("추가후 전체 시험 점수: " + Arrays.toString(StudnetScore.getAllScores()));

        System.out.println("Student1 점수: " + student1.getScore());
        System.out.println("Student2 점수: " + student2.getScore());
        System.out.println("Student3 점수: " + student3.getScore());
        System.out.println("Student4 점수: " + student4.getScore());
    }
    }
