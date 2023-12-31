

class Magazine extends News implements Readable {
    public Magazine(String name, int pages) {
        super(name, pages);
    }

    public void read() {
        System.out.println("Reading the magazine: " + name);
    }

    public void displayInfo() {
        System.out.println("Magazine - Name: " + name + ", Pages: " + pages);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Magazine{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
