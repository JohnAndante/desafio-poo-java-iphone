package system;

public interface ContactList {
    void addContact(String name, String number);

    void removeContact(String name);

    void updateContact(String name, String number);

    void searchContact(String name);

    void listContacts();

    void callContact(String name);

    void messageContact(String name, String message);

    void blockContact(String name);
}
