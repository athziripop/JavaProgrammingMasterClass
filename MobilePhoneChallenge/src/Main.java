public class Main {
    public static void main(String[] args) {
        Contact c1 = Contact.createContact("Athziri", "22222");
        Contact c2 = Contact.createContact("Luis", "23333");
        Contact c3 = Contact.createContact("Alma", "123133");

        MobilePhone mobilePhone = new MobilePhone("1111");
        mobilePhone.addNewContact(c1);
        mobilePhone.addNewContact(c2);
        mobilePhone.addNewContact(c3);

        mobilePhone.printContacts();

        Contact newC1 = Contact.createContact("Athziri", "111111");
        mobilePhone.updateContact(c1, newC1);

        mobilePhone.printContacts();

        mobilePhone.removeContact(c2);

        mobilePhone.printContacts();

        mobilePhone.addNewContact(c2);

        mobilePhone.printContacts();

        Contact newFounded = mobilePhone.queryContact("Luis");
        System.out.println("Founded: " + newFounded.getName() + " -> " + newFounded.getPhoneNumber());


        System.out.println(mobilePhone.addNewContact(c1));

        mobilePhone.printContacts();


    }

}