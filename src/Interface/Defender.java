package Interface;
import java.time.LocalDate;
import java.time.Period;

    class Defender extends Sportsman {
        private String firstName;
        private String lastName;
        LocalDate birthDate;
        private double height;
        private double weight;

        public Defender(String firstName, String lastName, LocalDate birthDate, double height, double weight) {
            super(firstName, lastName, birthDate, height, weight);
        }

        @Override
        public void displayInfo() {
            System.out.println("Defender: " + firstName + " " + lastName +
                    ", Age: " + Period.between(birthDate, LocalDate.now()).getYears() +
                    ", Height: " + height + " cm, Weight: " + weight + " kg");
        }
    }