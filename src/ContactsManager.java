public class ContactsManager {

    Contact[] myFriends;
    int friendsCount;

    // Constructeur par défaut
    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Ajouter un contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Rechercher un contact
    Contact searchContact(String searchName) {

        for (int i = 0; i < friendsCount; i++) {

            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }

        }

        return null;
    }
}