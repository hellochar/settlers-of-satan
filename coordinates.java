
import java.util.HashMap;

public class coordinates {

    public static HashMap centerCoordinates() {
        final float side_length = (float) 69.28;
        final float radius = (float) 60; // Side length is defined as distance from center to midpoint of edge 
        float angle = (float) Math.PI/2;
        int inner = 1;
        int outer = 8;
        HashMap pointDict = new HashMap();


        


        for(int i = 0; i<=6;i++) {
            pointDict.put(Integer.toString(inner), new Point(2, angle));
            pointDict.put(Integer.toString(outer), new Point(4, angle));

            angle -= Math.PI/6;
            outer += 1;

            pointDict.put(Integer.toString(outer), new Point(angle));

            inner += 1;
            outer += 1;
            angle -= Math.PI/6;
        }

        return pointDict;
    }
    
    
}
