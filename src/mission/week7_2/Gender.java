package mission.week7_2;

public enum Gender {
    Male("male"),
    Female("female");

    private String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }
}
