package cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        var random = new Random();
        var viewers = new ArrayList<Viewer>();
        for (int i = 0; i < 5; i++) {
            var film1 = new Cinema("Film " + random.nextInt(10), "Genre " + random.nextInt(5), random.nextInt(1, 3));
            var film2 = new Cinema("Film " + random.nextInt(10), "Genre " + random.nextInt(5), random.nextInt(1, 3));
            var viewer = new Viewer("Name " + (i + 1), random.nextInt(14, 50), List.of(film1, film2));
            viewers.add(viewer);
        }
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
