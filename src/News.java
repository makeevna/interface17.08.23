abstract class News {
    String name;
    int pages;

    public News(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    abstract void displayInfo();
}


