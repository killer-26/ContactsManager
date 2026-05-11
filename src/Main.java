public class Main {

    public static void main(String[] args) {

        // Création du gestionnaire de contacts
        ContactsManager myContactsManager = new ContactsManager();

        // Contact 1
        Contact contact1 = new Contact();
        contact1.name = "Jean";
        contact1.phoneNumber = "0707070707";
        myContactsManager.addContact(contact1);

        // Contact 2
        Contact contact2 = new Contact();
        contact2.name = "Marc";
        contact2.phoneNumber = "0101010101";
        myContactsManager.addContact(contact2);

        // Contact 3
        Contact contact3 = new Contact();
        contact3.name = "Foto";
        contact3.phoneNumber = "0505050505";
        myContactsManager.addContact(contact3);

        // Contact 4
        Contact contact4 = new Contact();
        contact4.name = "Odilonne";
        contact4.phoneNumber = "0706060606";
        myContactsManager.addContact(contact4);

        // Contact 5
        Contact contact5 = new Contact();
        contact5.name = "Cheick";
        contact5.phoneNumber = "0709090909";
        myContactsManager.addContact(contact5);

        // Recherche d’un contact
        Contact result = myContactsManager.searchContact("Cheick");

        // Affichage du numéro
        System.out.println("Numéro de Cheick : " + result.phoneNumber);

    }
}