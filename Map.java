// Initialization class for the map

class Map {

    ArrayList<Face> faces;
    ArrayList<Edge> edges;
    ArrayList<Vertex> vertices;

    public Map () {
    }

    private float calculateHexagonLength(float gridHeight) {
       return gridHeight/(10 * Math.sin(60));
    }

    private float calculateGridWidth(float gridHeight) {
        return (3 * gridHeight/10) * ((2/Math.tan(60)) + (1/sin(60)));
    }


    
