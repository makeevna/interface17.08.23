public class Main {
    public static void main(String[] args) {
        News[] newsArray = new News[3];
        newsArray[0] = new Newspaper(" Daily Times", 12);
        newsArray[1] = new Magazine("Tech Review", 16);
        newsArray[2] = new Gadget("Gadget World", 9);

        for (News news : newsArray) {
            news.displayInfo();
            System.out.println(news);
        }
    }
}