import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String lastName;

    private List<String> phoneNumbers;
    private List<String> addresses;

    @Override
    public String toString() {
        return getName() + " " + getLastName() + " - adresi: " + getAddresses();
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return p.getName() == getName() && p.getLastName() == getLastName();
    }

    public Person(String name, String lastName, List<String> phoneNumbers, List<String> addresses) {
        this.name = name;
        this.lastName = lastName;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

}
