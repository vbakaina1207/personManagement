import java.util.ArrayList;
import java.util.List;

public class ManagementPerson {

    private final List<Person> listPerson;

    public ManagementPerson () {

        this.listPerson = new ArrayList<>();
    }

    public void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        if (findPerson(firstName, lastName) == null)
            listPerson.add(person);
        else
            System.out.println("The person already exists");
    }

    public void createPerson (String firstName, String lastName, Sex sex, String dob) {
        Person person = new Person(firstName, lastName, sex, dob);
        if (findPerson(firstName, lastName, dob) == null)
            listPerson.add(person);
        else
            System.out.println("The person " + person.getFirstName() + " " + person.getLastName() + " " + person.getDob() + " already exists");
    }

    public void createPerson (String firstName, String lastName, Sex sex, String dob, Address address) {
        Person person = new Person(firstName, lastName, sex, dob, address);
        if (findPerson(firstName, lastName, dob) == null)
            listPerson.add(person);
        else
            System.out.println("The person already exists");
    }

    private Person findPerson (String firstName, String lastName, String dob) {
        for(Person person: listPerson) {
            if(person.getFirstName().equals(firstName) && person.getLastName().equals(lastName) && person.getDob().equals(dob))
                return  person;
        }
        return  null;
    }

    private Person findPerson (String firstName, String lastName) {
        for(Person person: listPerson) {
            if(person.getFirstName().equals(firstName) && person.getLastName().equals(lastName))
                return  person;
        }
        return  null;
    }
    public void removePerson (String firstName, String lastName, String dob) {
        Person person = findPerson(firstName, lastName, dob);
        if (person != null)
            listPerson.remove(person);
        else
            System.out.println("Person not found");
    }

    public void printListPerson() {
        for (Person person :  listPerson){
            System.out.println(person.getFirstName()+ " " + person.getLastName());
        }
    }
}
