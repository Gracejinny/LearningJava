package mission.day8_1;

public class Book {
    private String title;
    private String author;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("책 제목: " + title + "이고, 작가는 " + author + "입니다.");
    }
}
