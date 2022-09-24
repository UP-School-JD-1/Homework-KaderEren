import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PersonTest {
    public static void main(String[] args) {

        // Kader'in bilgileri
        ArrayList<String> phoneNumbers1 = new ArrayList<String>();
        ArrayList<String> addresses1 = new ArrayList<String>();
        phoneNumbers1.add("05343443434");
        addresses1.add("bornova");
        addresses1.add("antalya");
        Person kader = new Person("kader", "eren", phoneNumbers1, addresses1);

        ArrayList<String> phoneNumbers8 = new ArrayList<String>();
        ArrayList<String> addresses8 = new ArrayList<String>();
        phoneNumbers8.add("0539945687");
        addresses8.add("istanbul");
        addresses8.add("ısparta");
        Person kader2 = new Person("kader", "eren", phoneNumbers8, addresses8);

        // Baris'in bilgileri

        ArrayList<String> phoneNumbers7 = new ArrayList<String>();
        ArrayList<String> addresses7 = new ArrayList<String>();
        phoneNumbers7.add("05343662424");
        addresses7.add("bölge");
        Person baris = new Person("baris", "akdül", phoneNumbers7, addresses7);

        // mehmet'in bilgileri
        ArrayList<String> phoneNumbers3 = new ArrayList<String>();
        ArrayList<String> addresses3 = new ArrayList<String>();
        phoneNumbers3.add("05345697852");
        addresses3.add("bornova");
        addresses3.add("anayazi");
        Person mehmet = new Person("mehmet", "nuraydin", phoneNumbers3, addresses3);

        // Ali'in bilgileri
        ArrayList<String> phoneNumbers4 = new ArrayList<String>();
        ArrayList<String> addresses4 = new ArrayList<String>();
        phoneNumbers4.add("05353229878");
        addresses4.add("konak");
        Person ali = new Person("kader", "nuraydin", phoneNumbers4, addresses4);

        // Zehra'nin bilgileri
        ArrayList<String> phoneNumbers5 = new ArrayList<String>();
        ArrayList<String> addresses5 = new ArrayList<String>();
        phoneNumbers5.add("02564321456");
        addresses5.add("karsiyaka");
        Person zehra = new Person("zehra", "ey", phoneNumbers5, addresses5);

        // ayse'nin bilgileri
        ArrayList<String> phoneNumbers6 = new ArrayList<String>();
        ArrayList<String> addresses6 = new ArrayList<String>();
        phoneNumbers6.add("02574321456");
        addresses6.add("manisa");
        Person ayse = new Person("ayse", "eren", phoneNumbers6, addresses6);

        Map<Character, HashSet<Person>> data = new HashMap<>();

        ArrayList<Person> liste = new ArrayList<Person>();

        liste.add(kader);
        liste.add(mehmet);
        liste.add(ali);
        liste.add(zehra);
        liste.add(ayse);
        liste.add(baris);
        liste.add(kader2);

        // fulling the date collection with classification by the first letter of the
        // last name
        for (Person a : liste) {
            HashSet<Person> value = new HashSet<Person>();
            Character key = a.getLastName().charAt(0);
            if (data.get(key) != null) {
                value = data.get(key);
            }
            value.add(a);
            data.put(key, value);

        }

        // the person's whoose first letter of their last name is "e"

        System.out.println("\n Soyadinin bas harfi e ile baslayanlar: " + data.get('e'));

        // the person's whoose first letter of their last name is "a"

        System.out.println("\n Soyadinin bas harfi a ile baslayanlar: " + data.get('a'));

        SearchingHelper searcher = new SearchingHelper(data);

        // the person's whoose name is equal to kader.

        HashSet foundNames = searcher.nameSearch("kader");

        System.out.println("\n foundNames : " + foundNames);

        // the person's whoose last name is equal to eren.

        HashSet foundLastNames = searcher.lastNameSearch("eren");

        System.out.println("\n foundLastNames : " + foundLastNames);

        // the person's whoose address is equal to bornova.

        HashSet foundAddress = searcher.addressSearch("bornova");

        System.out.println("\n foundAddress : " + foundAddress);

        // the person's whoose phoneNumber is equal to 05353229878.

        HashSet foundPhoneNumber = searcher.phoneNumbersSearch("05353229878");

        System.out.println("\n foundPhoneNumber : " + foundPhoneNumber);

    }

}
