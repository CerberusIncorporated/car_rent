package by.yukhnevich.carsharing.entity.user;

import java.util.Objects;

public class UserDetails {
    private Long id;
    private User user;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String middleName;

    public UserDetails(Long id, User user, String phoneNumber, String firstName, String lastName, String middleName) {
        this.id = id;
        this.user = user;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public UserDetails(Long id, User user, String phoneNumber, String firstName, String lastName) {
        this.id = id;
        this.user = user;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails details = (UserDetails) o;
        return Objects.equals(id, details.id) && Objects.equals(user, details.user) && Objects.equals(phoneNumber, details.phoneNumber) && Objects.equals(firstName, details.firstName) && Objects.equals(lastName, details.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, phoneNumber, firstName, lastName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDetails{");
        sb.append("id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
