package mission.week7_4;

public class AdminUser extends User{
    public AdminUser(String username) {
        super(username);
    }

    @Override
    public String toString() {
        return "AdminUser:" + getUsername();
    }

}
