package cinema;

import java.util.List;
import java.util.Objects;

public class ViewerStatistics {

    public static double averageAge(List<Viewer> viewers) {
        if (viewers != null && !viewers.isEmpty()) {
            return viewers
                    .stream()
                    .filter(Objects::nonNull)
                    .map(Viewer::getAge)
                    .reduce(0, Integer::sum) / (double) viewers.size();
        } else return 0;
    }
}
