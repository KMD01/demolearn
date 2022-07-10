package academy.zad7_invitations_homework;

public class Invitation {

private String firstName;
private String lastName;
private InvitationType invitationType;

    public Invitation(String firstName, String lastName, InvitationType invitationType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invitationType = invitationType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public InvitationType getInvitationType() {
        return invitationType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setInvitationType(InvitationType invitationType) {
        this.invitationType = invitationType;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", invitationType=" + invitationType +
                '}';
    }
}
