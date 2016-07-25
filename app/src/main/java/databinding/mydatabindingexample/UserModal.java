package databinding.mydatabindingexample;

/**
 * Created by Trayambak Mishra on 7/25/2016.
 */
public class UserModal {
    public final String firstName;
    public final String lastName;

    public UserModal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
