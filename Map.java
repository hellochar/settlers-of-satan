// Initialization class for the map
// Assuming standard size is 1000x600

import java.util.ArrayList
import java.util.HashMap

class Map {

    ArrayList<Face> faces = new ArrayList(18);
    float gridHeight;
    float gridWidth;
    float edgeLength;
    float distanceFromCenterToEdgeMidpoint;

    public Map () {
       calculateHexagon(centerOfGrid, 0); 
    } 

    private void calculateHexagon(Point centerPoint) {
    }

    private float calculateEdgeLength(float gridHeight) {
       return gridHeight/(10 * Math.sin(60));
    }

    private float calculateGridWidth(float gridHeight) {
        return (3 * gridHeight/10) * ((2/Math.tan(60)) + (1/sin(60)));
    }

    private float calculateDistanceToEdgeMidpointFromCenter(float edgeLength) {
        return edgeLength * Math.tan(60) * .5
    }



    
