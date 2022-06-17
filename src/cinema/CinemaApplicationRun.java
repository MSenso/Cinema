package cinema;

import java.util.ArrayList;
import java.util.Random;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        var random = new Random();
        var viewers = new ArrayList<Viewer>();
        for(int i = 0; i < 5; i++) {
            var viewer = new Viewer("Name " + (i +1), random.nextInt(14, 50), random.nextInt(0, 20));
            viewers.add(viewer);
        }
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
