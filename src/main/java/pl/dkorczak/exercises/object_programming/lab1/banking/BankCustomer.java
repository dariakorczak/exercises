package pl.dkorczak.exercises.object_programming.lab1.banking;

public class BankCustomer {

    private Person person;

    public BankCustomer(Person person) {
        this.person = person;
    }

    public String toString() {
        return String.format("Klient: %s stan konta %.1f", person.getName(), 500.0);
    }
}
