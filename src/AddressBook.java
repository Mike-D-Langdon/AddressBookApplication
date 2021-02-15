import java.util.ArrayList;
import java.util.List;

/**
 * This class simulates an address book using an <code>ArrayList<>()</code>.
 * It is designed to be used as a singleton object.
 * @author Michael Langdon
 * @since 02/15/2021
 */
public final class AddressBook {

    // This is the only instance of this class since it is a singleton class.
    private static AddressBook INSTANCE;

    List<AddressEntry> addressEntryList;

    /**
     * Sets up a list to hold entries for the address book.
     * Must be called by <code>getInstance()</code>.
     */
    private AddressBook() {
        addressEntryList = new ArrayList<>();
    }

    /**
     * Calls the constructor to instantiate the address book.
     * @return an instance of the <code>AddressBook</code> class.
     */
    public static AddressBook getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AddressBook();
        }
        return INSTANCE;
    }

    /**
     * Adds an entry to the address book.
     * @param addressEntry an AddressEntry object.
     */
    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }

    /**
     * Calls the <code>toString()</code> method for each item in the address book
     * and prints it to the screen.
     */
    public void list() {
        for (AddressEntry e : addressEntryList) {
            System.out.println(e);
        }
    }
}
