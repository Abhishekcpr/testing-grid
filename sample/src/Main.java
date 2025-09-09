import mil.nga.mgrs.MGRS;
import mil.nga.grid.features.Point;

public class Main {
    public static void main(String[] args) {
        double latitude = 28.6139;   // New Delhi
        double longitude = 77.2090;

        // Create a Point (x = longitude, y = latitude)
        Point point = Point.point(longitude, latitude);

        // Convert to MGRS
        MGRS mgrs = MGRS.from(point);

        System.out.println("MGRS: " + mgrs.toString());
    }
}
