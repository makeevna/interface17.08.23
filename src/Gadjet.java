
class Gadget extends News implements Readable {
    public Gadget(String name, int pages) {
        super(name, pages);
    }

    public void read() {
        System.out.println("Reading the gadget news: " + name);
    }

    public void displayInfo() {
        System.out.println("Gadget - Name: " + name + ", Pages: " + pages);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Gadget{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}