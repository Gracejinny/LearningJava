package mission.day5_5Team;

public class SuperUser extends User implements CustomerRole, ReviewerRole, AdminRole{

    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void manageUsers() {
        System.out.println("슈퍼유저("+username+")은 유저를 매니징 할 수 있습니다.");

    }

    @Override
    public void changeSettings() {
        System.out.println("슈퍼유저("+username+")은 세팅을 변경할 수 있습니다.");

    }

    @Override
    public void order() {

    }

    @Override
    public void payment() {

    }

    @Override
    public void writeReview() {

    }

    @Override
    public void giveRating() {

    }
}