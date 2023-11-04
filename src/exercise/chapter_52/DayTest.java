package exercise.chapter_52;

public class DayTest {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        Day firday = Day.FRIDAY;

//        System.out.println("요일 : " + monday);
//        System.out.println("요일 : " + monday.getKoreanName());
//        System.out.println("요일 : " + firday.getKoreanName());

        Day day = Day.MONDAY;

        switch (day){
            case MONDAY:
                System.out.println("한주의 시작입니다." + day.getKoreanName());
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("오늘은 평일입니다." + day.getKoreanName());
            case FRIDAY:
                System.out.println("오늘만 지나면 주말입니다." + day.getKoreanName());
            case SATURDAY:
            case SUNDAY:
                System.out.println("야호 , 오늘은 주말이다~" + day.getKoreanName());
                break;
        }

    }
}
