package Interface;
import java.time.LocalDate;

interface SportsmanInfo {
    void displayInfo();
}

abstract class Sportsman implements SportsmanInfo {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;
    protected double height;
    protected double weight;

    public Sportsman(String firstName, String lastName, LocalDate birthDate, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
    }

    public abstract void displayInfo();
}


