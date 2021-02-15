import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Driver class for setting up an address book.
 * @author Michael Langdon
 * @since 02/15/2021
 */
public class AddressBookApplication {
    /**
     * The main method.  This calls the other methods to initialize the address book.
     * @param args Command line arguments.  Not used.
     */
    public static void main(String[] args) {
        AddressBook ab = AddressBook.getInstance();
        try {
            init("/Users/room237/Desktop/Spring2021/CS401/AddressBookApplication/src/file_with_addresses.txt", ab);
            ab.list();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hard-coded entries that are then added to the address book.  Only used to test.
     * @param addressBook The address book instance to add the entries to.
     */
    public static void initAddressBookExercise(AddressBook addressBook) {
        AddressEntry addressEntry1 = new AddressEntry("Peggy",
                "Sue", "123 Broadway St.", "Missoula",
                "MO", 44354, "498-355-8675", "p.sue@email.com");
        AddressEntry addressEntry2 = new AddressEntry("Tammy",
                "Lee", "44 Main St.", "Salem",
                "TX", 77334, "266-857-2109", "t.lee@email.com");
        addressBook.add(addressEntry1);
        addressBook.add(addressEntry2);

        addressBook.list();
    }

    /**
     * Initializes an address book from a given file.
     * @param filename Name of the file containing address entries.  Given as a <code>String</code>
     * @param addressBook The instance of the address book to add the entries to.
     * @throws IOException If file is not found or bad input is given an exception is thrown.
     */
    public static void init(String filename, AddressBook addressBook) throws IOException {
        // Stores a single line read from the file.
        String line;
        // Stores the first name, given on first (9th, 17th...) line of file, if valid.
        String lineFirstName;
        // Stores the last name, given on second (10th, 18th...) line of file, if valid.
        String lineLastName;
        // Stores the street, given on third (11th, 19th...) line of file, if valid.
        String lineStreet;
        // Stores the city, given on the fourth (12th, 20th...) line of file, if valid.
        String lineCity;
        // Stores the state, given on the fifth (13th, 21st...) line of file, if valid.
        String lineState;
        // Stores the zip, given on the sixth (14th, 22nd...) line of file, if valid.
        Integer lineZip;
        // Stores the phone number, given on the seventh (15th, 23rd...) line of file, if valid.
        String linePhone;
        // Stores the email, given on the eighth (16th, 24th...) line of file, if valid.
        String lineEmail;

        // Open file with FileReader
        FileReader fileReader = new FileReader(filename);
        // Create BufferedReader from FileReader
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            // Read contents of file until end of file
            while ((line = bufferedReader.readLine()) != null) {
                if (firstNameIsValid(line)) {
                    lineFirstName = line;
                    // Input is valid so get the next line.
                    line = bufferedReader.readLine();
                }
                else throw new IOException();

                if (lastNameIsValid(line)) {
                    lineLastName = line;
                    // Input is valid so get the next line.
                    line = bufferedReader.readLine();
                }
                else throw new IOException();
                if (streetIsValid(line)) {
                    lineStreet = line;
                    // Input is valid so get the next line.
                    line = bufferedReader.readLine();
                }
                else throw new IOException();
                if (cityIsValid(line)) {
                    lineCity = line;
                    // Input is valid so get the next line.
                    line = bufferedReader.readLine();
                }
                else throw new IOException();
                if (stateIsValid(line)) {
                    lineState = line;
                    // Input is valid so get the next line.
                    line = bufferedReader.readLine();
                }
                else throw new IOException();
                if (zipIsValid(line)) {
                    // Must first convert string value in line to Integer.
                    lineZip = Integer.valueOf(line);
                    // Input is valid so get the next line.
                    line = bufferedReader.readLine();
                }
                else throw new IOException();
                if (phoneIsValid(line)) {
                    linePhone = line;
                    // Input is valid so get the next line.
                    line = bufferedReader.readLine();
                }
                else throw new IOException();
                if (emailIsValid(line)) {
                    lineEmail = line;
                }
                else throw new IOException();
                // Call AddressEntry constructor for this group of related lines.
                AddressEntry addressEntry = new AddressEntry(lineFirstName, lineLastName, lineStreet, lineCity, lineState, lineZip,
                        linePhone, lineEmail);
                // Add this entry to the address book.
                addressBook.add(addressEntry);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Close streams
        bufferedReader.close();
        fileReader.close();
    }

    /**
     * Checks if the first name is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean firstNameIsValid(String line) {
        return (line != null);
    }

    /**
     * Checks if last name is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean lastNameIsValid(String line) {
        return (line != null);
    }

    /**
     * Checks if street address is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean streetIsValid(String line) {
        return (line != null);
    }

    /**
     * Checks if city is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean cityIsValid(String line) {
        return (line != null);
    }

    /**
     * Checks if state is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean stateIsValid(String line) {
        return (line != null);
    }

    /**
     * Checks if zip code is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean zipIsValid(String line) {
        return (line != null);
    }

    /**
     * Checks if phone number is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean phoneIsValid(String line) {
        return (line != null);
    }

    /**
     * Checks if email is valid.
     * @param line Current line read from the file.  A <code>String</code>
     * @return True if valid.  False if not.
     */
    private static boolean emailIsValid(String line) {
        return (line != null);
    }
}
