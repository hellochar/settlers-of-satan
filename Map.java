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

    public Map () {
       calculateHexagon(centerOfGrid); 
    } 

    private void calculateHexagon(Point centerPoint) {
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




    
