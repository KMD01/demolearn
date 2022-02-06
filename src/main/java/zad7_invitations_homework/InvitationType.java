package sda;

public enum InvitationType {
    SINGLE(1),
    DOUBLE(2);

    private int personNumber;

    InvitationType(int personNumber) {
        this.personNumber = personNumber;
    }

    public int getPersonNumber() {
        return  personNumber;
    }
}
