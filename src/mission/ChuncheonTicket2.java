package mission;

public class ChuncheonTicket2 {
    public static void main(String[] args) {
        int ticket = 1111;
        int count = ticket / 4;
        int remain = ticket % 4;

        System.out.println("티켓을 가져 갈수 있는 근무자들 수는? " + count);
        System.out.println("티켓을 다 나눠주고, 남는 티켓 수는? " + remain);
    }
}
