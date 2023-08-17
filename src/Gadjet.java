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
}