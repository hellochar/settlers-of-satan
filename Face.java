//Face class for Settlers of Satan Map.


class Face {
    int id; // Reference id for the face 
    Resource res; // Resources associated with the tile
    ArrayList<Edge> edges = new ArrayList(6); //ArrayList of edges associated with the face
    ArrayList<Corner> corners = new ArrayList(6); // ArrayList of verticies adjacent to the faces
    HashMap graphicsInfo; //Hashtable of information for the GUI
    float sideLength = 69.28;
    float radius = 60;

    public Face(Point centerPoint int id) {
        for(int i = 0; i<=6; i++) {
            float angle = 2*Math.PI/3
            corners.add(i, new Corner());
    }
    
