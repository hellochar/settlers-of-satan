
import java.util.HashMap;

public class coordinates {

    public static HashMap centerCoordinates() {
        final double side_length = 69.28;
        final double radius = 60; // Side length is defined as distance from center to midpoint of edge 
        double angle = Math.PI/2;
        int inner = 1;
        int outer = 8;
        HashMap pointDict = new HashMap();


        class Point {

            double x;
            double y;


            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public Point(int num, double angle) {
		this.x = num * radius * Math.cos(angle);
		this.y = num * radius * Math.sin(angle);
            }

	    public Point(double angle){
                this.x = (2 * radius + side_length) * Math.cos(angle);
		this.y = (2 * radius + side_length) * Math.sin(angle);

            }

	    public String toString(){
		return "(".concat(Double.toString(this.x)).concat(", ").concat(Double.toString(this.y)).concat(")");
	    }

        }


        for(int i = 0; i<=6;i++) {
            pointDict.put(Integer.toString(inner), new Point(2, angle));
            pointDict.put(Integer.toString(outer), new Point(4, angle));

            angle -= Math.PI/12;
            outer += 1;

            pointDict.put(Integer.toString(outer), new Point(angle));

            inner += 1;
            outer += 1;
            angle -= Math.PI/12;
        }

        return pointDict;
    }
    
    
}
