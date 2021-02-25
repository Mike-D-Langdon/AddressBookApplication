import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests all the methods of the Menu class
 */
class MenuTest {
    // Set up an AddressBook to test with
    static AddressBook ab = AddressBook.getInstance();

    /**
     * Tests if 'f' (the default return value) is returned.
     * @throws IOException
     */
    @Test
    void testDisplayMenu_ReturnsDefaultChar() throws IOException {
        assertEquals('f', Menu.displayMenu());
    }

    /**
     * Tests that an exception is thrown.
     */
    @Test
    void testDisplayMenu_ThrowsException() {
        Exception exception = assertThrows(IOException.class, () ->
                Menu.displayMenu());
        assertEquals("char expected", exception.getStackTrace());
    }


    @Test
    void testLoadSelected_LoadsFile() throws IOException {

    }

    @Test
    void addSelected() {
    }

    @Test
    void removeSelected() {
    }

    @Test
    void findSelected() {
    }

    @Test
    void listSelected() {
    }

    @Test
    void quitSelected() {
    }

    @Test
    void prompt_FirstName() {
    }

    @Test
    void prompt_LastName() {
    }

    @Test
    void prompt_Street() {
    }

    @Test
    void prompt_City() {
    }

    @Test
    void prompt_State() {
    }

    @Test
    void prompt_Zip() {
    }

    @Test
    void prompt_Telephone() {
    }

    @Test
    void prompt_Email() {
    }
}