public class Newspaper extends News implements Readable{
    public Newspaper(String name, int pages) {
        super(name, pages);
    }

  public void read(){
      System.out.println("Reading the newspaper"+ name);

    }
    public void displayInfo(){
        System.out.println("Newspaper - Name" + name + ",Pages"+ pages);
    }
}
