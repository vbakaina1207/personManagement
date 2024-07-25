import java.util.ArrayList;
import java.util.List;

public class Management {
    private final List<Person> listPerson;

    public Management () {
        this.listPerson = new ArrayList<>();
    }

    public void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        listPerson.add(person);
    }

    public void createPerson (String firstName, String lastName, Sex sex, String dob) {
        Person person = new Person(firstName, lastName, sex, dob);
        listPerson.add(person);
    }

    public void createPerson (String firstName, String lastName, Sex sex, String dob, Address address) {
        Person person = new Person(firstName, lastName, sex, dob, address);
        listPerson.add(person);
    }

    public void removePerson (int index) {
        if(index >=0 && index < listPerson.size() )
            listPerson.remove(index);
    }


    public void print (String firstName, String lastName){
        for (Person person :  listPerson){
            System.out.println(firstName+ " " + lastName);
        }
    }
}
