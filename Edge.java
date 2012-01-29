//Edge class for the map

import java.util.ArrayList;
import java.util.HashMap;

class Edge {
    int id;
    ArrayList<Corner> corners; // ArrayList of the faces 
    ArrayList<Face> faces; //ArrayList of the faces
    HashMap graphicsInfo; //Hashtable of the information for GUI
    Point firstPoint;
    Point midPoint;
    Point lastPoint;

    public Edge(Point fPoint, Point mPoint, Point lPoint){
    }
}


