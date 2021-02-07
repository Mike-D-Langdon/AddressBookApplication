import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<AddressEntry> addressEntryList;

    public AddressBook() {
        addressEntryList = new ArrayList<>();
    }

    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }

    public void list() {
        for (AddressEntry e : addressEntryList) {
            System.out.println(e);
        }
    }
}
