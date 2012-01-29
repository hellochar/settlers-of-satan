
import java.util.HashMap

class Point {

    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

class coordinates {
    float side_length = 69.28;
    float radius = 60; // Side length is defined as distance from center to midpoint of edge 
    float angle = Math.PI/2;
    int inner = 1;
    int outer = 8;
    HashMap pointDict = new HashMap();

    public static void main(String[] args) {

        for(int i = 0; i<=6;i++) {
            pointDict.put(Integer.toString(inner), this.first(2, angle));
            pointDict.put(Integer.toString(outer), this.first(4, angle));
            angle -= Math.PI/12;
            outer += 1;
            pointDict.put(Integer.toString(outer), this.second(angle));
            inner += 1;
            outer += 1;
            angle -= Math.PI/12;
        }


    public float first(int num, float angle) {
        return num * this.radius * 

