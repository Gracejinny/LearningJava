package mission.day5_5Team;

public abstract class User implements CustomerRole{
    protected String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void order() {
        System.out.println("유저("+username+")은 주문을 할 수 있습니다.");
    }

    @Override
    public void payment() {
        System.out.println("유저("+username+")은 결제를 할 수 있습니다.");
    }
}

/*[**해설]**

- 각 책임을 나타내는 인터페이스의 기능들의 구현을 어디에 할 것인지가 Key point 입니다.
- 모든 구현 클래스가 맡아야하는 인터페이스를 구현 클래스에 바로 implement 하여 할 수 도 있지만,
CustomerRole과 ReviewersRole은 **여러 객체가 해당 인터페이스를 구현해야하는 상황입니다.**
- 이 중 CustomerRole은 모든 객체가 구현해야하기 때문에 추상 클래스에 일단 구현해놓는 방법이 좋을 것 같습니다. 실제로 추상 클래스인 `User` 에 `CustomerRole` 을 작업하여 모든 구현 클래스가
해당 코드를 재사용 할 수 있도록 구현할 수 있었습니다.
- ReviwerRole의 경우 `ReviewersUser` 과 `SuperUser` 에서 해당 인터페이스를 구현해야합니다.
가만 보면, 해당 메소드들은 User의 `username` 속성을 사용하지않는 것을 알 수 있습니다.
따라서 해당 기능을 **Interface Default 에서 구현하면 중복 코드를 줄일  수 있습니다.**
- 마지막 SuperRole의 경우, `SuperUser` 만 해당 인터페이스 구현 의무를 가집니다.
따라서 해당 SuperUser에 해당 Interface 기능을 Override 하여 구현합니다.*/
