package Interface;
import java.time.LocalDate;
import java.time.Period;
    class Goalkeeper extends Sportsman {

        private String firstName;
        private String lastName;
        LocalDate birthDate;
        private double height;
        private double weight;

        public Goalkeeper(String firstName, String lastName, LocalDate birthDate, double height, double weight) {
            super(firstName, lastName, birthDate, height, weight);
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Goalkeeper{");
            sb.append("firstName='").append(firstName).append('\'');
            sb.append(", lastName='").append(lastName).append('\'');
            sb.append(", birthDate=").append(birthDate);
            sb.append(", height=").append(height);
            sb.append(", weight=").append(weight);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public void displayInfo() {


        }


//        @Override
//        public void displayInfo() {
//            System.out.println("Goalkeeper: " + firstName + " " + lastName +
//                    ", Age: " + Period.between(birthDate, LocalDate.now()).getYears() +
//                    ", Height: " + height + " cm, Weight: " + weight + " kg");
//        }
    }