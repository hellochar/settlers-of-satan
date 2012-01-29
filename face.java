//Face class for Settlers of Satan Map.

import java.util.HashMap
import java.util.ArrayList

Face {
    int id; // Reference id for the face 
    Resource res; // Resources associated with the tile
    ArrayList edges; //ArrayList of edges associated with the face
    ArrayList vertices; // ArrayList of verticies adjacent to the faces
    HashMap graphicsInfo; //Hashtable of information for the GUI
