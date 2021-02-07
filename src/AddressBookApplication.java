public class AddressBookApplication {
    public static void main(String[] args) {

//        Menu.prompt_FirstName();
//        Menu.prompt_LastName();
//        Menu.prompt_Street();
//        Menu.prompt_City();
//        Menu.prompt_State();
//        Menu.prompt_Zip();
//        Menu.prompt_Telephone();
//        Menu.prompt_Email();

        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);

    }

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
}
