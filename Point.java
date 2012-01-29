//Point class for representing points on the map

class Point {
    float x;
    float y;

    public Point(float x-value, float y-value) {
        this.x = x-value;
        this.y = y-value;
    }
    
    public static Point (Point point1, Point point2) {
        return Point(point1.x + point2.y, point1.y + point2.y);
    }

