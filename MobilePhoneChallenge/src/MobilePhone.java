import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) < 0 && findContact(contact.getName()) < 0){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact currentContact, Contact newContact){
        int position = findContact(currentContact);
        if(position < 0){
            return false;
        }
        myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){
            return false;
        }
        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (Contact contact : myContacts){
            if(contact.getName().equals(contactName)){
                return myContacts.indexOf(contact);
            }
        }
      return -1;
    }

    public Contact queryContact(String contactName){
        int position = findContact(contactName);
        if(position >= 0){
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i =0; i < myContacts.size();i++){
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
