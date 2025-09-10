
import mil.nga.mgrs.MGRS;
import mil.nga.grid.features.Point;   // <-- IMPORTANT


public class Layer {
    public static void main(String[] args) {
    

double latitude = 51.5074;   // London approximate
double longitude = -0.1278;

// Create a Point from the lat/lon (Longitude, Latitude)
Point point = Point.point(longitude, latitude);

// Convert to MGRS
MGRS mgrs = MGRS.from(point);

// Default string
System.out.println("MGRS (default): " + mgrs.toString());


        
    }
}

