
    class Newspaper extends News implements Readable {

    private String name;
    private int pages;

        public Newspaper(String name, int pages) {
            super(name, pages);
        }

        public void read() {
            System.out.println("Reading the newspaper: " + name);
        }

        public void displayInfo() {
            System.out.println("Newspaper - Name: " + name + ", Pages: " + pages);
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Newspaper{");
            sb.append("name='").append(name).append('\'');
            sb.append(", pages=").append(pages);
            sb.append('}');
            return sb.toString();
        }
    }

