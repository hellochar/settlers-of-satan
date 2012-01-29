// Vertex class for Settlers of Satan map

import java.util.ArrayList;
import java.util.HashMap;

class Corner {
    int id;
    ArrayList<Edge> edges; // ArrayList of edges 
    ArrayList<Face> faces; //ArrayList of faces
    boolean isPort;
    HashMap graphicsInfo; 
    Point centerPoint;

    public Corner(Point point) {
        centerPoint = point
    }

    public boolean equals(Corner other){
        return (this.centerPoint.equals(other.centerPoint));
    }
}


