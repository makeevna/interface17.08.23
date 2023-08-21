package Interface;

    class Coach implements SportsmanInfo {
        private String firstName;
        private String lastName;


        public Coach(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void displayInfo() {
            System.out.println("Coach: " + firstName + " " + lastName);
        }
    }


