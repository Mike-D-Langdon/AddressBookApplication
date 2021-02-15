import java.util.ArrayList;
import java.util.List;

public final class AddressBook {

    // This is the only instance of ths class since it is a singleton class.
    private static AddressBook INSTANCE;

    List<AddressEntry> addressEntryList;

    private AddressBook() {
        addressEntryList = new ArrayList<>();
    }

    // Call this method to instantiate the singleton class.
    public static AddressBook getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AddressBook();
        }
        return INSTANCE;
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
