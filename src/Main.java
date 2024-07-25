public class Main {
    public static void main(String[] args) {
        ManagementPerson managmentInstance = new ManagementPerson();
        ManagementPerson managmentCodersbay = new ManagementPerson();
        Address exampleAddress = new Address(4202,"Hellmonsödt", "SomeStreet", "1b");
        Address exampleAddress2 = new Address(4202,"Hellmonsödt", "SchoolStreet", "3");
        Address addressCodersbay = new Address(4020,"Linz", "Peter-Behrens-Platz", "4");
        Sex female = Sex.FEMALE;

        managmentInstance.createPerson("Anna", "Ivanova", female, "2002-03-03", exampleAddress);
        managmentInstance.createPerson("Boris", "Stoun");
        managmentInstance.createPerson("Anna", "Ivanova", Sex.FEMALE, "2002-03-03");
        managmentInstance.createPerson("Victor", "Ivanov", Sex.MALE, "1999.01.03", exampleAddress2);

        managmentCodersbay.createPerson("Viktoria", "Bakakina", Sex.FEMALE, "1982.07.12", addressCodersbay);
        managmentCodersbay.createPerson("Ivan", "Savonov");
        managmentCodersbay.createPerson("Ludmila", "Broun",  Sex.FEMALE, "2000.02.02");
        System.out.println("managmentCodersbay:");
        managmentCodersbay.printListPerson();
        System.out.println("managmentInstance:");
        managmentInstance.printListPerson();
        System.out.println("managmentInstance:");
        managmentInstance.removePerson("Anna", "Ivanova", "2002-03-03");
        managmentInstance.printListPerson();
    }
}
