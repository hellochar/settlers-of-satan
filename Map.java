// Initialization class for the map
// Assuming standard size is 1000x600

import java.util.ArrayList;
import java.util.HashMap;

class Map {

    ArrayList<Face> faces = new ArrayList<Face>(19);
    float gridHeight;
    float gridWidth;
    float edgeLength;
    float distanceFromCenterToEdgeMidpoint;
    Point centerOfGrid;

    public static Map generate() {
        return new Map();
    }


    public Map () {
       HashMap hexagonCenterPoints = coordinates.centerCoordinates(); 
       for (int i = 1; i<=19; i++) {
            faces.add(this.calculateHexagon((Point)hexagonCenterPoints.get(Integer.toString(i)), i));
       }

    } 

    private Face calculateHexagon(Point centerPoint, int id) {
        return new Face(centerPoint, id);
    }

    private float calculateEdgeLength(float gridHeight) {
       return gridHeight/(float)(10 * Math.sin(60));
    }

    private float calculateGridWidth(float gridHeight) {
        return (float)((3 * gridHeight/10) * ((2/Math.tan(60)) + (1/Math.sin(60))));
    }

    private float calculateDistanceToEdgeMidpointFromCenter(float edgeLength) {
        return (float)(edgeLength * Math.tan(60) * .5);
    }
}




    
