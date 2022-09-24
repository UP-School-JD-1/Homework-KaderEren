import java.util.HashSet;
import java.util.Map;

public class SearchingHelper {
    Map<Character, HashSet<Person>> data;

    public SearchingHelper(Map<Character, HashSet<Person>> data) {
        this.data = data;
    }

    private HashSet<Person> allPersons() {

        HashSet<Person> allPersons = new HashSet<Person>();

        // fulling all the persons with the same names to the allPersons set

        data.forEach((key, value) -> allPersons.addAll(value));
        return allPersons;
    }

    // searching with the names

    HashSet<Person> nameSearch(String name) {

        HashSet<Person> allPersons = allPersons();

        HashSet<Person> returnSet = new HashSet<Person>();

        for (Person same : allPersons) {
            if (same.getName() == name)
                returnSet.add(same);
        }
        return returnSet;
    }

    // searching with the last names

    HashSet<Person> lastNameSearch(String lastName) {

        HashSet<Person> returnSet = new HashSet<Person>();
        HashSet<Person> personsWithSameLastNames = data.get(lastName.charAt(0));

        // fulling all the persons with the same last names to the allPersons set

        for (Person person : personsWithSameLastNames) {

            if (lastName == person.getLastName()) {
                returnSet.add(person);
            }
        }
        return returnSet;
    }
    // searching with the addresses

    HashSet<Person> addressSearch(String address) {

        HashSet<Person> returnSet = new HashSet<Person>();
        HashSet<Person> allPersons = allPersons();

        for (Person person : allPersons) {
            for (String adrs : person.getAddresses()) {

                if (address == adrs) {
                    returnSet.add(person);
                }
            }
        }

        return returnSet;

    }

    HashSet<Person> phoneNumbersSearch(String phoneNumbers) {

        HashSet<Person> returnSet = new HashSet<Person>();
        HashSet<Person> allPersons = allPersons();

        for (Person person : allPersons) {
            for (String phneNmb : person.getPhoneNumbers()) {

                if (phoneNumbers == phneNmb) {

                    returnSet.add(person);
                }

            }
        }

        return returnSet;

    }

}
