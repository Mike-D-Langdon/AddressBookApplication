import java.util.*;

/**
 * This class simulates an address book using a <code>TreeMap<>()</code>.
 * It is designed to be used as a singleton object.
 * @author Michael Langdon
 * @since 02/15/2021
 */
public final class AddressBook {

    // This is the only instance of this class since it is a singleton class.
    private static AddressBook INSTANCE;

    // Using a TreeMap since the values are stored in order and retrieval/removal is quick.
    private TreeMap<String, AddressEntry> addressEntryList;

    /**
     * Sets up a list to hold entries for the address book.
     * Must be called by <code>getInstance()</code>.
     */
    private AddressBook() {
        addressEntryList = new TreeMap<>();
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
        // Entries are indexed by the last name
        addressEntryList.put(addressEntry.getLastName(), addressEntry);
    }

    /**
     * Calls the <code>toString()</code> method for each item in the address book
     * and prints it to the screen.
     */
    public void list() {
        // Create a set of the entries
        Set set = addressEntryList.entrySet();
        // Create an iterator
        Iterator iterator = set.iterator();
        // Iterate through the set
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
