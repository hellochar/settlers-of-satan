//Face class for Settlers of Satan Map.

import java.util.ArrayList;
import java.util.HashMap;

class Face {
    int id; // Reference id for the face 
    ArrayList<Edge> edges = new ArrayList<Edge>(6); //ArrayList of edges associated with the face
    ArrayList<Corner> corners = new ArrayList<Corner>(6); // ArrayList of verticies adjacent to the faces
    HashMap graphicsInfo; //Hashtable of information for the GUI
    float sideLength = (float) 69.28;
    float radius = (float) 60;
    Point center;

    public Face(Point centerPoint, int id) {
        center = centerPoint;
        for(int i = 0; i<=6; i++) {
            float angle = (float) (2*Math.PI/3);
            corners.add(i, new Corner(this.calculateCorner(center, angle)));
            angle -= (float) (Math.PI/12);
        }


        for(int i = 0; i<=6; i++) {
            float angle = (float) (Math.PI/2);
            edges.add(i, new Edge(calculateCorner(center, (float) (angle-Math.PI/6)), calculateEdgeMidpoint(center, angle), calculateCorner(center, (float) (angle+Math.PI/6))));
            angle -= (float) (Math.PI/4);
        }

    }
    

    public Point calculateCorner(Point point, float angle) {
        return new Point((float)(sideLength * Math.cos(angle) + point.x),(float) (sideLength * Math.sin(angle) + point.y));
    }

    public Point calculateEdgeMidpoint(Point point, float angle) {
        return new Point((float) (radius * Math.cos(angle) + point.x), (float) (radius * Math.sin(angle) + point.y));
    }
}
    


    
