
public class part_9_14_1 {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public part_9_14_1(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
