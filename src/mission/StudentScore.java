package mission;

import java.util.Arrays;

public class StudentScore {

    // static
    private static int serialIndex;
    private static int[] allScores;

    private int myIndex;
    private int score;

    // static 메소드
    public static int[] getAllScores() {
        return allScores;
    }

    private static void initializeAllScore(int score){
        allScores = new int[]{score};
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex] = score;
    }

    public StudentScore(int score) {
        this.myIndex = serialIndex++;
        this.score = score;
        addAllScore(score);
    }

    private static void addAllScore(int score) {
        if(allScores == null){
            initializeAllScore(score);
            return;
        }
        int length = allScores.length;
        allScores = Arrays.copyOf(allScores, length +1);
        allScores[length] = score;
    }
}