package Interface;
import java.time.LocalDate;
import java.time.Period;

public class komand {
    public static void main(String[] args) {
        SportsmanInfo[] team = new SportsmanInfo[5];
        team[0] = new Goalkeeper("Nurtilek", "Askarov", LocalDate.of(2006, 6, 20), 168, 52);
        team[1] = new Forward("Kandybek", "Kadyrov", LocalDate.of(2006, 2, 12), 165, 53);
        team[2] = new Forward("Bilal", "Sharapov", LocalDate.of(2003, 12, 25), 175, 65);
        team[3] = new Coach("axs","asxsa");

        for (SportsmanInfo sportsman : team) {
//            sportsman.displayInfo();
            System.out.println(sportsman);
        }
    }
}
