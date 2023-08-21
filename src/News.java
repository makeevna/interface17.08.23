interface Readable {
    void read();
}
abstract class News {
    String name;
    int pages;

    public News(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public abstract void displayInfo();

}


