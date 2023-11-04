package exercise.chapter_52;

public enum Day {
    SUNDAY("일요일"),
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일");

    private final String KoreanName;

    Day(String koreanName) {
        this.KoreanName = koreanName;
    }

    public String getKoreanName() {
        return KoreanName;
    }
}
